# personal-trainer-backend  
🏋️‍♂️ Projeto Personal Trainer – Backend API  

Este repositório contém a implementação completa do back-end RESTful em Java para o sistema **Personal Trainer**, um aplicativo de gerenciamento de treinos e acompanhamento físico.

---

## 📦 Estrutura da API

### Endpoints de Autenticação
| Endpoint         | Método | Descrição                              |
|------------------|--------|----------------------------------------|
| `/auth/register` | POST   | Cadastra novo usuário (atleta ou prof) |
| `/auth/login`    | POST   | Gera token JWT para acesso             |

### Endpoints CRUD principais
| Recurso           | Métodos                  | Descrição                              |
|-------------------|--------------------------|----------------------------------------|
| `/atletas`        | GET, POST, PUT, DELETE   | Gerencia perfis de atletas             |
| `/profissionais`  | GET, POST, PUT, DELETE   | Gerencia perfis de profissionais       |
| `/exercicios`     | GET, POST, PUT, DELETE   | Catálogo de exercícios                 |
| `/cardapios`      | GET, POST, PUT, DELETE   | Dietas e cardápios recomendados        |
| `/treinos`        | GET, POST, PUT, DELETE   | Planos de treino personalizados        |

---
## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java 17  
- **Framework:** Spring Boot 3.1.0  
- **Persistência:** Spring Data JPA, H2 Database (in-memory)  
- **Segurança:** Spring Security, JSON Web Token (jjwt)  
- **Mapeamento:** Lombok (getter/setter/constructors)  
- **Build & Dependências:** Maven (spring-boot-maven-plugin)  

---

## 📄 Arquivos Importantes

| Arquivo / Pasta                                 | Descrição                                  |
|-------------------------------------------------|--------------------------------------------|
| **pom.xml**                                     | Define dependências e plugins Maven        |
| **src/main/resources/application.properties**   | Configura porta, H2 (in-memory) e JWT      |
| **src/main/java/.../controllers/**              | Endpoints REST                             |
| **src/main/java/.../models/**                   | Entidades JPA                              |
| **src/main/java/.../services/**                 | Lógica de negócio                          |
| **src/main/java/.../security/**                 | Filtros e utilitários JWT (Spring Security)|

## 🚀 Como Usar

1. **Clone o repositório**  
   ```bash
   git clone https://github.com/SEU_USUARIO/personal-trainer-backend.git
   cd personal-trainer-backend


## 🗂️ Estrutura de Pastas

```plaintext
personal-trainer-backend/
├── pom.xml
├── README.md
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── personaltrainer
    │   │           ├── controllers
    │   │           │   ├── AuthController.java
    │   │           │   ├── AtletaController.java
    │   │           │   ├── ProfissionalController.java
    │   │           │   ├── ExercicioController.java
    │   │           │   ├── CardapioController.java
    │   │           │   └── TreinoController.java
    │   │           ├── models
    │   │           │   ├── User.java
    │   │           │   ├── Atleta.java
    │   │           │   ├── Profissional.java
    │   │           │   ├── Exercicio.java
    │   │           │   ├── Cardapio.java
    │   │           │   └── Treino.java
    │   │           ├── services
    │   │           │   ├── UserService.java
    │   │           │   ├── AtletaService.java
    │   │           │   ├── ProfissionalService.java
    │   │           │   ├── ExercicioService.java
    │   │           │   ├── CardapioService.java
    │   │           │   └── TreinoService.java
    │   │           └── security
    │   │               ├── JwtAuthenticationFilter.java
    │   │               ├── JwtProvider.java
    │   │               └── SecurityConfig.java
    │   └── resources
    │       └── application.properties
    └── test
        └── java
            └── com
                └── personaltrainer
                    ├── controllers
                    │   └── (Classes de teste)
                    └── services
                        └── (Classes de teste)        
