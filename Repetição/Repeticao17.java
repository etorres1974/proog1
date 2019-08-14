import java.util.Scanner;
public class Repeticao17{
    public static void main(String [] args){
        int n; // length
        int i, j;
        int a = 0;
        int x = 0;
        int b = 0;
        String format = ", ";
        Scanner tc = new Scanner(System.in);
        n = tc.nextInt(); 
        i = tc.nextInt();
        j = tc.nextInt();

        while(n > 0){
            int mi = i*a; // Multiplos de i
            int mj = j*b; //Multiplos de j
            System.out.printf("Comeco n=%d x=%d mi=%d mj=%d a=%d b=%d\n", n, x, mi, mj, a, b);
            if(n == 1)
                format = ".";

            if (x == mi && x == mj) {
                System.out.print(x + format + "\n");
                a++;
                b++;
                n--;
            }else if(x == mi){
                System.out.print(x + format + "\n");
                a++;
                n--;
            }else if(x == mj){
                System.out.print(x + format + "\n");
                b++;
                n--;
            }else
                x++;
            System.out.printf("Fim n=%d x=%d mi=%d mj=%d a=%d b=%d\n", n, x, mi, mj, a, b);
         }
    }
}
//Para n = 6; i = 2 e j = 3 a saída deverá ser 0, 2, 3, 4, 6, 8.
//                                           n= 6  5  4  3  2
//                                           x= 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
//                                          mi= 0, 2, 4, 6, 8, 10
//                                          mj= 0, 3, 6, 9
//                                       print=  , 0,     ,  2,
//                                           x= 0,  , 1, 2,
//                                           c= 0, 1,     ,  2,
//if((x == mi || x == mj) || (x == mi && x == mj)){