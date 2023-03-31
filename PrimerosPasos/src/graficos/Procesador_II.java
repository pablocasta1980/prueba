package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;

public class Procesador_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MenuProcesador_II mimarco = new MenuProcesador_II();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

	}

}


class MenuProcesador_II extends JFrame{
	
	public MenuProcesador_II() {
		
		setBounds(700,200,550,450);
		
		LaminaProcesador milamina = new LaminaProcesador();
		
		add(milamina);
		
		setVisible(true);
		
		
	}
	
	
}


class LaminaProcesador extends JPanel{
	
	
	public LaminaProcesador() {
		
		setLayout(new BorderLayout());
		
		JPanel laminaMenu = new JPanel();
		
		JMenuBar mibarra = new JMenuBar();
		//---------------------------------------------------------------
		fuente = new JMenu("Fuente");
		
		estilo = new JMenu("Estilo");
		
		tamagno = new JMenu("Tamaño");
		
		configura_menu("Arial","fuente","Arial",9,10);
		
		configura_menu("Courier","fuente","Courier",9,10);
		
		configura_menu("Verdana","fuente","Verdana",9,10);
		
		//------------------------------------------------------------------
		
		configura_menu("Negrita","estilo","",Font.BOLD,1);
		
		configura_menu("Cursiva","estilo","",Font.ITALIC,1);
		
		/*JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita", new ImageIcon("imagenes/ima.png"));
		JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("Cursiva", new ImageIcon("imagenes/ima.png"));
		
		negrita.addActionListener(new StyledEditorKit.BoldAction());
		cursiva.addActionListener(new StyledEditorKit.ItalicAction());
		
		estilo.add(negrita);
		estilo.add(cursiva);*/
		
		//-------------------------------------------------------------
		
	/*	configura_menu("12","tamaño","",9,12);
		
		configura_menu("16","tamaño","",9,16);
		
		configura_menu("20","tamaño","",9,20);
		
		configura_menu("24","tamaño","",9,24);
		
	*/
		
		ButtonGroup tamagno_letra = new ButtonGroup();
		
		JRadioButtonMenuItem doce = new JRadioButtonMenuItem("12");
		
		JRadioButtonMenuItem dieciseis = new JRadioButtonMenuItem("16");
		
		JRadioButtonMenuItem veinte = new JRadioButtonMenuItem("20");
		
		JRadioButtonMenuItem veinticuatro = new JRadioButtonMenuItem("24");
		
		//veinticuatro.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,InputEvent.CTRL_DOWN_MASK));
		
		tamagno_letra.add(doce);
		
		tamagno_letra.add(dieciseis);
		
		tamagno_letra.add(veinte);
		
		tamagno_letra.add(veinticuatro);
		
		doce.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño",12));
		
		doce.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño",16));
		
		doce.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño",20));
		
		doce.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño",24));
		
		
		
		tamagno.add(doce);
		tamagno.add(dieciseis);
		tamagno.add(veinte);
		tamagno.add(veinticuatro);
		
		
		tamagno_letra.add(doce);
		tamagno_letra.add(dieciseis);
		tamagno_letra.add(veinte);
		tamagno_letra.add(veinticuatro);
		
		
		//--------------------------------------------------------------
		
		mibarra.add(fuente);
		
		mibarra.add(estilo);
		
		mibarra.add(tamagno);
		
		laminaMenu.add(mibarra);
		
		add(laminaMenu,BorderLayout.NORTH);
		
		miarea = new JTextPane();
		
		add(miarea,BorderLayout.CENTER);		
		
		JPopupMenu emergente = new JPopupMenu();
		
		JMenuItem negritaE = new JMenuItem("Negrita");
		
		JMenuItem cursivaE = new JMenuItem("Cursiva");
		
		negritaE.addActionListener(new StyledEditorKit.BoldAction());
		cursivaE.addActionListener(new StyledEditorKit.ItalicAction());
		
		emergente.add(negritaE);
		
		emergente.add(cursivaE);
		
		miarea.setComponentPopupMenu(emergente);
		
		//-------------------------------------------------------------
		
		/*JToolBar barra = new JToolBar();
		
		JButton negritaBarra = new JButton(new ImageIcon("imagenes/negrita.gif"));
		
		JButton cursivaBarra = new JButton(new ImageIcon("imagenes/cursiva.gif"));
		
		JButton subraBarra = new JButton(new ImageIcon("imagenes/subrayado.gif"));
		
		//------------------------------------------------------------------
		
		JButton azulBarra = new JButton(new ImageIcon("imagenes/azul.gif"));
		
		JButton amarilloBarra = new JButton(new ImageIcon("imagenes/amarillo.gif"));
		
		JButton rojoBarra = new JButton(new ImageIcon("imagenes/rojo.gif"));
		
		//-----------------------------------------------------------------
		
		JButton a_izquierda = new JButton(new ImageIcon("imagenes/alizquierda.gif"));
		
		JButton a_centrado = new JButton(new ImageIcon("imagenes/alcentrado.gif"));
		
		JButton a_derecha = new JButton(new ImageIcon("imagenes/alderecha.gif"));
		
		JButton a_justificado = new JButton(new ImageIcon("imagenes/aljustificado.gif"));
		
		//------------------------------------------------------------------------
		
		negritaBarra.addActionListener(new StyledEditorKit.BoldAction());
		
		cursivaBarra.addActionListener(new StyledEditorKit.ItalicAction());
		
		subraBarra.addActionListener(new StyledEditorKit.UnderlineAction());
		
		//-----------------------------------------------------------------------------
		
		azulBarra.addActionListener(new StyledEditorKit.ForegroundAction("poner azul",Color.BLUE));
		
		amarilloBarra.addActionListener(new StyledEditorKit.ForegroundAction("poner amarillo",Color.YELLOW));
		
		rojoBarra.addActionListener(new StyledEditorKit.ForegroundAction("poner rojo",Color.RED));
		
		//----------------------------------------------------------------------------
		
		a_izquierda.addActionListener(new StyledEditorKit.AlignmentAction("alinea izquierda",0));
		
		a_centrado.addActionListener(new StyledEditorKit.AlignmentAction("alinea centrado",1));
		
		a_derecha.addActionListener(new StyledEditorKit.AlignmentAction("alinea derecha",2));
		
		a_justificado.addActionListener(new StyledEditorKit.AlignmentAction("alinea justificado",3));
		
		//-----------------------------------------------------------------------------
		
		barra.add(negritaBarra);
		
		barra.add(cursivaBarra);
		
		barra.add(subraBarra);
		
		barra.add(azulBarra);
		
		barra.add(amarilloBarra);
		
		barra.add(rojoBarra);
		
		barra.add(a_izquierda);
		
		barra.add(a_centrado);
		
		barra.add(a_derecha);
		
		barra.add(a_justificado);
		
		*/
		
		barra = new JToolBar();
		
		configura_barra("imagenes/negrita.gif").addActionListener(new StyledEditorKit.BoldAction());
		
		configura_barra("imagenes/cursiva.gif").addActionListener(new StyledEditorKit.ItalicAction());
		
		configura_barra("imagenes/subrayado.gif").addActionListener(new StyledEditorKit.UnderlineAction());
		
		barra.addSeparator();
		
		configura_barra("imagenes/azul.gif").addActionListener(new StyledEditorKit.ForegroundAction("poner azul",Color.BLUE));
		
		configura_barra("imagenes/rojo.gif").addActionListener(new StyledEditorKit.ForegroundAction("poner rojo",Color.RED));
		
		configura_barra("imagenes/amarillo.gif").addActionListener(new StyledEditorKit.ForegroundAction("poner amarillo",Color.YELLOW));
		
		barra.addSeparator();
		
		configura_barra("imagenes/alizquierda.gif").addActionListener(new StyledEditorKit.AlignmentAction("alinea izquierda",0));
		
		configura_barra("imagenes/alcentrado.gif").addActionListener(new StyledEditorKit.AlignmentAction("alinea centrado",1));
		
		configura_barra("imagenes/alderecha.gif").addActionListener(new StyledEditorKit.AlignmentAction("alinea derecha",2));
		
		configura_barra("imagenes/aljustificado.gif").addActionListener(new StyledEditorKit.AlignmentAction("alinea justificado",3));
		
		barra.setOrientation(1);
		
		add(barra,BorderLayout.WEST);
		
		
	}
	
	
	public JButton configura_barra(String ruta) {
		
		
		JButton boton = new JButton(new ImageIcon(ruta));
		
		barra.add(boton);
		
		return boton;
		
	}
	
	
	public void configura_menu(String rotulo, String menu, String tipo_letra,int estilos, int tam) {
		
		
		JMenuItem elem_menu = new JMenuItem(rotulo);
		
		if(menu=="fuente") {
			
			fuente.add(elem_menu);
			
			if(tipo_letra == "Arial") {
				
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra","Arial"));
				
			}else if(tipo_letra == "Courier") {
				
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra","Courier"));
				
			}else if(tipo_letra == "Verdana") {
				
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra","Verdana"));
				
			}
			
			
		}else if(menu=="estilo") {
			
			estilo.add(elem_menu);
			
			if(estilos == Font.BOLD) {
				
				elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));
				
				elem_menu.addActionListener(new StyledEditorKit.BoldAction());
				
			}else if(estilos==Font.ITALIC) {
				
				elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K,InputEvent.CTRL_DOWN_MASK));
			
				elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
			
			}
			
		}else if(menu=="tamaño") {
			
			tamagno.add(elem_menu);
			
			elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño",tam));
		}
		
		
		
	}
		
	
	
	JTextPane miarea;
	
	JMenu fuente,estilo,tamagno;
	
	Font letras;
	
	JButton negritaBarra,cursivaBarra,subraBarra,azulBarra,rojoBarra,amarilloBarra,a_izquierda,a_centrado,a_derecha,a_justificado;
	
	
	JToolBar barra;
	
}





