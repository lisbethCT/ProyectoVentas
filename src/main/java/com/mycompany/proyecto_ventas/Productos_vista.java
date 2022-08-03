
package com.mycompany.proyecto_ventas;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class Productos_vista {
    JPanel pProductos =new JPanel();
    JTable tabla = new JTable();
    JScrollPane sp = new JScrollPane();
    
     private void botones(){
       
        pProductos.setLayout(null);

        pProductos.setBackground(Color.yellow);

        
        JButton btnCrear = new JButton("Crear");
        btnCrear.setBounds(500,75,130,50);
        pProductos.add(btnCrear);
        
        JButton btnCargaM = new JButton("Carga Masiva");
        btnCargaM.setBounds(670,75,130,50);
        pProductos.add(btnCargaM);
        
        JButton btnActualizar = new JButton("Actualizar");
        btnActualizar.setBounds(500,150,130,50);
        pProductos.add(btnActualizar);
        
        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(670,150,130,50);
        pProductos.add(btnEliminar);
        
        JButton btnExportar = new JButton("Exportar PDF");
        btnExportar.setBounds(500,225,300,50);
        pProductos.add(btnExportar);
        
    }
    
    private void tabla(){
        String [] columnas ={"Código","Nombre","Descripcion","Cantidad","Precio"};
        Object[][] datos={{"","","","",""}};
        
        tabla = new JTable(datos,columnas);
        
        sp = new JScrollPane(tabla);
        sp.setSize(450, 400);
        sp.setLocation(10,10);
        sp.setVisible(true);
        pProductos.add(sp);
        
    }
    
    public void ejecutar(){
        botones();
        tabla();
    }
}
