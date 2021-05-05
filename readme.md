# DPI - Java 15

Este é um projeto de exemplo para aplicações Java 15, usando containers Docker.
Foi configurado para facilitar o processo de desenvolvimento com uma imagem do projeto ricardopedias/docker-project.

## Infraestrutura

O projeto faz uso da seguinte configuração:

- Java 15
- Tomcat 10
- Gradle 7

## Execução do projeto

Para executar o projeto, use:

```
docker-compose up

ou

docker-compose up -d
```

Ao subir o container, o Tomcat será automaticamente iniciado:

```
// para acessar o index.jsp
http://localhost:8888/app 
http://localhost:8888/app/index.jsp 
http://localhost:8888/app/map-index

// para acessar o Servlet
http://localhost:8888/app/acme
```

## Desenvolvimento

Na raiz do projeto, existe um comando de atalho para o Gradle, que permite executá-lo
sem precisar entrar no container. Por exemplo, para executar qualquer comando, basta
invocar:

```
./gradle <qualquer comando>
```

O Gradle foi configurado para fazer deploy automático sempre que algo for atualizado 
no código fonte do projeto. Para ativar esta funcionalidade, basta usar o comando nativo
do Gradle: 

```
./gradle build -t
```

Nota: normalmente, o comando acima apenas compila a cada mudança, mas nesta configuração,
ele também efetua o deploy no Tomcat.

## Referências

- https://www.mulesoft.com/tcat/tomcat-reload
- https://eclipse-ee4j.github.io/jakartaee-tutorial/
- https://mvnrepository.com/artifact/jakarta.servlet/jakarta.servlet-api
- https://docs.gradle.org/current/dsl/org.gradle.api.tasks.Exec.html
- https://docs.gradle.org/current/dsl/org.gradle.api.tasks.Delete.html
- https://docs.gradle.org/7.0/dsl/org.gradle.api.tasks.bundling.AbstractArchiveTask.html
- https://docs.gradle.org/current/userguide/war_plugin.html
