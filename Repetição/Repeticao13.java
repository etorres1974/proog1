import java.util.Scanner;
public class Repeticao13{
    public static void main(String [] args){
        int n, i;
        int inp;
        int old = 0; // Como a sequencia apenas aceita numeros positivos o 0 não vai interferir no primeiro numero
        boolean crescente = true; // Se tiver apenas um numero, a ordem é crescente
        Scanner tc = new Scanner(System.in);
        n = tc.nextInt();
        for (i = 0; i < n; i++){
            inp = tc.nextInt();
            if(inp < old)       // Compara o input atual com o ultimo input
                crescente = false; 
        old = inp;
        }
        if (crescente)
            System.out.print("A ordem e crescente");
            else
                System.out.print("A ordem nao e crescente");
    }
}