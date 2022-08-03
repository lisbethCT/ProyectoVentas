
package com.mycompany.proyecto_ventas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class login extends JFrame{
    JPanel p1=new JPanel();
    JTextField t1 =new JTextField();
    JTextField t2 =new JTextField();
    JPasswordField pf = new JPasswordField();
    
    public void inicio(){
        setTitle ("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBounds(50,175,400,400);
        setVisible(true);
        p1.setLayout(null);
        add(p1);
        
        JLabel l1 = new JLabel("Nombre: ");
        l1.setBounds(50, 75, 80, 40);
        p1.add(l1);
        
        t1.setBounds(150, 79, 100, 40);
        p1.add(t1);
        
        JLabel l2 = new JLabel("Contraseña: ");
        l2.setBounds(50, 175, 80, 40);
        p1.add(l2);
        
        pf.setBounds(150, 179, 100, 40);
        p1.add(pf);
        //t2.setBounds(x, y, WIDTH, HEIGHT);
        
        JButton bIngresar = new JButton("Ingresar");
        bIngresar.setBounds(150, 250, 100, 50);
        p1.add(bIngresar);
        
        ActionListener verificar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    VendedoresDAO vd = new VendedoresDAO();
                int respuesta = vd.filtro(t1.getText(), t2.getText());

                switch (respuesta) {
                    case 1:
                        Administrador admin = new Administrador();
                        admin.ejecutar();
                        JOptionPane.showMessageDialog(null, "Es admin");
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null, "Es vendedor");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Datos incorrectos");
                        break;
                }

            }
        };

        bIngresar.addActionListener(verificar);
        
        
        
    }
    
    public void ejecutar(){
        inicio();
    }
    
}
