
package com.mycompany.proyecto_ventas;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Clientes_vista {
    JPanel pClientes =new JPanel();
    JTable tabla = new JTable();
    JScrollPane sp = new JScrollPane();
    
    private void botones(){

        pClientes.setLayout(null);
        pClientes.setBackground(Color.CYAN);    
        
        JButton btnCrear = new JButton("Crear");
        btnCrear.setBounds(500,75,130,50);
        pClientes.add(btnCrear);
        
        JButton btnCargaM = new JButton("Carga Masiva");
        btnCargaM.setBounds(670,75,130,50);
        pClientes.add(btnCargaM);
        
        JButton btnActualizar = new JButton("Actualizar");
        btnActualizar.setBounds(500,150,130,50);
        pClientes.add(btnActualizar);
        
        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(670,150,130,50);
        pClientes.add(btnEliminar);
        
        JButton btnExportar = new JButton("Exportar PDF");
        btnExportar.setBounds(500,225,300,50);
        pClientes.add(btnExportar);
        
    }
    
    private void tabla(){
        String [] columnas ={"Código","Nombre","NIT","Correo","Genero"};
        Object[][] datos={{"","","","",""}};
        
        tabla = new JTable(datos,columnas);
        
        sp = new JScrollPane(tabla);
        sp.setSize(450, 400);
        sp.setLocation(10,10);
        sp.setVisible(true);
        pClientes.add(sp);
        
    }
    
    public void ejecutar(){
        botones();
        tabla();
    }
    
}
