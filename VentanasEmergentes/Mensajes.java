/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanasEmergentes;

import javax.swing.JOptionPane;

/**
 *
 * @author dani
 */
public class Mensajes{
    public static void ventanaError(String mensaje, String titulo){
        JOptionPane.showMessageDialog(null,mensaje, titulo, 0);
    }
    
    public static void ventanaInfo(String mensaje, String titulo){
        JOptionPane.showMessageDialog(null, mensaje, titulo, 1);
    }
}
