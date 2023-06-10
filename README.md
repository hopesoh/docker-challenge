![postech.png](postech.png)

# Objetivo
Criar uma aplicação web utilizando Docker e suas principais funcionalidades, como docker network e docker compose.

# Descrição
É necessário criar uma aplicação web simples, que apenas acesse um banco de dados e retorne uma lista de linguagens de 
programação. Essas linguagens podem ser pré-carregadas no banco de dados. O banco de dados escolhido deve ser executado 
também em container e a conexão entre aplicação e o container deve acontecer utilizando uma Docker network. A aplicação 
deverá ser executada em um container docker, uma imagem deve ser gerada utilizando o Dockerfile e publicada no DockerHub 
de forma pública. Com a imagem publicada no Docker Hub, deverá ser criado um arquivo Docker Compose para orquestrar toda 
a configuração dos serviços, redes e variáveis de ambiente necessárias.

# Entregáveis
- Link público do repositório com aplicação e seu Dockerfile;
- No README desse repositório, deverá conter o passo a passo para execução da aplicação utilizando container, isto é, 
- qualquer configuração ou variáveis necessárias deverão estar descritas; e
- O arquivo docker-compose.yml com a orquestração necessária para executar a aplicação utilizando a imagem pública 
- postada no DockerHub.

# Projeto
- Imagem no [DockerHub](https://hub.docker.com/repository/docker/saribeiro/docker-challenge/general)

- Rodar `git clone git@github.com:hopesoh/docker-challenge.git`
- Rodar `docker-compose up --build`
- Acessar http://localhost:8080/list para listar as linguagens salvas
- Rodar `curl http://localhost:8080/add -d name=<NOME_DA_LINGUAGEM>` para adicionar novas linguagens
- Como acessar o banco em pé: `docker-compose exec  mysql mysql -uroot -pverysecret mydatabase`

# Úteis
- [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
- [Can't create db in docker-entrypoint-initdb.d with mysql docker container](https://stackoverflow.com/questions/61092403/cant-create-db-in-docker-entrypoint-initdb-d-with-mysql-docker-container)
- [Setting Up a MySQL Database in Docker](https://betterprogramming.pub/setting-up-mysql-database-in-a-docker-d6c69a3e9afe)
- [Docker-compose mysql: import .sql](https://stackoverflow.com/questions/42136931/docker-compose-mysql-import-sql)
- [MySQL init script on Docker compose](https://iamvickyav.medium.com/mysql-init-script-on-docker-compose-e53677102e48)
- [Hibernate-sequence doesn't exist](https://stackoverflow.com/questions/32968527/hibernate-sequence-doesnt-exist)
- [docker-compose: difference run, exec and what happens to the layers](https://stackoverflow.com/questions/65100572/docker-compose-difference-run-exec-and-what-happens-to-the-layers)
- [PósTech](https://on.fiap.com.br/local/salavirtual/conteudo-digital.php)
- `docker system prune -a`
- [Use Docker Compose](https://docs.docker.com/get-started/08_using_compose/#:~:text=Docker%20Compose%20is%20a%20tool,or%20tear%20it%20all%20down.)
- [Difference Between Docker, Dockerfile, and Docker Compose](https://www.baeldung.com/ops/docker-dockerfile-docker-compose)