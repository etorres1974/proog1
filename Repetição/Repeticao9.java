import java.util.Scanner;
public class Repeticao9 {
    public static void main(String [] args){
        Scanner tc = new Scanner(System.in);
        int n, pos = 0, neg= 0, x;
        n = tc.nextInt();
        while (n>0){
            x = tc.nextInt();
            n--;
            if (x<=0)
                pos++;
                else
                    neg++;
        }
        System.out.print(pos + " e " + neg + "\n");
    }
}