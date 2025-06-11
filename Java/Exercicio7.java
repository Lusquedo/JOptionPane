import javax.swing.JOptionPane;

public class Exercicio7 {
    public static void main(String[] args) {
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso (kg):"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura (m):"));

        double imc = peso / (altura * altura);

        JOptionPane.showMessageDialog(null, "Seu IMC é: " + String.format("%.2f", imc));
    }
}
