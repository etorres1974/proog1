import java.util.Scanner;
public class Repeticao34{
    public static void main(String [] args){
        Scanner tc = new Scanner(System.in);
        int n = tc.nextInt();
        int x = 0, y = 0; 
        int seq = 1;
        int i = 1;
        do {
            if (i%2 != 0){//Se i for impar
                x = tc.nextInt();
            } else {//Se i for par.
                y = tc.nextInt();
            }
            if(i >= 2){
                if(x != y){
                    seq++;
                } 
            }    
            i++;
        } while (i<=n);
        System.out.printf("A seq eh formada por %d de numeros iguais ",seq);
    }
}