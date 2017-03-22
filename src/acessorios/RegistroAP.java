package acessorios;

import java.text.SimpleDateFormat;
import java.util.Date;

/* @author Jhonsef Pires
 * 
 * Este elemento é o responsável por 
 * armazenar os dados de uma aula prática,
 * 
 * */


public class RegistroAP {
	private String codRegistro = null;//Aqui fica armazenado o codigo dado pelo detran
	private char tipoRegistro = '?';/* t-teorica, p-pratica */
	private char categoriaRegistro = '?';/*b-carro, a-moto, s-sala*/
	/* Quando o registro for lançado, alterar o estado do atributo abaixo, e garantir que fique verde */
	/* private boolean statusRegistro = false;/* false- não lançado, true- lançado*/
	/* A data é gerada automaticamente no momento em que é criado um novo registro*/
	private Date data; 
	/* O atributo abaixo, é propriamente o id do registro
	 * servirá para criar um link entre o registro do Aluno e o do Professor.
	 * Dessa forma, será mais fácil identificar uma aula prática. */
	private String codAulaRegistro;//Aqui está o id
	
	
	/*Neste ponto será exigido, de quem chamar o construtor, todos os dados para lançar à ficha da pessoa*/
	public RegistroAP(String cod, char tipo, char categoria){
		/* O código que vem de lá pode ser de duas formas, o código mesmo, ou uma String contendo "?????"
		 * Isso vai facilitar na hora de fazer os testes*/
		this.setCodRegistro(cod);
		/* O tipo será definido pela jalena que chamar esse construtor, ela vai repassar essa informação */
		this.setTipoRegistro(tipo);
		/* Este item também vem junto automaticamente */
		this.setCategoriaRegistro(categoria);
		/* A data fica sob responsabilidade do programa */
		this.data = new Date();
	}
	
	/* Início Encapsulameto */
	
		//Retornar o código do registro
		public String getCodRegistro() {
			return codRegistro;
		}
		//Alterar o código do registro
		/* Esta parte é importante quando se quer adicionar o cod do instrutor, quando não fora adicionado */
		public void setCodRegistro(String codRegistro) {
			this.codRegistro = codRegistro;
		}
		//Retornar o tipo do Registro
		public char getTipoRegistro() {
			return tipoRegistro;
		}
		//Alterar o tipo do Registro
		/* Tomar cuidado com esse método abaixo */
		public void setTipoRegistro(char tipoRegistro) {
			this.tipoRegistro = tipoRegistro;
		}
		//Retornar a categoria do Registro
		public char getCategoriaRegistro() {
			return categoriaRegistro;
		}
		//Alterar a categora do Registro
		/* Tomar cuidado com esse método abaixo */
		public void setCategoriaRegistro(char categoriaRegistro) {
			this.categoriaRegistro = categoriaRegistro;
		}
		//Id do registro
		public String getCodAulaRegistro() {
			return codAulaRegistro;
		}
		public void setCodAulaRegistro(String codAulaRegistro) {
			this.codAulaRegistro = codAulaRegistro;
		}
	/* Fim Encapsulamento */
	
	
	/* Outros métodos */
	/* Mostrar data do Registro*/
	public void verDataRegistro(){
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(this.data));
		//System.out.println(this.data);
		//Isso acima é um teste, penso que a data pode ser 
		//o id.
	}
	
	/* Mostrar código do Regstro */
	public void verCodRegistro(){
		System.out.println(this.codRegistro);
	}
	/* Mostrar tipo do Registro*/
	public void verTipoRegistro(){
		System.out.println(this.tipoRegistro);
	}
	
	/* Mostrar categoria do Registro */
	public void verCatRegistro(){
		System.out.println(this.categoriaRegistro);
	}
	
	
}

