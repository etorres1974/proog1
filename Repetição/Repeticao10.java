import java.util.Scanner;
public class Repeticao10{
    public static void main(String [] args){
        int n, i, pares = 0, impares = 0;
        Scanner tc = new Scanner(System.in);
        n = tc.nextInt();
        while (n>0){
            i = tc.nextInt();
            n--;
            if (i%2 == 0)
                pares++;
                else
                    impares++;
        }
        System.out.print(pares + " e " + impares);
        
    }
}
/*
10. Dado um número inteiro positivo n e uma sequência de n números inteiros positivos,
determinar quantos números da sequência são pares e quantos são ímpares.
Exemplo:
Se n = 6 e a sequência de números inteiros é 28; 5; 4; 9; 720; 566 a saída
deve ser 4 e 2.
*/