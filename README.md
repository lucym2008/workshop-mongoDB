# API REST com Spring Boot e MongoDB - Projeto de Estudo de Rede Social (Posts e Comentários)

[![Java](https://img.shields.io/badge/Java-17%2B-blue)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0-brightgreen)](https://spring.io/projects/spring-boot)
[![MongoDB](https://img.shields.io/badge/MongoDB-NoSQL-green)](https://www.mongodb.com/)
[![Maven](https://img.shields.io/badge/Maven-Build-orange)](https://maven.apache.org/)

📧 Contato
Leonardo Machado Arroyo - leonardomachadoarroyo14@example.com

LinkedIn: https://www.linkedin.com/in/leonardo-machado-arroyo/

## 📋 Sobre o Projeto

Este projeto é uma API REST desenvolvida durante o curso "Java COMPLETO 2023 Programação Orientada a Objetos" do professor Nélio Alves (Udemy), com foco na integração do Spring Boot com o banco de dados NoSQL **MongoDB**.

O domínio da aplicação simula uma **rede social simplificada**, onde usuários podem criar posts e receber comentários. Diferente dos bancos relacionais, o MongoDB permite uma modelagem mais flexível e aninhada, o que foi explorado ao máximo neste projeto para representar posts com seus respectivos comentários de forma eficiente.

## 🚀 Funcionalidades

*   **Gestão de Usuários:** Operações de CRUD completas para usuários (criar, listar, buscar por ID, atualizar, deletar).
*   **Gestão de Posts:** Criação e recuperação de posts associados a usuários.
*   **Sistema de Comentários:** Posts podem conter múltiplos comentários (modelagem aninhada, aproveitando a estrutura de documentos do MongoDB).
*   **Consultas Personalizadas:**
    *   Busca de posts por título contendo um texto específico (usando `@Query`).
    *   Consulta com múltiplos critérios: busca de posts por título, data mínima, data máxima e autor.
*   **Projeção com DTOs:** Uso do padrão Data Transfer Object para devolver apenas os dados necessários das entidades (ex: apenas nome e id do autor de um post).

## 🛠️ Tecnologias e Conceitos Utilizados

*   **Java 17:** Utilização dos recursos modernos da linguagem.
*   **Spring Boot 3:** Criação e configuração da aplicação.
*   **Spring Data MongoDB:** Integração com o banco MongoDB, simplificando operações de persistência.
*   **MongoDB:** Banco de dados NoSQL orientado a documentos.
*   **MongoDB Compass:** Ferramenta gráfica para administração e visualização dos dados.
*   **Padrão DTO (Data Transfer Object):** Para controlar quais dados são expostos nas respostas da API, evitando problemas como referências cíclicas e melhorando a segurança.
*   **Query Methods:** Criação de consultas personalizadas no repositório seguindo a nomenclatura do Spring Data.
*   **@Query:** Utilização da anotação para consultas mais complexas com JSON (MongoDB JSON Query).
*   **Modelagem de Domínio em Banco NoSQL:**
    *   **Referência:** Usuários referenciam seus posts (mas não carregam automaticamente).
    *   **Embedding (Aninhamento):** Comentários são embedados dentro dos posts, aproveitando a característica de documentos do MongoDB.

## ⚙️ Como Executar o Projeto Localmente

### Pré-requisitos
*   Java 17 ou superior instalado.
*   Maven instalado.
*   MongoDB instalado e rodando localmente (ou Docker com MongoDB).
*   Git instalado.

### Passos

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/lucym2008/workshop-mongoDB.git
