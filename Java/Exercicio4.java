import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número é par.");
        } else {
            JOptionPane.showMessageDialog(null, "O número é ímpar.");
        }
    }
}
