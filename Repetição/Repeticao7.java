import java.util.Scanner;
public class Repeticao7{
    public static void main(String [] args){
        int n,tmp,soma = 0, pares = 0, impares = 0;
        Scanner tc =  new Scanner(System.in);
        System.out.print("Digite n: ");
        n = tc.nextInt(); 
        System.out.printf("Digite uma sequencia de %d numeros: ", n);
        while (n>0){
            tmp = tc.nextInt();
            n--;
            if (tmp%2 == 0)
                pares = pares + tmp;
            else 
                impares = impares + tmp;
        }
        System.out.printf("Pares -> %d\n Impares -> %d \n", pares, impares);
    }
}