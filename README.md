# Sistema cadastro de alimentos e gerador de receitas!

Bem-vindo ao MagicFridgeAI!
Este projeto é uma aplicação de arquitetura em camadas desenvolvida com Spring Boot, projetada para cadastrar alimentos em uma geladeira que posteriormente vai gerar uma receita com os alimentos no banco de dados. O projeto utiliza H2 como banco de dados em memória, Flyway para migrações de banco de dados e segue boas práticas de desenvolvimento de software como controle de versão com Git e hospedagem de repositório no GitHub.


---
## 📦 Estrutura do Projeto
```
/
├─ src
│  ├─ config/
│  │  ├─ WebClientConfig
│  │
│  ├─ controller/
│  │  ├─ FoodItemController
│  │  ├─ IAController
│  │
│  ├─ DTO/
│  │  ├─ FoodItemRequestDTO
│  │  ├─ FoodItemResponseDTO
│  │
│  ├─ mapper/
│  │  ├─ FoodItemMapper
│  │  ├─ FoodItemUpdate 
│  │
│  ├─ model/
│  │  ├─ CategoryFood
│  │  ├─ FoodItem
│  │
│  ├─ repository/
│  │  ├─ FoodItemRepository
│  │
│  ├─ service/
│  │  ├─ FoodItemService
│  │  ├─ IAService
│  │
│  ├─ MagicFrigdeIaApplication.java
```

---
## Tecnologias Utilizadas
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![WebFlux](https://img.shields.io/badge/WebFlux-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![WebClient](https://img.shields.io/badge/WebClient-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![H2 Database](https://img.shields.io/badge/H2%20Database-40616D?style=for-the-badge&logo=h2&logoColor=white)
![Flyway](https://img.shields.io/badge/Flyway-CC0F43?style=for-the-badge&logo=flyway&logoColor=white)
![JPA](https://img.shields.io/badge/JPA-E67824?style=for-the-badge&logo=hibernate&logoColor=white)
![Gemini](https://img.shields.io/badge/Google%20Gemini-4285F4?style=for-the-badge&logo=google&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)
![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![SQL](https://img.shields.io/badge/SQL-303E48?style=for-the-badge&logo=postgresql&logoColor=white)
---

## Configuração
1. Clone o repositório:
   ```bash
   git@github.com:Braian-Zignago/MagicFridgeAI.git
    ```
2. Navegue até o diretório do projeto:
   ```bash
   cd MagicFridgeAI
   ```
3. Configure as variaveis de ambiente no arquivo `application.properties` e também no IntelliJ. <br><br>

4. Construa o projeto:
   ```bash
    mvn clean install
    ```
5. Execute a aplicação:
    ```bash
     mvn spring-boot:run
     ```
6. Acesse a aplicação:
   ```
     http://localhost:8080
   ```
---

