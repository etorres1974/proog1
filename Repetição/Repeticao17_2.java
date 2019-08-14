import java.util.Scanner;
public class Repeticao17_2{
    public static void main(String [] args){
        int n,i,j;
        int x = 0; //todos numeros naturais
 
        Scanner tc= new Scanner(System.in);
        n = tc.nextInt(); 
        i = tc.nextInt();
        j = tc.nextInt();
        
        while (n > 0){ 

        }

        

    }
}
/*
    1. While= Enquanto  nao sairem n resultados eu quero continuar testando.
    6*2 = 12
    6*3 = 18
*/

//Para n = 6; i = 2 e j = 3 a saída deverá ser 0, 2, 3, 4, 6, 8.
//                                           n= 6  5  4  3  2
//                                           x= 0, 1, 2, 3, 4, 5, 6, 7, 8, 9

//                                          mi= 0, 2, 4, 6, 8, 10
//                                          mj= 0, 3, 6, 9
//                                       print=  , 0,     ,  2,
//                                           x= 0,  , 1, 2,
//                                           c= 0, 1,     ,  2,
//if((x == mi || x == mj) || (x == mi && x == mj)){