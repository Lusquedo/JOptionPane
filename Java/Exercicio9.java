import javax.swing.JOptionPane;

public class Exercicio9 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));

        if (numero >= 10 && numero <= 20) {
            JOptionPane.showMessageDialog(null, "O número está dentro do intervalo [10, 20].");
        } else {
            JOptionPane.showMessageDialog(null, "O número está fora do intervalo [10, 20].");
        }
    }
}
