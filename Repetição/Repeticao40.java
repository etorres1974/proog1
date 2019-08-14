import java.util.Scanner;
public class Repeticao40{
    public static void main(String [] args){
        Scanner tc = new Scanner(System.in);
        int n = tc.nextInt();
        int num = 1; 
        int den = n;
        double soma = (double)num/(double)den;
        System.out.printf("Soma = %f, Numerador = %d Denominador = %d\n",soma, num, den); 
        // num =  1 , 2 , 3 , 4 ..
        // den =  n-1 , n-2 , n-3
        while (num < n){
            soma += (double)(num+1)/(double)(den-1);
            num++;
            den--;
            System.out.printf("Soma = %f, Numerador = %d Denominador = %d\n",soma, num, den); 
        }
        System.out.printf("Soma = %.5f",soma);
    }
}