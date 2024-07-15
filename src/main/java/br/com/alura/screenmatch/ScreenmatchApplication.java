package br.com.alura.screenmatch;

import br.com.alura.screenmatch.models.DadosSeries;
import br.com.alura.screenmatch.services.ConsumoApi;
import br.com.alura.screenmatch.services.ConverteDados;
import br.com.alura.screenmatch.services.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("Primeiro Projeto Spring sem Web ");
		//instanciar classe para poder utilizar

		ConsumoApi consumoApi = new ConsumoApi();
		// variavel para receber esses dados
		var json = consumoApi.obterDados("http://www.omdbapi.com/?t=gilmore+girls&apikey=f8cd58ef");
		System.out.println(json);

		//conversor
		ConverteDados conversor = new ConverteDados();

		//representação, vou passar os dados que obtive e quero que tente converter para DadosSerie
		DadosSeries dados = conversor.obterDados(json, DadosSeries.class);

		System.out.println(dados);
	}
}
