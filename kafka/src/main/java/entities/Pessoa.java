package entities;

public class Pessoa {
	
	private String nome;
	private String idade;
	private String sobrenome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	@Override
	public String toString() {
		return "{\n\t\tnome=" + nome + ",\n\\t\\tidade=" + idade + ",\n\\t\\tsobrenome=" + sobrenome + "\n}";
	}
	
	
}
