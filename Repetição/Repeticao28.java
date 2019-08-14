import java.util.Scanner;
public class Repeticao28{
    public static void main(String [] args){
        Scanner tc = new Scanner(System.in);
        int n = tc.nextInt();
        int p = 2;// Primo começa com 2, e tem como resto da divisão por 2 até p-1 > 0
        int multiplicidade = 0;
        int x = 2;

        while (n/p >= 1){
            if(n%p >= 1){ //if (m =!0) remove os cassos que imprimem m ´=0
                System.out.printf("fator %d multiplicidade %d \n",p,multiplicidade);
                multiplicidade = 0;
                while (x < p+1){ // incremento primo
                    if ((p+1)%x == 0){
                        p++;
                        x = 2;    
                    } else {
                        x++;
                    }
                } 
                p = x;
                x = 2;

            }else { // (n%p = 0)
                n/= p;
                multiplicidade++;
            }
        }
        System.out.printf("fator %d multiplicidade %d \n",p,multiplicidade);
        

    }
}
/*
28. Um número inteiro positivo pode ser decomposto como um produto de dois ou mais
números. Neste caso, esses números são chamados de fatores da decomposição. Por
exemplo, 18 = 3 x 6 é uma decomposição do número 18 nos dois fatores 3 e 6. Quando
os fatores do produto da decomposição de um número inteiro positivo n são todos
números primos, dizemos que tal decomposição é uma fatoração ou decomposição
em fatores primos. Por exemplo, 18 = 2 x 3 x 3 é uma fatoração do número 18. Uma
forma ilustrativa de fazer a fatoração de um número é mostrada no exemplo abaixo,
onde ocorre a fatoração, ou decomposição em fatores primos, do número 180:

Dado um número inteiro positivo, determine sua fatoração, calculando também a multiplicidade
de cada fator.
Exemplo:
Se n = 600 a saída deve ser
fator 2 multiplicidade 3
fator 3 multiplicidade 1
fator 5 multiplicidade 2
                            n
fator 2 multiplicidade 0    600
fato  2 multiplicidade 1    300
fato  2 multiplicidade 2    150
fato  2 multiplicidade 3    75 print
fator 3 multiplicidade 0    75
fator 3 multiplicidade 1    25 print
fator 5 multiplicidade 0    25
fator 5 multiplicidade 1    5
fator 5 multiplicidade 2    1 print


600/2 = 300 é divisivel pelo primo? se sim divide, se não testa para o próximo primo.
300/2= 150
150/2 = 75
75/3 = 25
25/5 = 5
5/5 = 1 Resultado dadivisão 1 = fim do laço

*/