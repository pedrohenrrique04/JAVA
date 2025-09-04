package com.exemplo.api_usuarios; //Serve pra organizar o seu código.

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //é pra dizer que essa classe vai responder requisições da web.
//Um “decorador” que diz pro Spring: “Essa classe vai ser usada pra API, não é só uma classe normal”.
//Com isso, o Spring entende que os métodos dentro dela podem ser chamados via navegador ou outro app.
public class HelloController {

    @GetMapping("/hello") //é pra criar uma rota GET, ou seja, uma URL que o cliente pode acessar.
    //Indica que esse método será chamado quando alguém acessar http://localhost:8080/hello.
    //GET é um método HTTP que geralmente significa “quero pegar alguma informação”.
    public String hello(){return "API funcionando \uD83D\uDE80";}
}
