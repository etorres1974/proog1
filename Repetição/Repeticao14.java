import java.util.Scanner;
public class Repeticao14{
    public static void main(String [] args){
        Scanner tc = new Scanner(System.in);
        String n = tc.next(); // n > 0
        String d = tc.next(); // Digito com 0 <= d <= 9
        int i;
        int r = 0;
        for (i = 1;i <=n.length();i++){ // (O loop dura o numero de caracteres de n)
            if (n.substring(i-1,i).equals(d)){ // Se o substring 0 1 for igual ao digito d, adiciona 1 pro r
                r++;                           // se o substring 1 2 ... 2 3 .. 3.. 4
            }
        }
        System.out.print(r);
    }
}