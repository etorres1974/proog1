import java.util.Scanner;
public class Repeticao29{
    public static void main(String [] args) {
        Scanner tc = new Scanner(System.in);
        int n = tc.nextInt();
        int s = 6;
        int mdc = 0;
        int f;
        int j;
            for(f = 0; f<n; f++){ //receber n valores.
                s = tc.nextInt();
                if( f == 0 ) // primeiro caso.
                    mdc = s;
                    else {// Fazer mdc entre 9 e 6
                        j = s;
                        while (j > 0){
                            if (mdc%j==0 && s%j==0){
                                mdc = j;
                                j = 0;
                            }else { 
                                j--;
                            }
                        }
                    }
            }
            System.out.print(mdc);
    }
}

/*
29. Dados um número inteiro n e uma sequência de n números inteiros positivos, determinar
o máximo divisor comum entre eles.
Exemplo:
Se n = 5 e a sequência é 24; 15; 33; 48; 6 a resposta deve ser 3, que é o
máximo divisor comum entre os números da sequência.

mdc;    s/s; s/s-1; s/s-2 ... s/2
        6/6 = 1     r= 0     fora do limite
6/5 = 1,2   r= 2             
6/4 = 1,5   r= 2
        6/3 = 2     r = 0   
        6/2 = 3     r = 0    
        6/1 = 6     r = 0    começo

mdc = 6
     15/15 = 1
15/14 = 1,07
15/13 = 1,15
15/12 = 1,25
15/11 = 1,36
15/10 = 1,5
15/9 =  1,6
15/8 = 1,8
15/7 = 2,1
15/6 = 2,5
        15/5 = 3
15/4 = 3,7
        15/3 = 5
15/2 = 7,5
        15/1 = 15

5/5 = 1 fora limite
5/4 = 
5/3 =
5/2 =
5/1 = 5 coomeço



*/