import java.util.Scanner;
public class Repeticao47{
    public static void main(String [] args){
        int f1= 1;
        int f2= 1;
        int aux;
        int i = 3;
        Scanner tc = new Scanner(System.in);
        int n = tc.nextInt();
        if (n == 1){
            System.out.print("F1 eh: 1");
        } else if(n == 2){
            System.out.print("F2 eh: 1");
        } else{
                while (i <= n){
                    aux = f2;
                    f2= f1+f2;
                    f1= aux;
                    i++;
                }
                System.out.printf("F%d eh: %d", n,f2); 
            }
             
    }
}
// 0; 1; 1; 2; 3; 5; 8; 13; 21; 34; 55; 89; 144; : : :
/*
3 <= 4
aux = 1
f2 = 1 + 1 = 2
f1 =1

4 <= 4
aux = 2
f2 = 2 + 1 = 3
f1 = 2


*/