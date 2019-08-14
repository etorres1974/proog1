import java.util.Scanner;
public class Repeticao4{
    public static void main(String [] args){
        int x, n;
        Scanner tc = new Scanner(System.in);
        x = tc.nextInt();n = tc.nextInt();
        n = Math.abs(n);
        System.out.print((int)Math.pow(x,n));
    }
}

/*
Dados um número inteiro x e um número inteiro não-negativo n, calcular x elevado n.
Exemplo:
Para x = 2 e n = 4 a saída deverá ser 16(= 2 elevado a 4).
Faça ao menos uma simulação passo a passo da execução de sua solução

L--------------Es--------------M
4                              []x, []n
6           2 4                [2]x ,[4]n
7                              [2]x ,[|4|]n
8              16              [2]x ,[|4|]n
                fim
*/