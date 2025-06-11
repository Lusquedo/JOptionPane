import javax.swing.JOptionPane;

public class Exercicio8 {
    public static void main(String[] args) {
        double celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius:"));

        double fahrenheit = celsius * 1.8 + 32;

        JOptionPane.showMessageDialog(null, String.format("Temperatura em Fahrenheit: %.2f", fahrenheit));
    }
}
