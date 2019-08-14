import java.util.Scanner;
public class Repeticao25{
    public static void main(String [] args){
        Scanner tc = new Scanner(System.in);
        int n; // n² = a² + b² if(true) print 
        n = tc.nextInt();
        int a;
        int b;
        int h = 1;
        boolean continuar = true; 
        do{
            //System.out.printf("h=%d \n", h);
            a = 1; b =1;
            continuar = true;

            while(a < h && continuar){
                //System.out.printf("a=%d b=%d \n", a, b);
                if (h*h !=  a*a + b*b){
                    if (b < h)
                    b++;
                        else{
                            a++;
                            b = 1;
                        }
                }else{
                    System.out.printf("O valor %d eh uma hipotenusa valida para os catetos %d e %d\n", h, a, b);
                    continuar = false;
                }     
                
            }                      
            h++;
        }while (h <= n);     
    }
}


/*
25. Um triângulo é um polígono no plano composto pelo espaço interno delimitado por
três retas que se interceptam e que formam três ângulos. A soma desses ângulos é
de 180º ou pi radianos. Um triângulo é retângulo se um de seus ângulos é de 90º
ou pi=2 radianos. O lado oposto ao ângulo reto de um triângulo retângulo é chamado
hipotenusa e os outros dois lados são chamados catetos. O Teorema de Pitágoras
afirma que em qualquer triângulo retângulo, o quadrado da medida da hipotenusa é
igual à soma dos quadrados das medidas dos catetos. Isto é, se um dado triângulo
retângulo tem hipotenusa h e catetos a e b, então vale que
h² = a² + b² :
Dado um número inteiro positivo n, determinar todos os números inteiros entre 1 e n
que são comprimento de hipotenusa de um triângulo retângulo com catetos inteiros.
Exemplo:
Se n = 5, então a resposta deve ser 5, já que entre 1 e 5 temos uma única
hipotenusa de um triângulo retângulo, com comprimento 5. Neste caso, os
catetos têm comprimento 3 e 4.

Opção 1: Testar todos os valores possíveis de a && b e comparar com n².
h² = a² + b²
1² = a² + b², 1 = 1² + 1² ?  False
2² = a² + b², 4 = 1² + 1² ?  False, 4 = 2² + 1² False, 4 = 2² + 2² False; a² + b² > n²
3² = a² + b², 9 = 1² + 1² ?  false, 9 = 2² + 1² False, 9 = 2² + 2² False, 9 = 3² + 1² false; a²+ b² > n2

Opção 2;
h² = a² + b²;
h² = {1, 4, 9, 25, 36, 49, 64, 81, 100, 121, 144}
a² + b² = 1 + b² = {2, 5, 10, 26, 37, 50, 65  ...}
        = 4 + b² = {5, 8, 13, 29, 40, 53, 68  ...}
        = 9 + b² = {10, 13, 18, 34, 45, 58, 73...}



*/