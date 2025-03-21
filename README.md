## Cadastro de produtos em um banco de dados MySQL 

Microserviço desenvolvido em Java e Spring Boot para organização e gerenciamento de produtos em um banco de dados MySQL. Cada novo produto adicionado recebe um Id, nome, preço e quantidade.
Ele oferece operações básicas de CRUD.

# Tecnologias utilizadas

- Java 17
- Swagger para documentação dos ENDPOINTS
- Spring Boot 3.4.3
- MySQL 8.0
- Docker 27.5.1
- Maven 4.0.0
- Lombok
- Postman

# Documentação

A documentação dos ENDPOINTS foi feita utilizando o Swagger

# Estrutura da aplicação

- src/main/java: Código fonte da aplicação
  - com.productmicroservice.Product_MS
  - controller
  - entity
  - repository
  - service
- resources
  - application.properties
- src/test/java: Código de teste

# Configuração do banco de dados

O projeto utiliza o banco de dados MySQL para o armazenamento de novos produtos.

# Endpoints da API

- POST/addProduct: Adiciona um novo produto.
- POST/addProducts: Adiciona uma lista de produtos
- GET/Products: Retorna uma lista de produtos
- GET/product/{id}: Retorna um produto com um id específico
- GET/produt/{name}: Retorna um produto com um nome específico
- PUT/update: Atualiza um produto existente
- DELETE/delete/{id}: Deleta um produto de id específico
