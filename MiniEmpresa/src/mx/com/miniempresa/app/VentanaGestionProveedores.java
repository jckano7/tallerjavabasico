package mx.com.miniempresa.app;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import mx.com.miniempresa.model.Proveedores;
import mx.com.miniempresa.service.GestionProveedoresBO;

public class VentanaGestionProveedores extends JFrame{
	private GestionProveedoresBO gestionProveedoresBO= GestionProveedoresBO.generarInstancia();

	public VentanaGestionProveedores() {
		super("Ventana Gestion de Proveedores");
		getContentPane().setLayout(new FlowLayout());
		inicializarComponentes();
		setSize(800,300);
	}
	
	private void inicializarComponentes() {
		JLabel etiqueta= new JLabel("Proveedor");
		JTextField texto= new JTextField("Ingresa el nombre del proveedor: ");
		JButton boton1= new JButton("Guardar");
		
		boton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Proveedores nuevoProveedor= new Proveedores();
				nuevoProveedor.setNombreDelProducto(texto.getText());
				int resultado = gestionProveedoresBO.agregarProveedoresBO(nuevoProveedor);
				if (resultado == 0) {
					JOptionPane.showMessageDialog(null, "El proveedor se guardo con exito");
					texto.setText("");
				}else {
					JOptionPane.showMessageDialog(null, "El proveedor no se puede guardar");
				}
			}
		});
		
		getContentPane().add(etiqueta);
		getContentPane().add(texto);
		getContentPane().add(boton1);
	}
		}



