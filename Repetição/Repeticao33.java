import java.util.Scanner;

public class Repeticao33{
    public static void main(String [] args){
        Scanner tc = new Scanner(System.in);
        int n = tc.nextInt();
        int m = n;
        int count;
        int ult;
        int pri;
        boolean palindromo= true;
        while (m >= 10){ 
            count = 1;
            ult = n%10;
            while (m/10 >= 1){
                m /= 10;
                count *=10; // numero de algarismos do numero.
            }
            pri = m;
            if (pri == ult){
                m = (n-(pri*count)-ult)/10;

            } else { palindromo = false;}
            n = m;
            //System.out.printf("n=%d pri=%d ult=%d count=%d\n",n,pri,ult,count);
        }
            if(palindromo)
            System.out.print("Eh um palindromo!\n");
            else 
            System.out.print("Nao eh um palindromo =( \n");

    }
}
/*
33. Dizemos que um número natural n é palíndromo se
o primeiro algarismo de n é igual ao seu último algarismo;
o segundo algarismo de n é igual ao se penúltimo algarismo;
e assim sucessivamente.
Exemplos:
567765 é palíndromo;
32423 é palíndromo;
567675 não é palíndromo.
Dado um número natural n, verificar se n é palíndromo. Faça pelo menos uma simulação
da execução passo a passo da sua solução.

se n = 1  é palindromo
se n = 11 é palindromo
se n = 131 é palindromo

linha-----ES--------Memoria
                    n   m   count   ult pri palindromo 
11      121         121 121  []     []   []   true
13                            1        
14                                   1
16                      12    10                  
16                       1    100
19                                        1
21                       2
24                   2
12  m>=10? False
28  Eh um palindromo

*/