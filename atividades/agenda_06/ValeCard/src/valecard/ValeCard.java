
package valecard;

import javax.swing.JOptionPane;
/**
 * @author everton-natan
 */
public class ValeCard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int placa; // Variável para armazenar o final da placa do veículo
        
        placa = Integer.parseInt(JOptionPane.showInputDialog("Digite o algarismo final da placa a ser consultada: "));
        
        switch (placa) {
            case 0:
                placa = 0;
                JOptionPane.showInputDialog(null, "O pagamento deverá ser realizado até o dia 31/12");
                break;
            case 1:
                placa = 1;
                JOptionPane.showInputDialog(null, "O pagamento deverá ser realizado até o dia 30/04");
                break;
            case 2:
                placa = 2;
                JOptionPane.showInputDialog(null, "O pagamento deverá ser realizado até o dia 31/05");
                break;
            case 3:
                placa = 3;
                JOptionPane.showInputDialog(null, "O pagamento deverá ser realizado até o dia 30/06");
                break;
            case 4:
                placa = 4;
                JOptionPane.showInputDialog(null, "O pagamento deverá ser realizado até o dia 31/07");
                break;
            case 5:
                placa = 5; 
                JOptionPane.showInputDialog(null, "O pagamento deverá ser realizado até o dia 31/08");
                break;
            case 6: 
                placa = 6;
                JOptionPane.showInputDialog(null, "O pagamento deverá ser realizado até o dia 30/09");
                break;
            case 7:
                placa = 7;
                JOptionPane.showInputDialog(null, "O pagamento deverá ser realizado até o dia 31/10");
                break;
            case 8:
                placa = 8;
                JOptionPane.showInputDialog(null, "O pagamento deverá ser realizado até o dia 30/11");
                break;
            case 9:
                placa = 9;
                JOptionPane.showInputDialog(null, "O pagamento deverá ser realizado até o dia 31/12");
                break;         
            default:
                JOptionPane.showInputDialog(null, "O algorismo digitado está incorreto ou é inválido");
                
        }
    }
    
}
