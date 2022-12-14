package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pessoa {

    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
}
