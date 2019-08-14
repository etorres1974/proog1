import java.util.Scanner;
public class Repeticao2{
    public static void main(String [] args) {
        int n;
        //int r;
        Scanner tc = new Scanner(System.in);
        n = tc.nextInt();
        int i = n;
        if (n == 0)
            System.out.print("0! = 1");
        else{
            while (i > 1) {
                n = n * (i-1);
                i--;
                //r = n; System.out.println(r +" "+ i); valores passo a passo
            }
            System.out.println(n);
            }
    }
}
/*
2. O fatorial de um número inteiro n, denotado por n!, é dado pela seguinte fórmula:
n! = n . (n - 1) . (n - 2) . . . 2 . 1 :
Dessa forma, 5! = 5 . 4 . 3 . 2 . 1 = 120. Por definição, 0! = 1.
Dado um número inteiro não-negativo n, calcular n!. Faça ao menos uma simulação
passo a passo da execução de sua solução.

L--------------Es--------------M
4                              []n,
6              5               [5]n , 
7                              [5]n , [5]i 
12                             [20]n ,[5]i       n = 5.(5-1)    
13                             [20]n ,[4]i          i--
12                             [60]n ,[4]i        n = 20.(4-1)
13                             [60]n ,[3]i          i--
12                             [120]n ,[3]i          n = 60.(3-1)
13                             [120]n ,[2]i         i--
12                             [120]n ,[2]i     n = 120.(2-1) 
13                             [120]n ,[1]i          i-- 
17             120             [120]n ,[1]i                                  

*/
