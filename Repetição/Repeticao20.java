import java.util.Scanner;
public class Repeticao20{
    public static void main(String [] args ){
        Scanner tc = new Scanner(System.in);
        int a = tc.nextInt();
        int b = tc.nextInt();
        int n = a;
        while (n > 0){
        if (a%n == 0 && b%n == 0){
            a = a/n;
            b = b/n;        
            System.out.print(a + "/" + b);
            n = 0;
        } else
            n--; 
        }
    }
}
/*
9  3
12 4

3 1 6  1
6 2 12 2
*/