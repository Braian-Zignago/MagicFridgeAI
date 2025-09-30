package dev.java10x.MagicFrigdeIA.service;

import dev.java10x.MagicFrigdeIA.DTO.FoodItemResponseDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service
public class IAService {

    private final WebClient webClient;

    private final String API_KEY = System.getenv("GEMINI_API_KEY");

    public IAService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<String> generateRecipe(List<FoodItemResponseDTO> foodItems) {

        String food = foodItems.stream()
                .map(item -> String.format("%s (%s) - Quantity: %d, Exp Date: %tF",
                        item.getName(),
                        item.getCategory(),
                        item.getQuantity(),
                        item.getExpirationDate()))
                .collect(Collectors.joining("\n"));

        String prompt = "Quero que me sugira receitas baseadas nos seguintes ingredientes que tenho na minha geladeira." +
                " Quero que considere a data de validade para sugerir receitas que usem ingredientes que estão prestes a vencer. " +
                "Por favor, forneça a receita em português e inclua a lista de ingredientes e o modo de preparo. " +
                "Aqui estão os ingredientes:\n" + food;


        Map<String, Object> requestBody = Map.of(
                "contents", Map.of(
                        "parts", Map.of(
                                "text", prompt
                        )
                )
        );

        return webClient.post()
                .header("x-goog-api-key", API_KEY)
                .header(HttpHeaders.CONTENT_TYPE, "application/json")
                .bodyValue(requestBody)
                .retrieve()
                .bodyToMono(Map.class)
                .map(response -> {
                    var candidates = (List<Map<String, Object>>) response.get("candidates");
                    if (candidates != null && !candidates.isEmpty()) {
                        Map<String, Object> candidate = candidates.get(0);
                        Map<String, Object> content = (Map<String, Object>) candidate.get("content");
                        var parts = (List<Map<String, Object>>) content.get("parts");
                        if (parts != null && !parts.isEmpty()) {
                            return parts.get(0).get("text").toString();
                        }
                    }

                    // Si no se encuentra el texto o hay error en la estructura
                    return "Nenhuma receita foi gerada (Erro na resposta da API Gemini).";
                });
    }
}
