import java.util.Scanner;
public class Repeticao15{
    public static void main(String [] args){
        Scanner tc = new Scanner(System.in);
        String n = tc.next();                                       // Inteiro positivo
        int i;
        int j;
        boolean iguais = false;
        for (i = 0; i <= n.length(); i++){                          // Verificar para cada digito de n
            j = i + 1;
            while(j < n.length()){                                  // Verificar para proximo se 
                if (n.substring(i,i+1).equals(n.substring(j,j+1))){ // Se a substring de 0.1 é igual a 1.2
                    iguais = true;
                }
                j++;
            } 
        }  
        if (iguais == true)
            System.out.print("Contem digitos iguais");
        else 
            System.out.print("Contem digitos somente diferentes");
              
    }
}