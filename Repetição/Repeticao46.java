import java.util.Scanner;
public class Repeticao46{
    public static void main(String [] args){
        Scanner tc = new Scanner(System.in);
        double x = tc.nextDouble();
        double eps = tc.nextDouble(); // entre 0 e 1    
        // Dado x e eps, Calcule x em uma série infinita para o maior valor possivel de Tk < eps
        // Sendo tk = x ^2k+1 / 2k + 1 (k >= 0) 
        /*
        k = 1 e x =2 den = 2 + 1 = 3
        k = 2 e x =2 den = 4 + 1 = 5
        1! 3! 5! 7! 
        1  6  120 
        1 k= 0
        1 * 2 * 3 k = 1 x6
        1 * 2 * 3 * 4 * 5 k = 2 x20
        */

        //int k = 0;
        double k = 0;
        double num = x; // primeiro valor possivel
        double den = 1;
        double tk = num/den;
        double sen = tk; // Soma dos valores possíveis de tk1 - tk2 + tk3...
        double sinal = 1; 
        boolean continuar = true;
        double aux = 2;
        System.out.printf("tk = %f\n", tk);
        while (tk > eps){
            for(k = 1; continuar; k++){ //Receber numerador e denominador
                num = num*(x*x);
                den = den*(aux)*(aux+1); aux +=2;
                tk = num/den;
                sinal *= -1;
                sen = sen + (tk*sinal);
                if (tk < eps)
                    continuar = false;
                System.out.printf("tk = %f\n", tk);    
                
            }
        }
        System.out.printf("Seno x = %f\n", sen);
        
    }
}

       /* 
                       if ( tk < eps)
                    continuar = false;
       
       int fat = 1;
        int impar = 1;
        int k = 1;
        int tk = x/1; //(2*k) + 1;
        int sin = 1;
        double sen = 0.0;
        while (tk>e){
            sen += sin*tk;
            x = x * x * x;// fazer igual abaixo
            fat = fat*(impar +1)*(impar+2);
            impar +=2;
            sin *= -1;
            tk = x/fat;
        }
        System.out.print()
            */