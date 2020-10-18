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
		JLabel etiqueta= new JLabel("Producto: ");
		JTextField texto= new JTextField(10);
		
		JLabel etiquetaPrecio=new JLabel("Precio: ");
		JTextField textoPrecio =new JTextField(5);
		
		JLabel etiquetaGanancia=new JLabel("Ganancia: ");
		JTextField textoGanancia =new JTextField(10);
		
		JLabel etiquetaFecha=new JLabel("Fecha de la Venta: ");
		JTextField textoFecha =new JTextField(10);
		
		JLabel etiquetaCantidad=new JLabel("Cantidad de producto: ");
		JTextField textoCantidad =new JTextField(10);
		
		JLabel etiquetaProv=new JLabel("Proveedor");
		JTextField textoProv =new JTextField(10);
		
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
		
		getContentPane().add(etiquetaPrecio);
		getContentPane().add(textoPrecio);
		
		getContentPane().add(etiquetaGanancia);
		getContentPane().add(textoGanancia);
		
		getContentPane().add(etiquetaFecha);
		getContentPane().add(textoFecha);
		
		getContentPane().add(etiquetaCantidad);
		getContentPane().add(textoCantidad);
		
		getContentPane().add(etiquetaProv);
		getContentPane().add(textoProv);
		
		getContentPane().add(boton1);
	}
}
