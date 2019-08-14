/**************************************************
*
* Eduardo Torres Ferreira, Lucca Damico Diniz
* 201919070672, 201919070097
* Trabalho Prático 1
* Professor(a): Phelipe Fabres
*
*/

import java.util.Scanner;
public class ErdosMain{
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int a;
		int teste = 1;

		do{
			int i = 0;
			a = tc.nextInt();
			if(a != 0){
				tc.nextLine(); // consome o resto da linha após o numero
			}
			String[][] listaAutoresArtigos = new String[100][10]; 
			while(i < a){ 
				String t = tc.nextLine(); 	  // Recebe a linha
				String[] temp = t.split(","); //Splita a linha em um vetor temporario
				for(int j = 0; j < temp.length; j++){ 
					listaAutoresArtigos[i][j] = temp[j].trim(); // Coloca os nomes na lista 
				}
				i++; //passa pro proximo artigo
			}

			if (a != 0) { // Esse if é pra nao imprimir teste quando nao existem mais testes.
				System.out.println("Teste "+teste);
				teste++;
				Erdos ead = new Erdos(listaAutoresArtigos);
				
			}
		} while (a != 0);
	}
}
 