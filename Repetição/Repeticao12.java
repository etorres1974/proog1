import java.util.Scanner;
public class Repeticao12{
public static void main(String [] args){
 int n; // numero de estudantes
 int m = 0; int p = 0; // Melhor nota, Pior nota
 int inp;   // input
 Scanner tc = new Scanner(System.in);
 n = tc.nextInt();
 int i; // Contador
        for (i = 1; i <= n ; i++){
            inp = tc.nextInt();
            if (i == 1) {m = inp; p = inp;} // No caso de haver uma unica nota, ela é o maior e o menor valor possível!
                if (inp > m){
                    m = inp;
                } else if (inp < p) {
                    p = inp;
                }
             //--------------------Simulação------------   
            System.out.printf("Ciclo %d Input=%d Maior=%d Pior=%d, \n", i,inp,m,p);
        } 

            System.out.printf("Maior nota =%d\nPior nota =%d\n", m,p);
        
    } 
        
}
