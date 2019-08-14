/*
52. Dadas duas cadeias de caracteres cadeia1 e cadeia2, cada uma com no máximo 100
caracteres, compará-las e devolver um valor menor que zero se cadeia1 é lexicograficamente
menor que cadeia2, o valor zero se cadeia1 é igual (ou tem o mesmo conteúdo
que) a cadeia2, ou um valor maior que zero se cadeia1 é lexicograficamente
maior que cadeia2.
Exemplo:
Se a primeira cadeia de caracteres é abcdefgh e a segunda é abcddd então
a resposta é 1.
*/
import java.util.Scanner;
public class Repeticao52{
    public static void main(String [] args){
        Scanner tc = new Scanner(System.in);
        String cadeia1 = tc.next(); // maximo de 100 caracteres
        String cadeia2 = tc.next();
        if(cadeia1.length() == cadeia2.length())
            System.out.print("0");
            else if(cadeia1.length() < cadeia2.length())
            System.out.print("-1");
            else //(cadeia1.length() < cadeia2.length())
            System.out.print("1");
    }
}