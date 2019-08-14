import java.util.Scanner;
public class Repeticao8{
    public static void main(String [] args){
        int frios = 0;
        int mar = 0;
        int tmp = 0;
        Scanner tc = new Scanner(System.in);
        while(mar < 31){
        tmp = tc.nextInt();
        if (tmp < 0)
            frios++;
        mar++;
        }
        System.out.printf("Dias frios %d\n", frios);
    } 
    
}


/*
8. Durante os 31 dias do mês de março foram tomadas as temperaturas médias diárias
de Campo Grande, MS. Determinar o número de dias desse mês com temperaturas
abaixo de zero. Faça ao menos uma simulação passo a passo da execução de sua
solução.
*/