import java.util.Scanner;
public class Repeticao39{
    public static void main(String [] args){
        Scanner tc = new Scanner(System.in);
        int n = tc.nextInt();
        double soma = 0;

        for (double i = 1; i <= n ; i++){
            soma += (1/i);
        }
        System.out.print(soma);
    }
}
/*
1/2 = 0,5
1/3=  0,333
1/4=  0,25
*/

