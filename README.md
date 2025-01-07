# People
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/WelingtonFranzoso/franzoso-agregador-de-investimentos/blob/main/LICENSE) 

# Sobre o projeto

Este projeto é uma aplicação backend desenvolvida com Spring Boot. Atualmente, ele oferece um CRUD simples para o gerenciamento de pessoas. O projeto foi desenvolvido para fins de estudo, e a ideia é ir adicionando mais funcionalidades à medida que o aprendizado avança.
O banco de dados utilizado é o PostgreSQL, que é executado dentro de um container Docker juntamente com o PgAdmin para facilitar o gerenciamento do banco de dados.

# Funcionalidades
- CRUD basico de uma pessoa


# Tecnologias utilizadas
- Spring Boot: Framework Java para desenvolvimento de aplicações backend.
- PostgreSQL: Banco de dados relacional.
- PgAdmin: Ferramenta gráfica para gerenciamento do PostgreSQL.
- Docker: Utilizado para containerizar o banco de dados PostgreSQL.

# Como executar o projeto
## Back end
### Pré-requisitos: 
- Java 17 ou superior
- Docker (para executar o banco de dados PostgreSQL em um container)
- Maven (para construção do projeto)


```bash
# clonar repositório
git clone git@github.com:WelingtonFranzoso/people.git

# entrar na pasta do projeto back end
cd people

# executar o projeto
./mvnw spring-boot:run
```
### Docker: Configuração do PostgreSQL e PgAdmin
O projeto já está configurado para rodar o PostgreSQL em um container Docker. Para isso, basta garantir que o Docker esteja instalado e em funcionamento. O Docker irá gerenciar o banco de dados de forma transparente.

### Acessando o PgAdmin
Para acessar o PgAdmin, você pode navegar até http://localhost:5050 e usar as credenciais padrão:

- Email: admin@admin.com
- Senha: admin

Lá você poderá gerenciar o banco de dados PostgreSQL utilizado pela aplicação.

# Autor

Welington Franzoso
https://www.linkedin.com/in/welington-franzoso-88a8301b9
