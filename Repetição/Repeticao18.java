import java.util.Scanner;
public class Repeticao18{
    public static void main(String [] args){
        
        Scanner tc = new Scanner(System.in);
        int n = tc.nextInt();
        int c = 1;
        int t;
       do{
        t = (c * (c+1) * (c+2));
        System.out.printf("%d < %d\n", t, n);   
        c++;
        }
       while (t < n);
        
       if (t == n)
            System.out.printf("%d eh triangular, pois %d . %d . %d = %d", n, c, c+1, c+2, n);
        else
            System.out.printf("%d nao eh triangular", n);

    }
}
/*
Dizemos que um número natural é triangular se é produto de três números naturais
consecutivos.
Exemplo:
120 é triangular, pois 4 . 5 . 6 = 120.
Dado um númro natural n, verificar se n é triangular.
1 2 3 = 6   =  3! -
2 3 4 = 24  =  4! - 1!
3 4 5 = 50  =  5! - 2!
4 5 6 = 120 =  6! - 3!

        while (n>1){
            f = f*n;
            n--;
        }

System.out.printf("%d eh triangular, pois %d . %d . %d = %d", n, c, c+1, c+2, n);
System.out.printf("%d nao eh triangular", n);
*/