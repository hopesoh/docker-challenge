![postech.png](postech.png)

## Objetivo
Criar uma aplicação web utilizando Docker e suas principais funcionalidades, como docker network e docker compose.

## Descrição
É necessário criar uma aplicação web simples, que apenas acesse um banco de dados e retorne uma lista de linguagens de 
programação. Essas linguagens podem ser pré-carregadas no banco de dados. O banco de dados escolhido deve ser executado 
também em container e a conexão entre aplicação e o container deve acontecer utilizando uma Docker network. A aplicação 
deverá ser executada em um container docker, uma imagem deve ser gerada utilizando o Dockerfile e publicada no DockerHub 
de forma pública. Com a imagem publicada no Docker Hub, deverá ser criado um arquivo Docker Compose para orquestrar toda 
a configuração dos serviços, redes e variáveis de ambiente necessárias.

## Entregáveis
- Link público do repositório com aplicação e seu Dockerfile;
- No README desse repositório, deverá conter o passo a passo para execução da aplicação utilizando container, isto é, 
- qualquer configuração ou variáveis necessárias deverão estar descritas; e
- O arquivo docker-compose.yml com a orquestração necessária para executar a aplicação utilizando a imagem pública 
- postada no DockerHub.

## Projeto
- Imagem no [DockerHub](https://hub.docker.com/repository/docker/saribeiro/docker-challenge/general)
- Entrar na pasta do projeto
- Rodar `docker-compose up --build`
- Acessar http://localhost:8080/list para listar as linguagens salvas
- Rodar `curl http://localhost:8080/add -d name=<NOME_DA_LINGUAGEM>` para adicionar novas linguagens
- Como acessar o banco em pé: `docker-compose exec  mysql mysql -uroot -pverysecret mydatabase`