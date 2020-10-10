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

import mx.com.miniempresa.model.Ventas;
import mx.com.miniempresa.service.GestionVentasBO;

public class VentanaGestionVentas extends JFrame {
	
	private GestionVentasBO gestionVentasBO= GestionVentasBO.generarInstancia();

	public VentanaGestionVentas() {
		super("Ventana Gestion de Ventas");
		getContentPane().setLayout(new FlowLayout());
		inicializarComponentes();
		setSize(1000,300);
		this.getContentPane().setBackground(Color.pink);;
	}
	
	private void inicializarComponentes() {
		JLabel etiqueta= new JLabel("Producto");
		JTextField texto= new JTextField("Ingresa el nombre del producto que se vendió: ");
		JButton boton1= new JButton("Guardar");
		
		boton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Ventas nuevaVenta= new Ventas();
				nuevaVenta.setProducto(texto.getText());
				int resultado = gestionVentasBO.agregarVentasBO(nuevaVenta);
				if (resultado == 0) {
					JOptionPane.showMessageDialog(null, "El usuario se guardo con exito");
					texto.setText("");
				}else {
					JOptionPane.showMessageDialog(null, "El usuario no se puede guardar");
					texto.setBackground(Color.blue);
				}
			}
		});
		
		getContentPane().add(etiqueta);
		getContentPane().add(texto);
		getContentPane().add(boton1);
	}
}
