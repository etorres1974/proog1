import java.util.Scanner;

public class Repeticao26{
    public static void main(String [] args) {
        Scanner tc = new Scanner(System.in);
        int m = tc.nextInt();
        int n = tc.nextInt();
        // Qual maior valor possivel de x e y para  xy-x²+y sendo x<=m e y<=n
        int x = 0;
        int y = 0;
        int eq = (x*y) - (x*x) + y;
        while(x < m && y < n){
            if (y < n && eq < (x*(y+1)) - (x*x) + (y+1)){
                y++;
                eq = (x*y) - (x*x) + y;
            }
            if (x < m && eq < ((x+1)*y) - ((x+1)*(x+1)) + y){
                x++;
                eq = (x*y) - (x*x) + y;
            }
        }
        System.out.printf("x = %d\ny= %d", x, y);


    }
}
/*
Case 2 2 = t
case 1 0 = t
case 0 1 = false
*/
