import java.util.Scanner;
    public class Repeticao23{
        public static void main(String [] args){
            Scanner tc = new Scanner(System.in);
            int n = tc.nextInt();
            int seq;
            int fat = 1;
            while (n > 0){
                seq = tc.nextInt();
                    while ( seq > 0 ){
                        fat = fat*seq; 
                        seq--; 
                    }
                System.out.print(fat + "\n");
                fat = 1;
                n--;
            }

        }
    }



    /*

23. Dados um número inteiro positivo n e uma sequência de n números inteiros positivos,
determinar o fatorial de cada número da sequência.
Exemplo:
Se n = 4 e a sequência é 4; 3; 6; 1, então a saída deverá ser 24, 6, 720 e 1,
respectivamente.
    */