public class qc_2183327 {
    public static void main (String [] args) {
        int x = 5;
        x<<=2;
        System.out.println(x);
    }
}

/* Questão FGV, 2023: https://www.qconcursos.com/questoes-de-concursos/questoes/44b4a5a0-04
 * Trata-se de um operador bit a bit

int x = 5

em binário escrevemos 0101

quando colocamos x <<= 2

estamos inserindo dois zeros a esquerda (em binário) da variável X. Então ficamos assim:

0001 0100 = 20 (em decimal)

Obs: como os números binários funcionam com blocos de 4, completamos com zeros a direita para ter um número completo.
 * 
 * 
 * 
 * 
  */