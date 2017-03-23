package personagens;

import java.util.ArrayList;

import acessorios.RegistroAP;

/* Esta classe define os seres Humanos que compõe o grupo de membros do
 * sistema, com a diferença entre alunos e instrutores dada por um atributo
 * Regras:
 * 1 - Nenhum dos dados pode faltar aqui.
 * */


public class Membro extends Pessoa{
	/*Como é um atributo específico desta classe */
	private String nRenach = null;
	/* Este Array serve para armazenar todos os registros de aulas Práticas do membro */
	private ArrayList<RegistroAP> fichaAP;
	private ArrayList<RegistroAP> fichaAT;
	/* a - aluno, i - instrutor */
	private char aliasMembro;
	
	
	public Membro(String nome, String cpf, String fone, String renach, char alias) {
		super(nome, cpf, fone);
		this.setnRenach(renach);
		this.setAliasMembro(alias);
	}	
	/* Este caso é muito útil quando se carregar as informações do XML, mas ainda preciso avaliar isso */
	public Membro(String nome, String cpf, String fone, char alias, ArrayList<RegistroAP> f) {
		super(nome, cpf, fone);
		this.setAliasMembro(alias);
		this.setFichaAP(f);
	}
	
	/* Encapsulamento */
		public String getnRenach() {
			return nRenach;
		}
		public void setnRenach(String nRenach) {
			this.nRenach = nRenach;
		}
		public ArrayList<RegistroAP> getFichaAP() {
			return fichaAP;
		}
		public void setFichaAP(ArrayList<RegistroAP> fichaAP) {
			this.fichaAP = fichaAP;
		}	
		//public ArrayList<RegistroAT> getFichaAT() {
			//return fichaAT;
		//}
		//public void setFichaAT(ArrayList<RegistroAT> ficha) {
			//this.fichaAT = ficha;
		//}
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

	/* Adicionar novo registro */	
	public void addRegistro(RegistroAP nR){//nR - new Register
		this.fichaAP.add(nR);
	}
	/* Remover um registro por id */
	public boolean delRegistro(String id){
		for(RegistroAP r : this.fichaAP){
			if(id == r.getCodAulaRegistro()){
				this.fichaAP.remove(r);
				return true;
			}
		}
		return false;
	}
	/* Saber que tipo de membro este é */
	public String tipoMembro(){
		if(this.getAliasMembro() == 'a'){
			return "Aluno";
		}
		if(this.getAliasMembro() == 'i'){
			return "Instrutor";
		}
		return "Inválida";
	}
	/* Destrui fichas */
	public void zerarFicha(){
		this.getFichaAP().clear();
		this.fichaAT.clear();
	}
	/* Consultar membro */
	public String toString(){
		return super.toString() + "\nRenach: " + this.getnRenach() + "\nModalidade: " + this.tipoMembro();
	}
	
	/* Consultar registro por id, talvez seja util */
	public RegistroAP verRegistro(String id){
		for(RegistroAP r : this.fichaAP){
			if(id == r.getCodAulaRegistro()){
				/* Se o id for igual ao do que eu estou procurando, é só retornar ele */
				return r;
			}
		}
		/* Para o caso de não encontrar o cara */
		return null;
	}
}
