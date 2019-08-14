/*
50. Dadas duas cadeias de caracteres cadeia1 e cadeia2, concatenar cadeia2 no final de
cadeia1, colocando o caractere nulo no final da cadeia resultante. A cadeia resultante
a ser mostrada deve estar armazenada em cadeia1. Suponha que as cadeias sejam
informadas com no máximo 100 caracteres.
Exemplo:
Se a primeira cadeia de caracteres contém tamandua- e a segunda contém
bandeira a cadeia de caracteres resultante é tamandua-bandeira e deve
ser armazenada na cadeia1.
*/
import java.util.Scanner;
public class Repeticao50{
    public static void main(String [] args){
        Scanner tc = new Scanner(System.in);
        String cadeia1 = "";
        String cadeia2;
        String total = "";
       

        while (total.length() < 10){
            cadeia1 = tc.next();
            cadeia2 = tc.next();
    
            /*cadeia1 += cadeia2;
            cadeia2 = "";
            */
            if(total.length()+cadeia1.length() <= 10)
            total += cadeia1;
            if(total.length()+cadeia2.length() <= 10)
            total += cadeia2;
            System.out.printf("Cadeia 1 ->%s<-\n",cadeia1);
            System.out.printf("Cadeia 2 ->%s<-\n",cadeia2);
            System.out.printf("Total ->%s<-\n",total);
            System.out.printf("Total Length  ->%s<-\n",total.length()); //String teste = total.length(); Apesar de ser um numero, o print f imprimi o .length em %s.
            System.out.printf("Total Length  ->%d<-\n",total.length()); //int n = total.length();

        }
    }
}