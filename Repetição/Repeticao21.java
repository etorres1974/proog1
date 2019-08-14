import java.util.Scanner;
public class Repeticao21{
    public static void main(String [] args ){
        int diasMes;
        int diaSemana;// 1dom 2seg, 3ter, 4quar, 5qui, 6sex, 7sab,
        Scanner tc = new Scanner(System.in);
        diasMes= tc.nextInt();
        diaSemana = tc.nextInt();
        int dia = 1;
        
        switch(diaSemana){
            case 1:
                while (diaSemana <= 7){
                if (diaSemana == 7){
                    System.out.print("  " + dia + "\n");    
                }
                System.out.print("  " + dia);
                dia++;
                diaSemana++;
                }
                break;
            case 2:
                System.out.print("   ");
                while (diaSemana <= 7){
                if (diaSemana == 7){
                    System.out.print("  " + dia + "\n");    
                }
                System.out.print("  " + dia);
                dia++;
                diaSemana++;
                }
                break;
            case 3:
                System.out.print("      ");
                while (diaSemana <= 7){
                if (diaSemana == 7){
                    System.out.print("  " + dia + "\n");    
                }
                System.out.print("  " + dia);
                dia++;
                diaSemana++;
                }
                break;
            case 4:
                System.out.print("         ");
                while (diaSemana <= 7){
                if (diaSemana == 7){
                    System.out.print("  " + dia + "\n");    
                }
                System.out.print("  " + dia);
                dia++;
                diaSemana++;
                }
                break;
            case 5:
                System.out.print("            ");
                while (diaSemana <= 7){
                if (diaSemana == 7){
                    System.out.print("  " + dia + "\n");    
                }
                System.out.print("  " + dia);
                dia++;
                diaSemana++;
                }
                break;
            case 6:
                System.out.print("               ");
                while (diaSemana <= 7){
                if (diaSemana == 7){
                    System.out.print("  " + dia + "\n");    
                }
                System.out.print("  " + dia);
                dia++;
                diaSemana++;
                }
                break;
            case 7:
                System.out.print("                  ");
                while (diaSemana <= 7){
                if (diaSemana == 7){
                    System.out.print("  " + dia + "\n");    
                }
                System.out.print("  " + dia);
                dia++;
                diaSemana++;
                }
                break;
            default:
                System.out.print("Dia da semana nao valido!");
        }
        while (diasMes-dia >= 0){
            if (dia <= 9){
            System.out.print("  " + dia);
            } else {
            System.out.print(" " + dia);
            } 
            dia++;
            diaSemana++;
            if(diaSemana == 14 || diaSemana == 21 || diaSemana == 28 || diaSemana == 35)
                System.out.print("\n");
        }

    }
}
/*
Se a entrada é 31 e 3 então a saída deve ser
       1  2  3  4  5
 6  7  8  9 10 11 12
13 14 15 16 17 18 19
20 21 22 23 24 25 26
27 28 29 30 31
*/