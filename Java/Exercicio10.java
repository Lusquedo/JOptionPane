import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
        String nacionalidade = JOptionPane.showInputDialog("Digite a nacionalidade:");

        if (idade >= 16 && nacionalidade.equalsIgnoreCase("brasileira")) {
            JOptionPane.showMessageDialog(null, "A pessoa pode votar.");
        } else {
            JOptionPane.showMessageDialog(null, "A pessoa não pode votar.");
        }
    }
}
