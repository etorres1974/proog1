import java.util.Scanner;
public class Repeticao11{
    public static void main(String [] args){
        int [] vendas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 11, 10};
        int x = 0, dias = 1;
        while (dias < 30){
            if (vendas[x] > vendas[dias])
                x = 1;
                else 
                    x = dias+1;
            dias++;
        } 
        System.out.print(x);
    }
}
/*
11. Uma loja de discos anota diariamente durante o mês de abril a quantidade de discos
vendidos. Determinar em que dia desse mês ocorreu a maior venda e qual foi a quantidade
de discos vendida nesse dia. Faça ao menos uma simulação passo a passo da
execução de sua solução.
*/