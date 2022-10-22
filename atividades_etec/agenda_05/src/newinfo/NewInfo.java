
package newinfo;
import javax.swing.JOptionPane;
/**
 *
 * @author everton-natan
 */
public class NewInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int idade;
         
         idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
         if (idade > 80) {
             JOptionPane.showMessageDialog(null, "Sua idade é: " + idade + "  - siga para a fila ultraprioritária 80+");
         } else {
             if (idade >= 60) {
                 JOptionPane.showMessageDialog(null, "Sua idade é: " + idade + " - siga para a fila prioritária");
             } else {
                 if (idade < 60) {
                     JOptionPane.showMessageDialog(null, "Você tem menos de 60 anos - siga para a fila comum");
                 }
             }
         }
    }
}
