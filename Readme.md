# Testes unitários com JUnit

Testes unitários são testes que visam garantir a segurança do software, validando pela menor parte testável/executável de uma aplicação, os métodos.

Aqui vamos explorar os princípios dos testes conhecer as funcionalidades disponiveis nesse framework (JUnit) e através de testes simples compreender como utilizar os métodos para uma aplicação mais completa.

Para utilizar o JUnit conforme esse material, vamos fazer uso de uma dependência dentro do seu projeto, importante reforçar que o mesmos testes aqui aplicados podem ser aplicados para projetos gerenciados por Maven ou Gradle.

No site do mvnrepository(https://mvnrepository.com/)  podemos ter acesso a dependência necessária. Para isso basta buscar por JUnit Engine

O projeto aqui apresentado trata-se de um projeto Java em Maven. E aplicamos a versão 5.8.0 do JUnit Engine.

Maven:

```
<!-- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine -->
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>5.8.0</version>
    <scope>test</scope>
</dependency>
```

Gradle:

```
// https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine
testImplementation group: 'org.junit.jupiter', name: 'junit-jupiter-engine', version: '5.8.0'
```

https://github.com/jacquelinesantana/principios-teste-unitarios/tree/main/src/test/java/com/generation/testespring



