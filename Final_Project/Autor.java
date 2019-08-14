public class Autor {
	private String nome;
	private String sobrenome;
	private int pontuacao = -1;

	public Autor(String x){
		setNome(x.substring(0,2));
		setSobrenome( x.substring(3,x.length()).replace(".","") );
	}
	
	private void setNome(String n){
		this.nome = n;
	}

	private void setSobrenome(String s){
		this.sobrenome = s;
	}

	public String getFull(){
		return getNome()+" "+getSobrenome();
	}

	public String getNome(){
		return this.nome;
	}

	public String getSobrenome(){
		return this.sobrenome;
	}

	public int getPontuacao(){
		return this.pontuacao;
	}

	public void setPontuacao(int x){
		if(this.pontuacao == -1){
			this.pontuacao = x;
		}
	}

	public boolean iguais(Autor a){
		if(this.getFull().equals(a.getFull())){
			return true;
		}else{
			return false;
		}
	}	

}
