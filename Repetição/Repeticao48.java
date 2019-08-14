import java.util.Scanner;
public class Repeticao48{
    public static void main(String [] args){
        // metodo calcular raiz quadrada
        Scanner tc = new Scanner(System.in);
        double x = tc.nextDouble(); // numero que eu quero saber a raiz;
        double e = tc.nextDouble(); // margem de erro da aproximação
        double y = 1;
        double chute = x/y;
        double media = ((y + chute)/2);
        int passos = 1;

        while (Math.abs(media-y) > e){
            y = media;
            chute = x/y;
            media = ((y + chute)/2);
            passos++;
        }
        System.out.printf("Raiz quadrada de %.1f = %f, apos %d tentativas de aproximacao\n",x,media,passos);

        

    }
}


/*
Escreva um programa que receba um número real positivo x e um número real "e"  e
calcule a raiz quadrada de x usando o método de Newton, até que o valor absoluto da
diferença entre dois valores consecutivos de y seja menor que "e" ". Mostre também na
saída a quantidade de passos realizados para obtenção da raiz de x.
*/