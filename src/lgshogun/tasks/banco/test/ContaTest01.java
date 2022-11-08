package lgshogun.tasks.banco.test;

import lgshogun.tasks.banco.dominio.Conta;

public class ContaTest01 {
    public static void main(String[] args) {
        Conta conta1 = new Conta();

        conta1.nomeTitular = "Casaubé Silva";
        conta1.numDaConta = 1272812;
        conta1.agencia = "0001";
        conta1.nomeBanco = "Banco FWV";
        conta1.saldoAtual = 0.0;

        conta1.imprime();
    }
}
