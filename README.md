# 🍽️ Cardápio Digital

Sistema de Cardápio Digital desenvolvido com **React** no frontend e **Spring Boot** no backend. Ideal para restaurantes, lanchonetes ou food trucks que desejam apresentar seus produtos de forma moderna e organizada.

## 🛠 Tecnologias Utilizadas

### Frontend
- [React](https://reactjs.org/)
- [TypeScript](https://www.typescriptlang.org/)
- [Vite](https://vitejs.dev/)
- [Tailwind CSS](https://tailwindcss.com/)
- [React Query](https://tanstack.com/query/latest)
- [Axios](https://axios-http.com/)

### Backend
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Java 17+](https://openjdk.org/projects/jdk/17/)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [H2 Database](https://www.h2database.com/html/main.html) (ou outro banco que você usar)
- [Lombok](https://projectlombok.org/)

## 📁 Estrutura do Projeto

Cardapio/
├── cardapio-api/ # Backend (Spring Boot)
│ └── src/main/java/com/votacao_api
│ ├── Controller/
│ ├── Entidade/
│ ├── Repository/
│ ├── Service/
│ └── ...
├── cardapio-front-end/ # Frontend (React + Tailwind)
│ ├── src/
│ │ ├── Components/
│ │ ├── Hooks/
│ │ └── ...
└── README.md



## 🚀 Como Executar o Projeto

### Pré-requisitos

- Node.js 18+
- Java 17+
- Git📦 Endpoints da API
GET /food – Lista todos os itens do cardápio

POST /food – Cadastra um novo item

PUT /food/{id} – Atualiza um item

DELETE /food/{id} – Remove um item

📷 Exemplo de Dados
json
Copiar
Editar
{
  "price": 40,
  "title": "Pizza Calabresa",
  "image": "https://exemplo.com/imagem-da-pizza.jpg"
}
✨ Funcionalidades
 Listagem de produtos

 Exibição de imagem, nome e preço

 Autenticação de administrador (em breve)

 Edição e remoção via interface (em breve)

📌 TODO
Autenticação com JWT

Upload de imagens

Integração com banco de dados em nuvem

Interface de painel administrativo

🧑‍💻 Autor
Desenvolvido por Andrey Matos



### 1. Clonar o repositório

```bash
git clone https://github.com/andreyyrson/Cardapio.git
cd Cardapio

### 2. entrar no repositório
cd cardapio-api
./mvnw spring-boot:run
###





