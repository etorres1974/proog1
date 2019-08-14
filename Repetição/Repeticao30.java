import java.util.Scanner;
/*
30. Dado um número natural na base binária, transformá-lo para a base decimal.
Exemplo:
10010 a saida sera 18, pois 
1                           1 . 2^4 +  -> 16
 0                          0 . 2^3 +      0
  0                         0 . 2^2 +      0
   1                        1 . 2^1 +  ->  2
    0                       0 . 2^0 =  ->  0 
                                        + 18  
                                    
*/
public class Repeticao30 {
    public static void main(String [] args){
        Scanner tc = new Scanner(System.in);
        int bin = tc.nextInt();
        int inicial = bin;
        int dec = 0;
        int d = 1;
        int e = 0;
        System.out.printf("Binario = %d\nDecimal =%d\n2 elevado a %d = %d\n\n",bin, dec,e,d);
        while(bin > 0){
            dec += (bin%10) * d;
            bin /= 10;
            d *= 2;
            e++;
            System.out.printf("Binario = %d\nDecimal =%d\n2 elevado a %d = %d\n\n",bin, dec,e,d);

        }
        System.out.printf("O numero binario %d equivale ao numero decimal %d ", inicial ,dec);
        

    }
}