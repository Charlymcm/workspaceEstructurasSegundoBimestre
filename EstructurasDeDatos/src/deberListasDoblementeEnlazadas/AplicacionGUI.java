package deberListasDoblementeEnlazadas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AplicacionGUI extends JFrame implements ActionListener{

	private JLabel lblInsertar, lblEliminar, lblBuscar, lblRellenoEliminar, lblRellenoBorrar, lblRellenoSalir;
	private JButton btnInsInicio, btnInsFinal, btnElimInicio, btnElimFinal, btnElimIndice, btnElimNombre, btnBuscIndice, btnBuscNombre, btnBorrar, btnRecorrer, btnSalir;
	private JTextField txtInsInicio, txtInsFinal, txtElimInicio, txtElimFinal, txtElimIndice, txtElimNombre, txtBuscIndice, txtBuscNombre;
	private JTextArea txaDesplegar;
	private JPanel pnlGUI, pnlDesplegar;
	Font fuenteLetra = new Font("Arial", Font.ITALIC, 12);


	void LimpiarGUI(){
		txtInsInicio.setText(null);
		txtInsInicio.setText(null); 
		txtInsFinal.setText(null);
		txtElimInicio.setText(null); 
		txtElimFinal.setText(null);
		txtElimIndice.setText(null); 
		txtElimNombre.setText(null); 
		txtBuscIndice.setText(null); 
		txtBuscNombre.setText(null);	
	}

	public AplicacionGUI(){

		JFrame ventana = new JFrame(); 
		ventana.setSize(1028, 740);  
		ventana.setLocation(0, 25);  
		ventana.setTitle("Listas Doblemente Enlazadas");  
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pnlCont = new JPanel();
		JPanel pnlGrid = new JPanel();
		JPanel pnlFlow = new JPanel();

		ventana.setContentPane(pnlCont);
		ventana.setVisible(true);
		pnlCont.add(pnlGrid);
		pnlCont.add(pnlFlow);
		//pnlGrid.setBounds( 10, 200, 100, 100 );
		pnlCont.setLayout(new GridLayout(2,1));

		pnlGUI = new JPanel();
		pnlGUI.setLayout(new  GridLayout(5,5,2,20));
		pnlGrid.add(pnlGUI);
		pnlGrid.setBackground(Color.DARK_GRAY);

		pnlDesplegar = new JPanel();
		pnlDesplegar.setBounds(100, 100, 100, 20);
		pnlFlow.add(pnlDesplegar);
		pnlFlow.setBackground(Color.DARK_GRAY);

		/*                                   	*/ 
		lblInsertar = new JLabel("Insertar");
		//lblInsertar.setToolTipText( "" );
		pnlGUI.add(lblInsertar);
		lblInsertar.setVisible(true);

		btnInsInicio = new JButton();
		btnInsInicio.setText("Al Inicio");
		pnlGUI.add(btnInsInicio);
		btnInsInicio.setActionCommand("Al Inicio");
		btnInsInicio.addActionListener(this);
		btnInsInicio.setBackground(Color.WHITE);

		txtInsInicio = new JTextField(6);
		pnlGUI.add(txtInsInicio);

		btnInsFinal = new JButton();
		btnInsFinal.setText("Al Final");
		pnlGUI.add(btnInsFinal);
		btnInsFinal.setActionCommand("Al Final");
		btnInsFinal.addActionListener(this);
		btnInsFinal.setBackground(Color.WHITE);

		txtInsFinal = new JTextField(6);
		pnlGUI.add(txtInsFinal);

		/*                                   	*/
		lblEliminar = new JLabel("Eliminar");
		//lblEliminar.setToolTipText( "" );
		pnlGUI.add(lblEliminar);
		lblEliminar.setVisible(true);

		btnElimInicio = new JButton();
		btnElimInicio.setText("Al Inicio.");
		pnlGUI.add(btnElimInicio);
		btnElimInicio.setActionCommand("Al Inicio.");
		btnElimInicio.addActionListener(this);
		btnElimInicio.setBackground(Color.WHITE);

		txtElimInicio = new JTextField(6);
		pnlGUI.add(txtElimInicio);

		btnElimFinal = new JButton();
		btnElimFinal.setText("Al Final.");
		pnlGUI.add(btnElimFinal);
		btnElimFinal.setActionCommand("Al Final.");
		btnElimFinal.addActionListener(this);
		btnElimFinal.setBackground(Color.WHITE);

		txtElimFinal = new JTextField(6);
		pnlGUI.add(txtElimFinal);

		lblRellenoEliminar = new JLabel("Aqui no hay nada");
		//lblRellenoEliminar.setToolTipText( "" );
		pnlGUI.add(lblRellenoEliminar);
		lblRellenoEliminar.setVisible(false);

		btnElimIndice = new JButton();
		btnElimIndice.setText("Por Indice");
		pnlGUI.add(btnElimIndice);
		btnElimIndice.setActionCommand("Por Indice");
		btnElimIndice.addActionListener(this);
		btnElimIndice.setBackground(Color.WHITE);

		txtElimIndice = new JTextField(6);
		pnlGUI.add(txtElimIndice);

		btnElimNombre = new JButton();
		btnElimNombre.setText("Por Nombre");
		pnlGUI.add(btnElimNombre);
		btnElimNombre.setActionCommand("Por Nombre");
		btnElimNombre.addActionListener(this);
		btnElimNombre.setBackground(Color.WHITE);

		txtElimNombre = new JTextField(6);
		pnlGUI.add(txtElimNombre);	

		/*                                   	*/
		lblBuscar = new JLabel("Buscar");
		//lblBuscar.setToolTipText( "" );
		pnlGUI.add(lblBuscar);
		lblBuscar.setVisible(true);

		btnBuscIndice = new JButton();
		btnBuscIndice.setText("Por �ndice");
		pnlGUI.add(btnBuscIndice);
		btnBuscIndice.setActionCommand("Por �ndice");
		btnBuscIndice.addActionListener(this);
		btnBuscIndice.setBackground(Color.WHITE);

		txtBuscIndice = new JTextField(6);
		pnlGUI.add(txtBuscIndice);	

		btnBuscNombre = new JButton();
		btnBuscNombre.setText("Por Nombre.");
		pnlGUI.add(btnBuscNombre);
		btnBuscNombre.setActionCommand("Por Nombre.");
		btnBuscNombre.addActionListener(this);
		btnBuscNombre.setBackground(Color.WHITE);

		txtBuscNombre = new JTextField(6);
		pnlGUI.add(txtBuscNombre);	

		lblRellenoBorrar = new JLabel("Aqui no hay nada.x2");
		//lblRellenoLimpiar.setToolTipText( "" );
		pnlGUI.add(lblRellenoBorrar);
		lblRellenoBorrar.setVisible(false);

		btnRecorrer = new JButton();
		btnRecorrer.setText("Recorrer");
		pnlGUI.add(btnRecorrer);
		btnRecorrer.setActionCommand("Recorrer");
		btnRecorrer.addActionListener(this);
		btnRecorrer.setBackground(Color.WHITE);
		
		btnBorrar = new JButton();
		btnBorrar.setText("Borrar");
		pnlGUI.add(btnBorrar);
		btnBorrar.setActionCommand("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBackground(Color.WHITE);

		btnSalir = new JButton();
		btnSalir.setText("Salir");
		pnlGUI.add(btnSalir);
		btnSalir.setActionCommand("Salir");
		btnSalir.addActionListener(this);
		btnSalir.setBackground(Color.WHITE);

		txaDesplegar = new JTextArea(20,100);
		txaDesplegar.setEditable(false);
		pnlDesplegar.add(txaDesplegar);
		txaDesplegar.setFont(fuenteLetra);

	}

	public static void main( String args[] ){ 
		AplicacionGUI aplicacion = new AplicacionGUI();
		aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		String a = e.getActionCommand();
		Lista lista = new Lista();
		int opcion, opcion2, opciones, opciones2;
		String salida = "";
		Libro libro = new Libro();


		if(a.equals("Al Inicio")){
			lista.insertarAlInicio(libro);
			salida += lista.toString();
			//txaDesplegar.setText(lista);
			JOptionPane.showMessageDialog(null, lista);
		}

		if(a.equals("Al Final")){
			lista.insertarAlFinal(libro);
			salida += lista.toString();
			//txaDesplegar.append(lista);
			JOptionPane.showMessageDialog(null, lista);
		}

		if(a.equals("Al Inicio.")){

		}

		if(a.equals("Al Final.")){

		}

		if(a.equals("Por Indice")){

		}

		if(a.equals("Por Nombre")){

		}

		if(a.equals("Por �ndice")){

		}

		if(a.equals("Por Nombre.")){

		}

		if(a.equals("Recorrer")){
			LimpiarGUI();
		}
		
		if(a.equals("Borrar")){
			LimpiarGUI();
		}

		if(a.equals("Salir")){
			System.exit(0);
		}
	}
}
