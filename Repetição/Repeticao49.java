/*
49. Dada uma cadeia de caracteres com no máximo 100 caracteres, contar a quantidade
de letras minúsculas, letras maiúsculas, dígitos, espaços e símbolos de pontuação que
essa cadeia possui.
*/
import java.util.Scanner;
public class Repeticao49{
    public static void main(String [] args){
        Scanner tc = new Scanner(System.in);
        String cadeia = tc.nextLine();      // E d U a R d o !
        String mai = cadeia.toUpperCase();  // E D U A R D O !
        String min = cadeia.toLowerCase();  // e d u a r d o !
        int n = 0;
        int maiusculas = 0;
        int minusculas = 0;
        int pontuacao = 0;

        while (n < cadeia.length()){
            if(cadeia.charAt(n) == mai.charAt(n) && cadeia.charAt(n) == min.charAt(n) ) // Os unicos caracteres que nao mudam quando minusculos ou maiusculos sao pontos numeros e espaços.
                pontuacao++;
            else if(cadeia.charAt(n) == min.charAt(n))
                minusculas++;
            else {//(cadeia.charAt(n) == mai.charAt(n))}
                maiusculas++;
            }
            n++;
        }
        System.out.printf("Maiusculas = %d\nMinusculas = %d\nPontuacao = %d", maiusculas,minusculas,pontuacao);
    }
}