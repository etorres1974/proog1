import java.util.Scanner;
public class Repeticao45{
    public static void main(String [] args){
        Scanner tc = new Scanner(System.in);
        double x = tc.nextDouble();
        int n = tc.nextInt();
        double num = 1;
        double den = 1;
        double seq = num/den;
        double cos = seq;
        double fat = 0;
        int neg = 1;
        int i;
            System.out.printf("Seq inicial = %f\n\n", seq);
        for(i = 1; i < n; i++){
            num = num*x*x;
            den = den*(fat+1)*(fat+2);
            fat += 2;
            seq = num/den;
            neg *= -1;
            seq *= neg;
            cos += seq; 
            System.out.printf("Seq = %f\n", seq);
            System.out.printf("Sinal = %d\n", neg);
            System.out.printf("num = %f\n", num);
            System.out.printf("den = %f\n\n", den);
        }
        System.out.printf("Aproximacao de Cos %.1f para os %d primeiros termos = %f", x, n, cos);
    }
        
}
/*

*/