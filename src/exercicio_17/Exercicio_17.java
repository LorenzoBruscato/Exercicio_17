package exercicio_17;

import javax.swing.JOptionPane;

/**
 *
 * @author Lorenzo
 */
public class Exercicio_17 {

    public static void main(String[] args) {
        String controle;
        controle = JOptionPane.showInputDialog("Tibúrcio é (porfissão): \n e - engenheiro \n p - proramador \n m - médico \n a - advogado \n d - designer");
        char controleCHAR = controle.charAt(0);
        switch (controleCHAR) {
            case 'e' ->
                JOptionPane.showMessageDialog(null, "Engenheiro");
            case 'p' ->
                JOptionPane.showMessageDialog(null, "Programador");
            case 'm' ->
                JOptionPane.showMessageDialog(null, "Médico");
            case 'a' ->
                JOptionPane.showMessageDialog(null, "Advogado");
            case 'd' ->
                JOptionPane.showMessageDialog(null, "Designer");
            default ->
                JOptionPane.showMessageDialog(null, "Desempregado");
        }
    }
}
