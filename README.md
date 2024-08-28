
```markdown
# Store API

API para gerenciar produtos. Esta aplicação é construída com Spring Boot e PostgreSQL e usa Docker e Docker Compose para o setup.

## Pré-requisitos

- Docker
- Docker Compose

## Configuração

1. Clone o repositório:
   ```bash
   git clone https://github.com/exemplo/store-api.git
   cd store-api
   ```

2. Construa e inicie os containers com Docker Compose:
   ```bash
   docker-compose up --build
   ```

3. A API estará disponível em `http://localhost:8080`.

## Endpoints

- `GET /api/produtos` - Listar todos os produtos.
- `GET /api/produtos/{id}` - Obter produto por ID.
- `POST /api/produtos` - Criar um novo produto.
- `PUT /api/produtos/{id}` - Atualizar um produto existente.
- `DELETE /api/produtos/{id}` - Deletar um produto.

## Testando a API

Você pode usar ferramentas como `curl` ou `Postman` para testar os endpoints.

Exemplo usando `curl`:

```bash
curl -X POST -H "Content-Type: application/json" -d '{"

"nome": "Produto A", "descricao": "Descrição do Produto A", "valor": 100.00}' http://localhost:8080/api/produtos
```

### 7. Executando e Testando

Para executar e testar a API, siga as instruções no README.md. Você pode interagir com a API usando ferramentas como Postman, cURL, ou qualquer cliente HTTP de sua preferência para realizar operações CRUD na entidade "Produto".
