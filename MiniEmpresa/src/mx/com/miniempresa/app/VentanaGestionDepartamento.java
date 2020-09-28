package mx.com.miniempresa.app;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import mx.com.miniempresa.model.Empleado;
import mx.com.miniempresa.service.GestionDepartamentalBO;

public class VentanaGestionDepartamento extends JFrame{
	
	
	private GestionDepartamentalBO gestionDepartamentalBO = GestionDepartamentalBO.generarInstancia();
	
	public VentanaGestionDepartamento() {
		super("Ventana Gestion Departamento");
		getContentPane().setLayout(new FlowLayout());
		initicializarComponentes();
		setSize(700, 500);
		
	}
	
	private void initicializarComponentes() {
		JLabel etiqueta = new JLabel("Nombre");
		
		
		JTextField campoTexto = new JTextField("", 20);
		
		JButton boton = new JButton("Guardar");
		
		boton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Empleado nuevoEmpleado = new Empleado();
				nuevoEmpleado.setNombre(campoTexto.getText());
				int resultado = gestionDepartamentalBO.agregarEmpleadoBO(nuevoEmpleado);
				if (resultado == 0) {
					JOptionPane.showMessageDialog(null, "El usuario se guardo con exito");
					campoTexto.setText("");
				}else {
					JOptionPane.showMessageDialog(null, "El usuario no se puede guardar");
					campoTexto.setBackground(Color.RED);
				}
			}
		});

		getContentPane().add(etiqueta);
		getContentPane().add(campoTexto);
		getContentPane().add(boton);
	}
	
	
	
}
