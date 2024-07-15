package br.com.alura.screenmatch.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// anotação para ele ignorar o que não encontrar, que por default vem false, colocar como true
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSeries(@JsonAlias("Title") String titulo,
                          @JsonAlias("totalSeasons") Integer totalTemporada,
                          @JsonAlias("imdbRating") String avaliacao ){
}
