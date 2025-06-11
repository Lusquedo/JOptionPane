import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main(String[] args) {
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));

        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "O número é positivo.");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "O número é negativo.");
        } else {
            JOptionPane.showMessageDialog(null, "O número é zero.");
        }
    }
}
