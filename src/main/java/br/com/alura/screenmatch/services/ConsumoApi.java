package br.com.alura.screenmatch.services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {


    //método publico que vai retornar uma string, chamado de obterdados, para obter esses dados vai precisar receber um endereço como parametro

    public String obterDados(String endereco){
        HttpClient client = HttpClient.newHttpClient(); //cliente
        HttpRequest request = HttpRequest.newBuilder()  //endereço que vai fazer requisição
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());  //client manda a requisição e vou receber a resposta em response
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        String json = response.body();
        return json;
    }

}
