# DPI - Java 15

Este é um projeto de exemplo para aplicações Java 15, usando containers Docker.

## Infraestrutura

O projeto faz uso da imagem ricardopedias/docker-project:java15, que contém a 
seguinte configuração:

- Java 15
- Tomcat 10
- Gradle 7

## Desenvolvimento

Para facilitar o desenvolvimento, existe um comando de atalho para o Gradle,
que pode ser executado sem precisar entrar no container:

```
./gradle <qualquer comando>

ou

./gradle build -t
```

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

// para acessar o MyServlet
http://localhost:8888/app/acme
```


## Referências

- https://www.mulesoft.com/tcat/tomcat-reload
- https://eclipse-ee4j.github.io/jakartaee-tutorial/
- https://mvnrepository.com/artifact/jakarta.servlet/jakarta.servlet-api
- https://docs.gradle.org/current/dsl/org.gradle.api.tasks.Exec.html
- https://docs.gradle.org/current/dsl/org.gradle.api.tasks.Delete.html
- https://docs.gradle.org/7.0/dsl/org.gradle.api.tasks.bundling.AbstractArchiveTask.html
- https://docs.gradle.org/current/userguide/war_plugin.html
