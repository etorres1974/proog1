import java.util.Scanner;
public class Repeticao24{
    public static void main(String [] args){
        Scanner tc = new Scanner(System.in);
        int n;
        int seq;
        int soma = 0;
        int i = 2;  // numero seq é primo quando tem resto != 0 na divisão por 2,3,4...primo-1
        n = tc.nextInt();
            while(n>0){ // Receber valores N vezes.
                seq=tc.nextInt();
                while (i < seq){
                    if (seq % i != 0){ // Se não for divisivel por 2,3,4..se-1 o numero é primo e e entra na soma.
                        i++;
                    } else {
                        seq = 0;       // Caso contrario o numero vale 0 na soma.
                    }
                }
                soma = soma + seq;    // soma = primos + (não primos * 0) 
                n--;
                i = 2;               // Reseta o valor inicial para verificar se é primo
            }
            System.out.print("Soma = " + soma);

    }
}
/*
24. Dados um número inteiro positivo n e uma sequência de n números inteiros positivos,
calcular a soma dos que são primos.
Exemplo:

Se n = 5 e a sequência é 13; 9; 14; 7; 73, então a saída deverá ser 93, já que
13; 7 e 73 são números primos.
*/