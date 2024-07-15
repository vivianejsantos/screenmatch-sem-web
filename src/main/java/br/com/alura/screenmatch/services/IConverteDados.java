package br.com.alura.screenmatch.services;

public interface IConverteDados {
    // metodo generico

    <T> T obterDados(String json, Class <T> classe);
}


// essa classe vai receber um json que é uma String, vai receber uma classe e no conversor de classe vai tentar transformar esse json na classe que foi indicada
