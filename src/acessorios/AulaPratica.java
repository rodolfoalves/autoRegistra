package acessorios;

/* @author Jhonsef Pires
 * Esta classe é reposnsável por armazenar os dados das aulas práticas
 * Regras:
 * 	1 - As Aulas podem ser registradas com pelo menos a digital do Aluno;
 * 	2 - Uma aula será dada como finalizada, quando possuir também a digital do Instrutor
 * 	3 - Uma aula será dada como completa, quando o ADM selecionar que ela já foi lançada no Sistema
 * 
 * */

import personagens.Membro;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/* @author Jhonsef Pires
 * 
 * Este elemento é o pacote de informações sobre uma aula prática individual
 * Pensando nesta classe como um pacote que armazena apenas a informação básica
 * sobre uma aula prática. Seguindo o seguinte caminho: Armazena apenas o id da Aula, 
 * comum a aula, ao instrutor e ao aluno, para que, com o id em mãos, possa
 * buscar informações sobre o Intrutor e o Aluno
 */

public class AulaPratica {
	private String idAP = null;
	private Date dataAP = null;
	private short completa = 0;
	private short lancada = 0;
	private char categoria = '?';
	
	
	
	/* Encapsulamento */
		public String getIdAP() {
			return idAP;
		}
		public void setIdAP(String idAP) {
			this.idAP = idAP;
		}
		public Date getDataAP() {
			return dataAP;
		}
		//public void setDataAP(Date dataAP) {
		//	this.dataAP = dataAP;
		//}
		public short getCompleta() {
			return completa;
		}
		public void setCompleta(short completa) {
			this.completa = completa;
		}
		public short getLancada() {
			return lancada;
		}
		public void setLancada(short lancada) {
			this.lancada = lancada;
		}
		public char getCategoria() {
			return categoria;
		}
		public void setCategoria(char categoria) {
			this.categoria = categoria;
		}
	/* Fim do Encapsulamento */
	
	/* ********************************************************** */
		
						/* Outros métodos */
		
	/* ********************************************************** */
		
	/* Funcionamento básico deste método:
	 * 1 - Ele recebe uma lista contendo todos os membros
	 * 2 - Testa membro por membro até o fim da lista
	 * 3 - Esse teste (2) consiste em passar, para um outro método, a ficha
	 * do aluno, afim de identificar qual, dentre os registros, tem o mesmo id
	 * que a aula.
	 * 4 - Quando o aluno é encontrado, é retornado o próprio aluno
	 *  */
	public Membro buscarMembro(ArrayList<Membro> membros, char c){
		for(Membro m : membros){
			/* Para não retornar aluno no lugar de professor, fazer isso */
			if(this.buscarRegistro(m.getFicha()) && (m.getAliasMembro() == c)){
				return m;
			}
		}
		/* Quando retornar null, é pq aluno não há para esta aula */
		return null;
	}
	/* Funcionamento básico deste método:
	 * 1 - Recebe uma lista de Registros para consultar
	 * 2 - Teste 1 a 1 para saber quais deles tem o mesmo id que a aula
	 * 3 - Retorna true se encontrou algum registro com mesmo id
	 *  */
	public boolean buscarRegistro(ArrayList<RegistroAP> ficha){
		for(RegistroAP r : ficha){
			if(this.getIdAP() == r.getCodAulaRegistro()){
				return true;
			}
		}
		return false;
	}
	
	
}
