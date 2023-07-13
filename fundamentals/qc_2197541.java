public class qc_2197541 {
    public static void main (String[] args) {
        int x = 3;
        int y = 5;
        int z = 10;

        System.out.println(++z + y - y + z + x++);
    }
}

//https://www.qconcursos.com/questoes-de-concursos/questoes/8cdb9e5b-11

/*
Vamos analisar a expressão passo a passo:

Primeiro, temos o operador de pré-incremento ++z. Isso significa que o valor de z será incrementado em 1 antes de qualquer outra operação. Portanto, z passará a ser 11.

Em seguida, temos o operando y, que tem o valor 5.

Em seguida, temos o operando -y. O operador de subtração (-) é aplicado a y, que é 5, resultando em -5.

Depois, temos o operando z, que agora é 11.

Em seguida, temos o operando x++, que primeiro usa o valor atual de x, que é 3, e depois incrementa o valor de x em 1. Portanto, o valor retornado é 3, mas o valor de x passa a ser 4.

Agora, podemos calcular a expressão:

++z + y - y + z + x++
11 + 5 - 5 + 11 + 3

Primeiro, somamos 11 e 5:
16 - 5 + 11 + 3

Em seguida, subtraímos 5 de 16:
11 + 11 + 3

Finalmente, somamos 11 e 11:
22 + 3

O resultado final é 25.

Portanto, o resultado da expressão ++z + y - y + z + x++ com x = 3, y = 5 e z = 10 é igual a 25.
 */