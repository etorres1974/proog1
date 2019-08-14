import java.util.Scanner;
public class Repeticao1{
    public static void main(String [] args){
        int n; int i = 1;int x = 1;
        Scanner tc = new Scanner(System.in);
        n = tc.nextInt();
        while (i <= n){
            System.out.println(x);
            i++; x = x + 2;
        }

    }
}
/*
1. Dado um número inteiro positivo n, imprimir os n primeiros naturais ímpares.
Exemplo:
Para n = 4 a saída deverá ser 1; 3; 5; 7.
Faça ao menos uma simulação passo a passo da execução de sua solução.

L--------------Es--------------M
4                              []n, [1]i, [1]x
6              4               [4]n , [1]i  [1]x
8              1               [4]n , [1]i  [1]x
9                              [4]n , [2]i  [3]x
8              3               [4]n , [2]i  [3]x
9                              [4]n , [3]i  [5]x
8              5               [4]n , [3]i  [5]x
9                              [4]n , [4]i  [7]x
8              7               [4]n , [4]i  [7]x
9                              [4]n , [5]i  [9]x
            fim
*/