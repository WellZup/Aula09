package Exercicio01;
import java.util.Scanner;
public class Folha_de_Pagamento {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioHora, horasTrabalhadas, salarioBruto, salarioLiquido,impostoDeRenda, inss, fgts;


                System.out.print("Digite o valor da sua hora de trabalho: ");
                salarioHora = entrada.nextDouble();

                System.out.print("Digite a quantidade de horas trabalhadas por dia: ");
                horasTrabalhadas = entrada.nextDouble();

                salarioBruto = (salarioHora * horasTrabalhadas) * 30;
                inss = salarioBruto * 0.1;
                fgts = salarioBruto * 0.11;

//Criando uma variável para calcular o desconto do IR

                int faixaIr;
                if (salarioBruto <= 900) {
                    impostoDeRenda = 0;
                    faixaIr = 1;
                   } else if (salarioBruto <= 1500) {
                    impostoDeRenda = salarioBruto * 0.05;
                    faixaIr = 2;
                   } else if (salarioBruto <= 2500) {
                    impostoDeRenda = salarioBruto * 0.1;
                    faixaIr = 3;
                   } else {
                     impostoDeRenda = salarioBruto * 0.2;
                    faixaIr = 4;
                }
//Criando um switch case para verificar se é isento ou não
//
//                switch (faixaIr) {
//                    case 1:
//
//                        break;
//                    case 2:
//
//                        break;
//                    case 3:
//
//                        break;
//                    case 4:
//
//                        break;
//                }

                salarioLiquido = salarioBruto - inss - impostoDeRenda;

                System.out.println("Folha de Pagamento");
                System.out.println("------------------");
                System.out.printf("Salário Bruto: R$%.2f%n", salarioBruto);
                System.out.printf("INSS (10%%): R$%.2f%n", inss);
                System.out.printf("FGTS: R$%.2f%n", fgts);
                System.out.printf("IR: R$%.2f%n", impostoDeRenda);
                System.out.printf("Salário Líquido: R$%.2f%n", salarioLiquido);

            }
        }




