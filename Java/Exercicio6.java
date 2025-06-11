import javax.swing.JOptionPane;

public class Exercicio6 {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        String operacao = JOptionPane.showInputDialog("Digite a operação (+, -, *, /):");

        double resultado = 0;
        boolean valida = true;

        if (operacao.equals("+")) {
            resultado = num1 + num2;
        } else if (operacao.equals("-")) {
            resultado = num1 - num2;
        } else if (operacao.equals("*")) {
            resultado = num1 * num2;
        } else if (operacao.equals("/")) {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                JOptionPane.showMessageDialog(null, "Erro: divisão por zero!");
                valida = false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operação inválida.");
            valida = false;
        }

        if (valida) {
            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
        }
    }
}
