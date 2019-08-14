import java.util.Scanner;
public class Repeticao27{
    public static void main(String [] args){
        Scanner tc = new Scanner(System.in);
        int m = tc.nextInt();
        int n = 1; 
        int cubo, max, min ,soma;
        while (n <= m){
            cubo = n * n * n ;
            max = 1;
            min = 1;
            soma = 1;
                while (cubo != soma) {    
                        if (cubo > soma){ 
                        max += 2;
                        soma += max; 
                        } else { //(cubo > soma || cubo == soma)
                            soma -=  min;
                            min += 2;
                            }
                        if (cubo == soma && ((max-min)/2)+1 != n){
                            max += 2;
                            soma += max; 
                        }
                }
            System.out.printf("%d^3  = %d",n,min); 
            min+=2;   
            while(min <= max){
                System.out.print(" + " + min);
                min +=2;
            }
            System.out.print("\n");
            n++;
        }    
    }
}

// 1 - dado um numero n, encontre os impares que somados resultam em n³
// 2 - fazer um loop de para todos resultados de 0 < n < m 
/*
8 = 2³
2³ = 1  Cubo > soma Incrementa Max 
2³ = 1 + 3 = 4 Cubo > soma Incrementa max
2³ = 1 + 3 + 5 = 9 Soma > cubo, Incrementa min
2³ =     3 + 5 = 8 

27 = 3³
3³ = 1 
3³ = 1 + 3 = 4
3³ = 1 + 3 + 5 = 9
3³ = 1 + 3 + 5 + 7 = 16
3³ = 1 + 3 + 5 + 7 + 9 = 25
3³ = 1 + 3 + 5 + 7 + 9 + 11 = 36 = soma; imparmax = 11 imparmin = 1
3³ = 3 + 5 + 7 + 9 + 11 = 35
3³ = 5 + 7 + 9 + 11 = 32
3³ = 7 + 9 + 11 = 27     soma == cubo, imparmax = 11, imparmin = 7
impar = n³?
impar + impar+2 = n³?
imrpar + impar+2 + impar+4 n³?
...
64 = 4³ Imparmin + ..n-2.. + imparMax = soma
4³ > soma = 1
4³ > 1                                              d=0
4³ > 1 + 3 = 4                                      d=2 
4³ > 1 + 3 + 5 = 9                                  d= 4
4³ > 1 + 3 + 5 + 7 = 16                             d=6
4³ > 1 + 3 + 5 + 7 + 9 = 25                         d=8
4³ > 1 + 3 + 5 + 7 + 9 + 11 = 36                    d=10
4³ > 1 + 3 + 5 + 7 + 9 + 11 + 13 = 49               d=12
4³ ==1 + 3 + 5 + 7 + 9 + 11 + 13 + 15 = 64          d = 14

4³ < 1 + 3 + 5 + 7 + 9 + 11 + 13 + 15 + 17 = 81 imparmax = 17 d=16
4³ < 3 + 5 + 7 + 9 + 11 + 13 + 15 + 17 = 80 imparmin = 3 d d = 14
4³ < 5 + 7 + 9 + 11 + 13 + 15 + 17 = 77  d12
4³ < 7 + 9 + 11 + 13 + 15 + 17 = 72 d 10
4³ < 9 + 11 + 13 + 15 + 17 = 63  d = 8
4³ > 11 + 13 + 15 + 17 = 56  d= 6
4³ > 11 + 13 + 15 + 17 + 19 = 75 
4 == 13 + 15 + 17 + 19 = 64 d = 6

Relação entre maior e menor
1³ = 1                                ;d =0 ; 0%2 = 0  + 1 = 1
2³ = 3 + 5                            ;d= 2 ; 2%2 = 1  + 1 = 2
3³ = 7 + 9 + 11                       ;d= 4 ; 4%2 = 2  + 1 = 3
4³ = 13 + 15 + 17 + 19                ;d= 6 ; 6%2 = 3  + 1 = 4
4³ = 1 + 3 + 5 + 7 + 9 + 11 + 13 + 15 ;d= 14; 14%2 = 7
5³ = 21 + 23 + 25 + 27 + 29 ;          d= 8 ; 8% 2 = 4
                                              10%2 = 5
                                              12%2 = 6          

 
            while (!Correto){
                if(cubo == soma){
                max += 2;
                soma += max; 
                }
            }
*/