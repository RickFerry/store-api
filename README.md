
```markdown
## Executando a Aplicação

Para rodar a aplicação, certifique-se de que você tenha Docker e Docker Compose instalados.

1. **Clone o repositório**:

   ```bash
   git clone https://github.com/seu-usuario/produto-api.git
   cd produto-api
   ```

2. **Construa e inicie os containers**:

   ```bash
   docker-compose up --build
   ```

3. **Acesse a aplicação**:

   A aplicação estará disponível em `http://localhost:8080/api/produtos`. Você precisará se autenticar usando o usuário e senha configurados (`admin` e `password`).

## Testando Endpoints

Use `curl`, Postman, ou qualquer cliente HTTP para testar os endpoints da API.

- **GET** todos os produtos:

  ```bash
  curl -u admin:password http://localhost:8080/api/produtos
  ```

- **GET** produto por ID:

  ```bash
  curl -u admin:password http://localhost:8080/api/produtos/{id}
  ```

- **POST** criar novo produto:

  ```bash
  curl -u admin:password -X POST -H "Content-Type: application/json" -d '{"nome": "Produto 1", "descricao": "Descrição", "valor": 100.0}' http://localhost:8080/api/produtos
  ```

- **PUT** atualizar produto:

  ```bash
  curl -u admin:password -X PUT -H "Content-Type: application/json" -d '{"nome": "Produto Atualizado", "descricao": "Nova Descrição", "valor": 150.0}' http://localhost:8080/api/produtos/{id}
  ```

- **DELETE** produto:

  ```bash
  curl -u admin:password -X DELETE http://localhost:8080/api/produtos/{id}
  ```

## Logging

Todos os logs da aplicação serão exibidos no console. Para modificar os níveis de logging, ajuste o arquivo `logback-spring.xml`.
```
