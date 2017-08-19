
public class Professor {
		//Atributos
	private String nome;
	private String matricula;
	private String titula��o;
	private String CPF;
	

//-------------------------------------------------------------------------------------------------------------
	
			//M�todos
	
	//M�todo Get e Set
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getTitula��o() {
		return titula��o;
	}
	public void setTitula��o(String titula��o) {
		this.titula��o = titula��o;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
//-------------------------------------------------------------------------------------------------------------
	//M�todo ToString
	
	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", matricula=" + matricula + ", titula��o=" + titula��o + ", CPF=" + CPF
				+ ", getNome()=" + getNome() + ", getMatricula()=" + getMatricula() + ", getTitula��o()="
				+ getTitula��o() + ", getCPF()=" + getCPF() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	

	
//-------------------------------------------------------------------------------------------------------------
	
	//Metodo Construtor
	
	public Professor(String nome, String matricula, String titula��o, String cPF) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.titula��o = titula��o;
		CPF = cPF;
	}
	
}
