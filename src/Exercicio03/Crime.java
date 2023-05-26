package Exercicio03;
import java.util.Scanner;
public class Crime {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Aconteceu um crime, você foi encontrado na cena do crime.\n" +
                "Responda estas perguntas, da seguinte forma: (S - Sim | N - Não ");

//As letras "r" significam "respostas

        System.out.println("Telefonou para a vítima?");
        String r1 = entrada.next();
        System.out.println("Esteve no local do crime?");
        String r2 = entrada.next();
        System.out.println("Mora perto da vítima?");
        String r3 = entrada.next();
        System.out.println("Devia para a vítima?");
        String r4 = entrada.next();
        System.out.println("Já trabalhou com a vítima?");
        String r5 = entrada.next();


        int positivo = 0;
        if(r1.equals("S")){
            positivo++;
        } if (r2.equals("S")){
            positivo++;
        } if (r3.equals("S")){
            positivo++;
        } if (r4.equals("S")){
            positivo++;
        } if (r5.equals("S")){
            positivo++;
        }

        int negativo = 0;
        if(r1.equals("N")){
            negativo++;
        } if (r2.equals("N")){
            negativo++;
        } if (r3.equals("N")){
            negativo++;
        } if (r4.equals("N")){
            negativo++;
        } if (r5.equals("N")){
            negativo++;
        }

    if (positivo == 2){
        System.out.println("Suspeita");
    } else if (positivo >= 3 && positivo <= 4) {
        System.out.println("Cúmplice");
    } else if (positivo == 5) {
        System.out.println("Assassino");
    } else {
        System.out.println("Inocente");
    }

    }

}
