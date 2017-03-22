package personagens;

import java.util.ArrayList;

import acessorios.RegistroAP;

/* Esta classe define os seres Humanos que compõe o grupo de membros do
 * sistema, com a diferença entre alunos e instrutores dada por um atributo
 * 
 * */



public class Membro extends Pessoa{
	private String nRenach = null;//Como é um atributo específico desta classe, o nº do Renach Está Aqui
	private ArrayList<RegistroAP> ficha;
	private char aliasMembro;// a - aluno, i - instrutor
	
	public Membro(String nome, String cpf, String fone, String renach, char alias) {
		super(nome, cpf, fone);
		this.setnRenach(renach);
		this.setAliasMembro(alias);
	}	
	//Este caso é muito útil quando se carregar as informações do XML
	public Membro(String nome, String cpf, String fone, char alias, ArrayList<RegistroAP> f) {
		super(nome, cpf, fone);
		this.setAliasMembro(alias);
		this.setFicha(f);
	}
	
	/* Encapsulamento */
		public String getnRenach() {
			return nRenach;
		}
		public void setnRenach(String nRenach) {
			this.nRenach = nRenach;
		}
		public ArrayList<RegistroAP> getFicha() {
			return ficha;
		}
		public void setFicha(ArrayList<RegistroAP> ficha) {
			this.ficha = ficha;
		}
		public char getAliasMembro() {
			return aliasMembro;
		}
		public void setAliasMembro(char aliasMembro) {
			this.aliasMembro = aliasMembro;
		}
	/* Fim do Encapsulamento  */
	
	
	/* ********************************************************** */
		
		/* Outros métodos */

	/* ********************************************************** */

	//Adicionar novo registro	
	public void addRegistro(RegistroAP nR){//nR - new Register
		this.ficha.add(nR);
	}
	//Remover um registro por id
	public boolean delRegistro(String id){
		for(RegistroAP r : this.ficha){
			if(id == r.getCodAulaRegistro()){
				this.ficha.remove(r);
				return true;
			}
		}
		return false;
	}
	
	public String tipoMembro(){
		if(this.getAliasMembro() == 'a'){
			return "Aluno";
		}
		if(this.getAliasMembro() == 'i'){
			return "Instrutor";
		}
		return "Inválida";
	}
	
	
	//Consultar membro
	public String toString(){
		return super.toString() + "\nRenach: " + this.getnRenach() + "\nModalidade: " + this.tipoMembro();
	}
	
	//Consultar registro por id, talvez seja util
	public RegistroAP verRegistro(String id){
		for(RegistroAP r : this.ficha){
			if(id == r.getCodAulaRegistro()){
				//Se o id for igual ao do que eu estou procurando, é só retornar ele
				return r;
			}
		}
		//Para o caso de não encontrar o cara
		return null;
	}
	
	
}
