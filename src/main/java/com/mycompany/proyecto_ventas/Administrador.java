
package com.mycompany.proyecto_ventas;

import java.awt.Font;
import javax.swing.*;


public class Administrador extends JFrame {
    JTabbedPane pestañas =new JTabbedPane();

    
    private void inicio(){
        setTitle ("Administrador");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBounds(50,20,850,500);
        setVisible(true);
        
        pestañas.setFont(new Font("arial",Font.BOLD,14));
        
        
        
        Sucursales_vistas sv=new Sucursales_vistas();
        sv.ejecutar();
        Productos_vista pv = new Productos_vista();
        pv.ejecutar();
        Vendedores_vista vv = new Vendedores_vista();
        vv.ejecutar();
        Clientes_vista cv = new Clientes_vista();
        cv.ejecutar();
        
        
        pestañas.addTab("Sucursaless ", sv.pSucursales);
        pestañas.addTab("Productos ", pv.pProductos);
        pestañas.addTab("Vendedores ", vv.pVendedores);
        pestañas.addTab("Clientes ", cv.pClientes);
        
        add(pestañas);
                
    }
    
    public void ejecutar(){
        inicio();
    }
   public static void main(String[] args) {
        Administrador lg =new Administrador();
        lg.ejecutar();
    }
    
}
