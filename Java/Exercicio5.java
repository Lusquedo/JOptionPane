import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));

        double media = (n1 + n2 + n3) / 3;

        JOptionPane.showMessageDialog(null, "A média é: " + String.format("%.2f", media));
    }
}
