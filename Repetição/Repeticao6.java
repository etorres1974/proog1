import java.util.Scanner;
public class Repeticao6 {
    public static void main(String [] args){
        int n,tmp,soma = 0;
        Scanner tc =  new Scanner(System.in);
        System.out.print("Digite n: ");
        n = tc.nextInt(); 
        System.out.printf("Digite uma sequencia de %d numeros: ", n);
        while (n>0){
            tmp = tc.nextInt();
            if (tmp > 0)
            soma = soma + tmp;
            n--;
        }
        System.out.print(soma);
        
    }
}
/*
6. Dado um número inteiro positivo n e uma sequência de n números inteiros, determinar
a soma dos números inteiros positivos da sequência.

Se n = 7 e a sequência de números inteiros é 6;-2; 7; 0;-5; 8; 4 a saída
deve ser 25(= 6 + 7 + 8 + 4).
*/
