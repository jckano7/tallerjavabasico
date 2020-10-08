package mx.com.miniempresa.app;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import mx.com.miniempresa.model.Empleado;
import mx.com.miniempresa.service.GestionDepartamentalBO;

public class VentanaGestionDepartamento extends JFrame{
	
	public VentanaGestionDepartamento() {//se genera el constructor
		super("Ventana Gestion Departamento");//se manda a llamar el constructor de su papá(o sea el JFrame)
		getContentPane().setLayout(new FlowLayout());
		inicializarComponentes();
		setSize(700,500);
	}
	
	private void inicializarComponentes() {
		JLabel etiqueta = new JLabel("Nombre");
		
		JTextField campoTexto = new JTextField("Ingresa Nombre",20);
		
		JButton boton = new JButton("Ejecutar");
		
		//listeners
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Empleado nuevoEmpleado = new Empleado();
				nuevoEmpleado.setNombre(campoTexto.getText());
				
			}
		});
		
		getContentPane().add(etiqueta);
		getContentPane().add(campoTexto);
		getContentPane().add(boton);
	}

}
