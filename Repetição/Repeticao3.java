import java.util.Scanner;
public class Repeticao3{
    public static void main(String [] args){
        int n;
        int i = 0;
        Scanner tc = new Scanner(System.in);
        n = tc.nextInt();
            while (i < n){
            System.out.print((int)Math.pow(2,i) + "; ");
            i++;
            }
    }
}

/*
3. Dado um número inteiro positivo n, imprimir as n primeiras potências de 2.
Exemplo:
Para n = 5 a saída deverá ser 1; 2; 4; 8; 16.
Faça ao menos uma simulação passo a passo da execução de sua solução.

L--------------Es--------------M
4                              []n,
5                              [5]n ,[0]i
7              5               [5]n ,[0]i 
9              1;              [5]n ,[0]i        
10                             [5]n ,[1]i        
9              2;              [5]n ,[1]i
10                             [5]n ,[2]i
9              4;              [5]n ,[2]i
10                             [5]n ,[3]i
9              8;              [5]n ,[3]i
10                             [5]n ,[4]i
9             16;              [5]n ,[4]i
10                             [5]n ,[5]i
13            fim       

*/
