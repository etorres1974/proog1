/*
51. Dada uma cadeia de caractere cadeia com no máximo 100 caracteres e um caractere c,
buscar a primeira ocorrência do caractere c na cadeia. Se c ocorre em cadeia, mostrar
a posição da primeira ocorrência; caso contrário, mostrar o valor -1.
Exemplo:
Se a cadeia de caracteres é aaabaaacbabccbaabggcgcgag e o caractere é
g então a resposta é 17.
*/
import java.util.Scanner;
public class Repeticao51{
    public static void main(String [] args){
        Scanner tc = new Scanner(System.in);
        String cadeia = tc.next();
        String cadeia2 = tc.next();
        char c = cadeia2.charAt(0);
        int n = 0;
        boolean naoEncontrado = true; 

        //System.out.print(cadeia.lastIndexOf(l));

        while (n < cadeia.length()){
            if (cadeia.charAt(n) == c){
                System.out.print(n+"\n");
                naoEncontrado = false;
            }
            n++;
        }
        if(naoEncontrado)
            System.out.print("-1");

    }
}