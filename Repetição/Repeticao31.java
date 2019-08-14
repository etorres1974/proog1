import java.util.Scanner;
/*
31. Dado um número natural na base decimal, transformá-lo para a base binária.
Exemplo:
Dado 18 a saída deverá ser 10010.
*/
public class Repeticao31{
    public static void main(String [] args){
        Scanner tc = new Scanner(System.in);
        int dec = tc.nextInt();
        int inicial = dec; // usado para impressao
        int bin = 0;
        int d = 2; // equivale a 2^1, 2^2, 2^3... = 2, 4 , 8 ,16 ,32
        int m = 10;// multiplicador base 10 equivalente ao expoente do dois
        int f = 10;// multiplicador para caso de falha na divisão removendo 2¹ da base
        while (dec > 0){
            if (dec < d){
                dec -= 2;
                bin += f;
                f*=10;
                d = 2;
            }
            while (dec >= d){
                if(dec == d)
                    bin += 1*(m);
                    dec -= d;

                m*=10; // passa a agregar a proxima casa binaria
                d*= 2; // passa a comparar com a proxima potencia de 2
            }
        }
        System.out.printf("O decimal %d convertido em binario eh = %d", inicial,bin);

    }
}