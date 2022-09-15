package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas: ");
        int n = sc.nextInt();
        Pessoa[] pessoas = new Pessoa[n];
        double soma = 0.0;
        int contador = 1;

        for(int i=0; i < pessoas.length; i++){
            System.out.println("Dados da " + contador +"a pessoa: ");
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            pessoas[i] = new Pessoa(nome, idade, altura);
            soma += pessoas[i].getAltura();
            contador++;
        }

        System.out.println();
        double alturaMedia = soma / pessoas.length;
        System.out.printf("Altura media: %.2f%n", alturaMedia);

        int menores = 0;

        for(int i=0; i < pessoas.length; i++){
            if(pessoas[i].getIdade() < 16){
                menores++;
            }
        }

        double percentualMenores = ((double)menores / pessoas.length) * 100;

        System.out.printf("Pessoas menores de 16 anos: %.2f%s", percentualMenores, "%");

        System.out.println();
        for(int i=0; i < pessoas.length; i++){
            if(pessoas[i].getIdade() < 16){
                System.out.println(pessoas[i].getNome());
            }
        }

        sc.close();
    }
}
