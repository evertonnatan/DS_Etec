package percentualcoronavirus;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * @author everton-natan
 */
public class PercentualCoronavirus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variáveis        
        String nomeDaRegiao;
        double CasosRegiao = 0;
        double CasosBrasil = 34456145; // informação retirada da página https://infoms.saude.gov.br/extensions/covid-19_html/covid-19_html.html - acesso em 04/09/2022
        double percentual = 0;
        // habilitando o leitor
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Programa Casos Coronavirus - este programa calculara a porcentagem de pessoas contaminadas com o coronavirus, por regiao do pais");
        System.out.println("Digite o NOME da regiao - utilize as opcoes centro_oeste, norte, nordeste, sudeste e sul");
        nomeDaRegiao = leitor.next();
        
        System.out.println("Digite o NUMERO DE CASOS dessa regiao - nao utilize virgulas ou pontos, apenas numeros");
        CasosRegiao = leitor.nextInt();
        percentual = CasosRegiao / CasosBrasil * 100;        
              
        System.out.println("Total de casos da regiao " + nomeDaRegiao);
        System.out.println("=> " + CasosRegiao);
        System.out.println("Total de caos no BRASIL: " + CasosBrasil);
        System.out.println("O percentual de casos da regiao (em relacao ao total de casos do Brasil) e: ");
        System.out.println( new DecimalFormat("#,##0.00").format(percentual) + "%" );
    }
    
}

/*
Segundo a página oficial do Ministério da Saúde (link acima), dados atualizados até 02/09/2022, 
o total de casos por região é: 
centro oeste = 3.921.251
nordeste = 6.852.302
norte = 2.747.519
sudeste = 13.619.088
sul = 7.315.985
*/
