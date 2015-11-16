/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin93;

import javax.swing.JOptionPane;

/**
 *
 * @author agomezcastro
 */
public class Rectangulo {
    public float pedirDatoValido(){ 
        float dato;
      do{
        
        dato= Integer.parseInt(JOptionPane.showInputDialog("Introduzca dato:"));
    }while (dato<=0);
      return dato;
    }
}
