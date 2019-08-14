import java.util.Scanner;
public class Repeticao16_2{
    public static void main(String [] args){
        Scanner tc = new Scanner(System.in);
        String n = tc.next();
        String primeiro = n.substring(0,1);
        String ultimo = n.substring(n.length()-1);
        
        if (primeiro.equals(ultimo)){
            System.out.printf("%s = %s", primeiro,ultimo);
        } else
            System.out.printf("%s != %s", primeiro,ultimo);


    }
}
        // verificar se o primeiro e ultimo digito sao iguais 121 1231
        // ultimo digito = resto da divisão por 10
        // primeiro algorismo resultado da ensima divisao por 10 que resultar <10