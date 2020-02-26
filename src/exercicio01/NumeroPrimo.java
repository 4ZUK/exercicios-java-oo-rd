package exercicio01;

import java.util.Set;
import java.util.TreeSet;

public class NumeroPrimo {

    /**
     * Retorna um conjunto contendo os números primos contidos num conjunto de inteiros passado no parâmetro,
     * <p>
     * OBSERVAÇÃO: Um número primo é aquele número inteiro ímpar que somente é divisível por 1 e por ele mesmo.
     * <p>
     * OBSERVAÇÃO 2: O número 2 é o único número inteiro par que é primo.
     * <p>
     * Ex.: O número 5 é primo porque não é divisível por 3 (o resultado da divisao de 5 por 3 dá um numero decimal),
     * somente por 1 e o próprio 5.
     *
     * @param numeros Conjunto de inteiros
     * @return Set<Integer>
     */
    public Set<Integer> getNumerosPrimosDe(Set<Integer> numeros) {
        int cont = 0;
        for (int i = 2; i < cont; i++) {
            if (cont % i != 0) {
                cont++;
            }else{
                System.out.println("numero nao é primo");
                }
            }
        return null;
        }
    }