

package ws.unisul13;
import javax.swing.JOptionPane;
public class Unisul13 {

    public static void main(String[] args) {
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salário?"));
        double prestacao = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da sua prestação?"));
        double credito = (salario * 0.3);
        
        if (prestacao >= credito) {
            JOptionPane.showMessageDialog(null, "NEGADO");
        }
        
        else {
            JOptionPane.showMessageDialog(null, "APROVADO");
        }
    }
}
