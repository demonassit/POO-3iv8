/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomouse;

/**
 *
 * @author demon
 */

import javax.swing.*;

public class EjemploMouse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //contenedor
        JFrame ventana = new JFrame("MI ventanita kawaii");
        
        JPanel panel = new JPanel();
        
        //componente
        JButton boton = new JButton("Aceptar");
        JLabel lbl = new JLabel("Holi");
        
        lbl.setBounds(10, 10, 100, 20);
        
        //agrego el evento del mouse
        lbl.addMouseMotionListener(new Mouse(lbl));
        
        panel.add(lbl);
        panel.add(boton);
        
        
        //dimensiones
        ventana.setBounds(100, 100, 350, 350);
        ventana.add(panel);
        ventana.setLayout(null);
        ventana.add(lbl);
        
        ventana.setVisible(true);
    }
    
}
