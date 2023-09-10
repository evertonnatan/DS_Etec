import javax.swing.JOptionPane;

public class Criptografia {

    public static void main(String[] args) {
        String mensagemOriginal = JOptionPane.showInputDialog("Digite a mensagem a ser criptografada:");
        
        // Obtém o tamanho da mensagem original
        int tamanhoMensagem = mensagemOriginal.length();
        
        // Cria uma String para armazenar a mensagem criptografada
        StringBuilder mensagemCriptografada = new StringBuilder();
        
        // Cria uma String para armazenar a tabela de conversão
        StringBuilder tabelaConversao = new StringBuilder();
        
        // Itera sobre cada caractere da mensagem original
        for (int i = 0; i < tamanhoMensagem; i++) {
            // Obtém o caractere na posição i
            char c = mensagemOriginal.charAt(i);
            
            // Converte o caractere para um número inteiro de acordo com a tabela ASCII
            int asciiValue = (int) c;
            
            // Soma 10 unidades ao número inteiro
            int asciiValueCriptografado = asciiValue + 10;
            
            // Adiciona a conversão à tabela de conversão
            tabelaConversao.append(c).append(" => ASCII: ").append(asciiValue).append(" + 10 = ").append(asciiValueCriptografado).append("\n");
            
            // Converte o número inteiro criptografado de volta para caractere
            char caractereCriptografado = (char) asciiValueCriptografado;
            
            // Adiciona o caractere criptografado à mensagem criptografada
            mensagemCriptografada.append(caractereCriptografado);
        }
        
        // Exibe a tabela de conversão
        JOptionPane.showMessageDialog(null, "Tabela de Conversão:\n" + tabelaConversao.toString());
        
        // Exibe a mensagem criptografada
        JOptionPane.showMessageDialog(null, "Mensagem Criptografada: " + mensagemCriptografada.toString());
    }
}


