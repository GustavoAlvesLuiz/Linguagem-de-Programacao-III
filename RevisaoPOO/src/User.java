

public abstract class User {
	private String nome, birthDate;
	private int id;
	
	protected User(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public int getId() {
		return id;
	}
	
	public String formatPersonalData() {
//		return "Id:" + this.id + "Nome": + this.nome;
		return String.format("ID: %d\nNome: %s\n ", this.id, this.nome);
	}
	
	
}
