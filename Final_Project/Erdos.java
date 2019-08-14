public class Erdos{
	
		private Autor[][] trabalho = new Autor[100][10]; 
		private Autor[] autores = new Autor[100];
		private int lotacao = 0;

		public Erdos(String[][] lista){
			recebe(lista);
			acharErdos();
			pontuar();
			ordenador(autores);
			printAutores();
		}

		private void recebe(String[][] lista){
			
			for(int i = 0; i< lista.length; i++){ // percorre a lista recebida
				for(int j = 0; j< lista[i].length; j++){ 
					if(lista[i][j] != null){			
						trabalho[i][j] = new Autor(lista[i][j]); //Instancia Autores 
						if(!autorRepetido(trabalho[i][j])){		// Se o autor nao for repetido ele deve ser colocado na lista
							autores[lotacao++] = trabalho[i][j];
						}
					}
				}	
			}
			redundancia();
		}

		private boolean autorRepetido(Autor a){
			for(int i = 0; i < autores.length; i++){
				if(autores[i] != null && autores[i].iguais(a)){
					return true;
				}
			}
			return false;
		}
		
		private void redundancia(){	// Faz com que a lista de trabalho aponte pra lista de autores, conectando as pontuações entre autores iguais.
			for(int a = 0; a < lotacao; a++){
				for(int i = 0; i < trabalho.length; i++){
					for(int j = 0; j < trabalho[a].length; j++){
						if(trabalho[i][j] != null && trabalho[i][j].iguais(autores[a])){			
							trabalho[i][j] = autores[a];
						}
					}
				}
			}	
		} 

		private void acharErdos(){
			
			for(int z = 0; z < trabalho.length; z++){ 
				for(int x = 0; x < trabalho[z].length; x++){
					if(trabalho[z][x] != null){
						if (trabalho[z][x].getSobrenome().equals("Erdos") && trabalho[z][x].getNome().equals("P.") ){
							trabalho[z][x].setPontuacao(0);							
						}
					}		
				}
			}
		}
		
		private void pontuar(){
			for(int r = 0; r < lotacao-1; r++){ // a pontuação maxima é  a lotação menos 1. Se tiver apenas o erdos a pontuação maxima e 0, se tiver o erdos e 1 pessoa a pontuacao maxima é 1.
				for(int z = 0; z < trabalho.length; z++){ // Para cada posição dA lista de autores vamos percorer cada posição trabalho
					for(int x = 0; x < trabalho[z].length; x++){
						if(trabalho[z][x] != null){
							if(trabalho[z][x].getPontuacao() == r ){ //Verificando se a pontuação é a da lista e pontuar todos no mesmo trabalho 
								for(int c = 0; c < trabalho[z].length ; c++){
									if(trabalho[z][c] != null){
										trabalho[z][c].setPontuacao(r+1);
										//System.out.print("r = " + r);
									}
								}
							}
						}
					}
				}
			}
		} 
		
		private void printAutores(){
			for(int z = 0; z < lotacao; z++){ 
					if(autores[z].getPontuacao() != 0){ // Nao imprimir o erdos
						System.out.print(autores[z].getFull() + " Pontos : ");
						if(autores[z].getPontuacao() == -1){
							System.out.print("infinito\n");
						} else{
							System.out.print(autores[z].getPontuacao() + "\n");
						}
					}
				
			}
			System.out.println();
		}
		
		private void ordenador(Autor[] a){
			Autor aux;
			for(int i = 0; i< lotacao-1; i++){
				for(int j = 0; j< lotacao-1; j++){
					if(a[j].getSobrenome().compareToIgnoreCase(a[j+1].getSobrenome()) > 0 ){ // Ordena por sobrenome
						aux = a[j];
						a[j] = a[j+1];
						a[j+1] = aux;	
					} else if (a[j].getSobrenome().compareToIgnoreCase(a[j+1].getSobrenome()) == 0 ){// em caso de empate no sobrenome ordena por nome
						if(a[j].getNome().compareToIgnoreCase(a[j+1].getNome()) > 0 ){
							aux = a[j];
							a[j] = a[j+1];
							a[j+1] = aux;	
						}
					}
				}
			}
		}	
}