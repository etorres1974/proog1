import java.util.Scanner;
public class Repeticao41{
    public static void main(String [] args){
        double soma, num, den, neg;
        Scanner tc = new Scanner(System.in);
        System.out.print("------------------Escolha um metodo para soma de 1/1 + 1/2 + 1/3 ... 1/10------------------\n" +
        "(a) adicao dos termos da esquerda para a direita;\n" +
        "(b) adicao dos termos da direita para a esquerda;\n" +
        "(c) adicao separada dos termos positivos e dos termos negativos da esquerda para a direita;\n" +
        "(d) adicao separada dos termos positivos e dos termos negativos da direita para a esquerda.\n" +
        "-------------------------------------------------------------------------------------------\n");
        String metodo = tc.next();
        switch (metodo){
            case "a":
                soma = 1;
                num = 1;
                den = 2;
                System.out.printf("Soma =%f Numerador = %.2f Denominador = %.2f\n", soma, num, den);
                while (den <= 10){
                    if (den%2 == 0)
                    soma -= (num/den);
                    else
                    soma += (num/den);
                    den++;
                    System.out.printf("Soma =%f Numerador = %.2f Denominador = %.2f\n", soma, num, den);
                }
                System.out.printf("Soma =%f", soma);
                break;

            case "b":
                soma = -((double)1/(double)10);
                num =  1;
                den =  9;
                System.out.printf("Soma =%f Numerador = %.2f Denominador = %.2f\n", soma, num, den);
                while(den >= 1){
                    if(den%2 == 0)
                    soma += -(num/den);
                    else
                    soma += (num/den);
                    den--;
                    System.out.printf("Soma =%f Numerador = %.2f Denominador = %.2f\n", soma, num, den);
                }
                System.out.printf("Soma =%f", soma);
                break;

            case "c":
                soma = 1;
                neg = -((double)1/(double)2);
                num = 1;
                den = 3;
                System.out.printf("Positivos =%f Negativos = %f Numerador = %.2f Denominador = %.2f\n", soma, neg, num, den);
                while (den <= 10){
                    if (den%2 == 0)
                    neg += -(num/den);
                    else
                    soma += (num/den);
                    den++;
                    System.out.printf("Positivos =%f Negativos = %f Numerador = %.2f Denominador = %.2f\n", soma, neg, num, den);
                }
                System.out.printf("Positivos =%f Negativos = %f\n", soma, neg);
                System.out.printf("Total = %f\n", soma+neg);
                break;

            case "d":
                neg = -((double)1/(double)10);
                soma = (double)1/(double)9;
                num =  1;
                den =  8;
                System.out.printf("Positivos =%f Negativos = %f Numerador = %.2f Denominador = %.2f\n", soma, neg, num, den);
                while(den >= 1){
                    if(den%2 == 0)
                    soma += -(num/den);
                    else
                    soma += (num/den);
                    den--;
                    System.out.printf("Positivos =%f Negativos = %f Numerador = %.2f Denominador = %.2f\n", soma, neg, num, den);
                }
                System.out.printf("Positivos =%f Negativos = %f\n", soma, neg);
                System.out.printf("Total = %f\n", soma+neg);
                break;
            default:
                System.out.print("Digite uma alternativa valida!!!");
        }
    }
}

/*
41. Escreva um programa que calcule a soma pelas seguintes maneiras:

(a) adição dos termos da esquerda para a direita;
(b) adição dos termos da direita para a esquerda;
(c) adição separada dos termos positivos e dos termos negativos da esquerda para a
direita;
(d) adição separada dos termos positivos e dos termos negativos da direita para a
esquerda.

*/