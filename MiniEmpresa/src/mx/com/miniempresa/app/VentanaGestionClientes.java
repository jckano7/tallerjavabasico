package mx.com.miniempresa.app;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import mx.com.miniempresa.model.Clientes;
import mx.com.miniempresa.model.Empleado;
import mx.com.miniempresa.service.GestionClienteBO;
import mx.com.miniempresa.service.GestionDepartamentalBO;

public class VentanaGestionClientes extends JFrame{

	private GestionClienteBO gestionClienteBO =  GestionClienteBO.generarInstancia();
	
	public VentanaGestionClientes() {
			super("Agregar Cliente");
			getContentPane().setLayout(new FlowLayout());
			inicializarComponentes();
			setSize(900,200);
	}
	
	public void inicializarComponentes(){
		JLabel etiquetaNombres = new JLabel("Nombres");
		JTextField entryNombres = new JTextField(10);
		
		JLabel etiquetaApellidos = new JLabel("Apellidos");
		JTextField entryApellidos = new JTextField(10);
		
		JLabel etiquetaEdad = new JLabel("Edad");
		JTextField entryEdad = new JTextField(10);
		
		JLabel etiquetaCompania = new JLabel("Compa�ia");
		JTextField entryCompania = new JTextField(10);
		
		JLabel etiquetaIngresosMensuales = new JLabel("Ingreso Mensual");
		JTextField entryIngresosMensuales = new JTextField(10);
		

		
		JButton boton = new JButton("Guardar");
        
        
        
        
        boton.addActionListener((ActionListener) new ActionListener() {
			
        	  public void actionPerformed(ActionEvent e) {
        		 
        		  Empleado empleado1 = new Empleado();
        		  Clientes clienteN = new Clientes();
        		  
        		  clienteN.setNombres(entryNombres.getText());
        		  clienteN.setNombres(entryApellidos.getText());
        		  clienteN.setNombres(entryEdad.getText());
        		  clienteN.setNombres(entryCompania.getText());
        		  clienteN.setNombres(entryIngresosMensuales.getText());
        		  gestionClienteBO.agregarclienteBO(clienteN);
					
        			  JOptionPane.showMessageDialog(null, "Se guardo correcto");
	
        		  
        	  }	
        	});
        
        
        
		getContentPane().add(etiquetaNombres);
		getContentPane().add(entryNombres);
		
		getContentPane().add(etiquetaApellidos);
		getContentPane().add(entryApellidos);
		
		getContentPane().add(etiquetaEdad);
		getContentPane().add(entryEdad);
		
		getContentPane().add(etiquetaCompania);
		getContentPane().add(entryCompania);
		
		getContentPane().add(etiquetaIngresosMensuales);
		getContentPane().add(entryIngresosMensuales);
		
		getContentPane().add(boton);
		

		
	}
	

	
}
