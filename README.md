## Micronaut 3.5.1 Documentation

- [User Guide](https://docs.micronaut.io/3.5.1/guide/index.html)
- [API Reference](https://docs.micronaut.io/3.5.1/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/3.5.1/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

## Feature jdbc-hikari documentation

- [Micronaut Hikari JDBC Connection Pool documentation](https://micronaut-projects.github.io/micronaut-sql/latest/guide/index.html#jdbc)


## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)


## Feature testcontainers documentation

- [https://www.testcontainers.org/](https://www.testcontainers.org/)


## Instruções para executar utilizando docker

### Para criar o .jar da aplicação na pasta /target

    mvn package -Dmaven.test.skip

### Para criar a imagem docker com nome veiculo-service
    
    docker build . --tag veiculo-service

### Para criar o container docker com nome veiculo-service

    docker run -d veiculo-service

## Instruções para utilizar docker-compose

### Para subir todos os serviços
    
    docker-compose -f .\docker\veiculo-compose.yml up -d

### Para parar todos os serviços
    
    docker-compose -f .\docker\veiculo-compose.yml stop

### Para iniciar todos os serviços já existentes

    docker-compose -f .\docker\veiculo-compose.yml start

### Para derrubar todos os serviços (excluindo os containers)

    docker-compose -f .\docker\veiculo-compose.yml down