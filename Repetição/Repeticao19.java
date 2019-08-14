import java.util.Scanner;
public class Repeticao19{
    public static void main(String [] args){
        Scanner tc = new Scanner(System.in);
        int x = tc.nextInt();
        int y = tc.nextInt();
        int r;
        if (x > y){
            while (x%y !=0){
                r = x%y;
                x = y;
                y = r;
            }
            if (x%y == 0)
                System.out.print("Mdc = " + y);
        } else if (y > x){
            while (y%x !=0){
                r = y%x;
                y = x;
                x = r;
            }
            if (y%x == 0)
                System.out.print("Mdc = " + x);
        } else
            System.out.printf("Se x = y = mdc = %d = %d", x, y);
    }
}

/*
Dados dois números inteiros positivos, determinar o máximo divisor comum entre
eles utilizando o algoritmo de Euclides
O MDC de dois números inteiros é o maior número inteiro que divide ambos com resto 0.
*/