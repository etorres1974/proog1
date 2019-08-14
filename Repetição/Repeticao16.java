import java.util.Scanner;
public class Repeticao16{
    public static void main(String [] args){
        Scanner tc= new Scanner(System.in);
        int n = tc.nextInt();
        int primeiro;
        int ultimo = n%10;
        while(n >= 10){
             n/=10;
        }
            primeiro = n;
            if (primeiro == ultimo)
            System.out.print(primeiro + " = " + ultimo);
            else
            System.out.print(primeiro + " != " + ultimo);   
    }
}
        // verificar se o primeiro e ultimo digito sao iguais 121 1231
        // ultimo digito = resto da divisão por 10
        // primeiro algorismo resultado da ensima divisao por 10 que resultar <10