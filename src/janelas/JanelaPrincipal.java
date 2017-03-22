package janelas;

import java.awt.Dimension;
import java.awt.FlowLayout;
//import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JanelaPrincipal extends JFrame{
	JButton botaoVerAP;//Botão para ver aulas Práticas
	JButton botaoVerAT;//Botão para ver aulas Teóricas
	
	JButton botaoAddAula;//Botão adicionar aulas
	JButton botaoAddAluno;//Botão para adicionar aluno
	JButton botaoAddInstrutor;//Botão para adicionar instrutor

	
	public JanelaPrincipal(){
		super("AutoRegistro");//Título da Janela Principal
		this.loadJanela();
		this.loadButoes();
	}
	
	private void loadJanela(){
		//Capturar Tamanho da Tela
		Toolkit tk = Toolkit.getDefaultToolkit();
	    Dimension dT = tk.getScreenSize();
	    //Estes dados serão usados para centralizar a janela
	    int wT = (int)dT.getWidth();//Largura da Tela
	    int hT = (int)dT.getHeight();//Altura da Tela

		this.setBounds(((wT/2)-250), ((hT/2)-300), 500, 600);//Janela Centralizada
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
	}
	
	
	private void loadButoes(){		
		//Menu de Visão
		JLabel lV = new JLabel("Menu de Visão");
		this.add(lV);
		//Botão da Aula Teórica
		this.botaoVerAT = new JButton("Ver Aulas Teóricas");
		this.add(botaoVerAT);
		
		//Botão da Aula prática
		this.botaoVerAP = new JButton("Ver Aulas Práticas");
		this.add(botaoVerAP);
		
		/* ********************************************************* */
		
		//Menu de Adição
		JLabel lA = new JLabel("Menu de Adição");
		this.add(lA);
		//Botão de Add Aula
		this.botaoAddAula = new JButton("Novas Aulas");
		this.add(botaoAddAula);		
		
		this.botaoAddAluno = new JButton("Novo Aluno");
		this.add(botaoAddAluno);
		
		this.botaoAddInstrutor = new JButton("Novo Instrutor");
		this.botaoAddInstrutor.setSize(200, 200);
		this.add(botaoAddInstrutor);
		
	}
	
}
