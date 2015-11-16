

package boletin93;

import javax.swing.JOptionPane;

/**
 *
 * @author agomezcastro
 */
public class Boletin93 {


    public static void main(String[] args) {
        float base, altura;
        Rectangulo rectangulo1= new Rectangulo();
        base= rectangulo1.pedirDatoValido();
        altura= rectangulo1.pedirDatoValido();
        JOptionPane.showMessageDialog(null, "El area es: "+ base*altura);
    }
    
}
