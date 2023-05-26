package Exercicio02;
import java.util.Scanner;
public class Combustivel {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double litros, totalPago;
        double valorPago =0;
        double gasolinaPreco = 2.50;
        double alcoolPreco = 1.90;
        String tipoCombustivel;

        System.out.println("Digite quantos litros foram vendidos");
        litros = entrada.nextDouble();

        System.out.println("Digite o combustível escolhido? (A - Álcool || G - Gasolina)");
        tipoCombustivel = entrada.next();

        if (tipoCombustivel.equalsIgnoreCase("A")){
            totalPago = litros * alcoolPreco;
        } else {
            totalPago = litros * gasolinaPreco;
        }

        System.out.printf("O valor total pago, pelo combustível escolhido é de: R$%.2f%n", totalPago);



        switch (tipoCombustivel){
            case "A":
                if (litros <=20){
                    valorPago = (litros * alcoolPreco) * 3/100;
                } else{
                    valorPago = (litros * alcoolPreco) * 5/100;
                }
                break;
            case "G":
              if (litros <=20){
                  valorPago = (litros * gasolinaPreco) * 4/100;
              } else{
                  valorPago = litros * (gasolinaPreco) * 6/100;
              }
              break;
        }
        System.out.printf("Valor a ser pago de desconto é de: R$%.2f%n", valorPago);
        System.out.printf("Total a pagar: R$%.2f%n" , totalPago - valorPago);

    }
}
