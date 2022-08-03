
package com.mycompany.proyecto_ventas;

import java.awt.Color;
import javax.swing.*;

public class Sucursales_vistas {
    JPanel pSucursales =new JPanel();
    
    
   
    
    JTable tabla = new JTable();
    JScrollPane sp = new JScrollPane();
    
    private void botones(){
        pSucursales.setLayout(null);
        pSucursales.setBackground(Color.blue);
        
        JButton btnCrear = new JButton("Crear");
        btnCrear.setBounds(500,75,130,50);
        pSucursales.add(btnCrear);
        
        JButton btnCargaM = new JButton("Carga Masiva");
        btnCargaM.setBounds(670,75,130,50);
        pSucursales.add(btnCargaM);
        
        JButton btnActualizar = new JButton("Actualizar");
        btnActualizar.setBounds(500,150,130,50);
        pSucursales.add(btnActualizar);
        
        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(670,150,130,50);
        pSucursales.add(btnEliminar);
        
        JButton btnExportar = new JButton("Exportar PDF");
        btnExportar.setBounds(500,225,300,50);
        pSucursales.add(btnExportar);
        
    }
    
    private void tabla(){
        String [] columnas ={"Código","Nombre","Dirección","Correo","Telefono"};
        Object[][] datos={{"","","","",""}};
        
        tabla = new JTable(datos,columnas);
        
        sp = new JScrollPane(tabla);
        sp.setSize(450, 400);
        sp.setLocation(10,10);
        sp.setVisible(true);
        pSucursales.add(sp);
        
    }
    
    public void ejecutar(){
        botones();
        tabla();
    }
}
