package personagens;

public class Pessoa {
	private String nomePessoa = null;//Nome completo da pessoa
	private String cpfPessoa = null;//CPF da pessoa
	private String fonePessoa = null;//Número de Telefone para contato
	private boolean statusPessoa = true;//Saber se a pessoa está ativa
	
	public Pessoa(String nome, String cpf, String fone){
		this.setNomePessoa(nome);
		this.setCpfPessoa(cpf);
		this.setFonePessoa(fone);
	}
	
	/* Início Encapsulamento */
		//Nome
		public String getNomePessoa() {
			return this.nomePessoa;
		}
		public void setNomePessoa(String nomePessoa) {
			this.nomePessoa = nomePessoa;
		}
		//CPF
		public String getCpfPessoa() {
			return this.cpfPessoa;
		}
		public void setCpfPessoa(String cpfPessoa) {
			this.cpfPessoa = cpfPessoa;
		}
		//Telefone
		public String getFonePessoa() {
			return this.fonePessoa;
		}
		public void setFonePessoa(String fonePessoa) {
			this.fonePessoa = fonePessoa;
		}
		//Pessoa Ativa ou não no Ambiente do Programa
		public boolean isStatusPessoa() {
			return statusPessoa;
		}
		public void setStatusPessoa(boolean statusPessoa) {
			this.statusPessoa = statusPessoa;
		}

	/* Fim Encapsulamento */
	
		
	/* ********************************************************** */
		
						/* Outros métodos */
		
	/* ********************************************************** */
	
	//Ver o nome e o CPF
		//Informação util quando se quer apenas mostrar os dados para o lançamento
	public String toString(){
		return "Nome: "+ this.getNomePessoa() + "\n" + "Fone: " + this.getFonePessoa() + "\n" + "CPF: " + this.getCpfPessoa();
	}
	
	
}
