import java.util.Scanner;
public class Repeticao5{
    public static void main(String [] args){
        int next, n, i = 1; int soma = 0; String result=" ";
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite um numero n: ");
        n = tc.nextInt();
        System.out.printf("Digite %d numeros novos para somar: ", n);
        while (i<=n){
            next = tc.nextInt(); soma = soma + next;
            if (next >= 0)
                result = result + String.valueOf(next);
                else
                    result = result + "(" + String.valueOf(next) + ")";
            
            if (i != n)
                result = result + "+";
            i++;
        }
        System.out.printf("%d(=%s).",soma, result);
    }
}
/*
5. Dado um número inteiro positivo n e uma sequência de n números inteiros, somar esses n números.
Exemplo:
Para n = 5 e a sequência 5;-3; 6; 0; 12 a saída deve ser 20(= 5+(-3)+6+0+12).
Faça ao menos uma simulação passo a passo da execução de sua solução.

L--------------Es--------------M
4                                     [1]i, []n, []next, [0]soma [ ]String
6 Digite um numero n:                 [1]i, []n, []next, []soma
7 3                                   [1]i, [3]n, []next, []soma
8 Digite 3 numeros novos para somar:  [1]i, []n, []next, []soma
10 1                                  [1]i, [1]n, [1]next, []soma [1 + ]
                                      []i, []n, []next, []soma
                                      []i, []n, []next, []soma
                                      []i, []n, []next, []soma
                                      []i, []n, []next, []soma
*/