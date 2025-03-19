# Sistema de Gerenciamento de Livros para uma Biblioteca

## Descrição

Este projeto é o CheckPoint 1, primeira avaliação do primeiro semestre do segundo ano da faculdade de análise e desenvolvimento de sistemas da FIAP.

O projeto consiste em um sistema de gerenciamento de livros para uma biblioteca, desenvolvido utilizando Java com Spring Boot. Ele fornece uma API REST para gerenciar livros, permitindo operações como adição, atualização, remoção e busca de livros com suporte a paginação.


## Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- Hibernate
- Banco de Dados H2 (ambiente de desenvolvimento)
- Maven
- Spring Validation
- Spring Web
- Spring DevTools
- Lombok

## Funcionalidades

- **Gerenciamento de Livros**:
  - Adicionar um novo livro.
  - Listar todos os livros com paginação.
  - Buscar livros por título com paginação.
  - Buscar um livro pelo ID.
  - Atualizar um livro existente.
  - Deletar um livro pelo ID.
- **Validação de Dados**:
  - Utiliza anotações do Spring Validation para garantir a integridade dos dados.
- **Tratamento de Exceções**:
  - Implementa `LivroNaoEncontradoException` para indicar livros inexistentes.
  - Utiliza `@ControllerAdvice` para tratamento global de exceções.
- **Persistência de Dados**:
  - Utiliza banco de dados H2 para desenvolvimento.
  - Script `data.sql` para população inicial dos dados.

## Como Executar

1. Clone o repositório:
   ```sh
   git clone https://github.com/gabrielmarcello/gerenciamento-biblioteca-api
   ```
2. Acesse o diretório do projeto:
   ```sh
   cd gerenciamento-biblioteca-api
   ```
3. Compile e execute a aplicação:
   ```sh
   mvn spring-boot:run
   ```
4. A API estará disponível em:
   ```sh
   http://localhost:8080
   ```

## Endpoints

| Método | Endpoint                          | Descrição                   |
| ------ | ----------------------------------| --------------------------- |
| GET    | /livros/{id}                      | Busca um livro pelo ID      |
| GET    | /livros/livro?titulo=titulolivro  | Lista livros com paginação  |
| GET    | /livros                           | Busca livros por título     |
| POST   | /livros                           | Adiciona um novo livro      |
| PUT    | /livros/{id}                      | Atualiza um livro existente |
| DELETE | /livros/{id}                      | Deleta um livro pelo ID     |

## Autor

Desenvolvido por Gabriel Marcello - [https://www.linkedin.com/in/gabriel-marcello-665098286/] [https://github.com/gabrielmarcello]


