/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_ventas;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Lisbeth
 */
public class Vendedores_vista {
    JPanel pVendedores =new JPanel();
    JTable tabla = new JTable();
    JScrollPane sp = new JScrollPane();
    
    private void botones(){
        pVendedores.setLayout(null);   
        pVendedores.setBackground(Color.GREEN);
        
        JButton btnCrear = new JButton("Crear");
        btnCrear.setBounds(500,75,130,50);
        pVendedores.add(btnCrear);
        
        JButton btnCargaM = new JButton("Carga Masiva");
        btnCargaM.setBounds(670,75,130,50);
        pVendedores.add(btnCargaM);
        
        JButton btnActualizar = new JButton("Actualizar");
        btnActualizar.setBounds(500,150,130,50);
        pVendedores.add(btnActualizar);
        
        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(670,150,130,50);
        pVendedores.add(btnEliminar);
        
        JButton btnExportar = new JButton("Exportar PDF");
        btnExportar.setBounds(500,225,300,50);
        pVendedores.add(btnExportar);
        
    }
    
    private void tabla(){
        String [] columnas ={"Código","Nombre","Caja","Ventas","Genero"};
        Object[][] datos={{"","","","",""}};
        
        tabla = new JTable(datos,columnas);
        
        sp = new JScrollPane(tabla);
        sp.setSize(450, 400);
        sp.setLocation(10,10);
        sp.setVisible(true);
        pVendedores.add(sp);
        
    }
    
    public void ejecutar(){
        botones();
        tabla();
    }
    
}
