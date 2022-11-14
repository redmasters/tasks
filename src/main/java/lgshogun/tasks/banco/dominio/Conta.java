package lgshogun.tasks.banco.dominio;

public class Conta {

    // Modelo da Conta de Banco
    public String nomeTitular;
    public String agencia;
    public int numDaConta;
    public String nomeBanco;
    public double saldoAtual;

    // Impressão das Informações da Conta
    public void imprime(){
        System.out.println("----");
        System.out.println("Nome do Titular: "+this.nomeTitular);
        System.out.println("Agência: "+this.agencia);
        System.out.println("Número da Conta: "+this.numDaConta);
        System.out.println("Nome do Banco: "+this.nomeBanco);
        System.out.println("Saldo Atual: "+this.saldoAtual);
    }

    public void sacar(double valorSacar){
        if (saldoAtual > 0) {
            double resultadoSaque = saldoAtual - valorSacar;
            if (resultadoSaque <= 0) {
                System.out.println("Saque Indisponível");
            }
            System.out.println(nomeTitular+" Sacou: " + valorSacar);
            saldoAtual = resultadoSaque;
            System.out.println("Saldo Atual: "+this.saldoAtual);

        } else{
            System.out.println("Saque Indisponível");
        }

    }

    public void deposita(double valorDepositado){
        if (valorDepositado > 0) {
            double resultadoDeposito = saldoAtual + valorDepositado;
            System.out.println(nomeTitular + " Depositou: " + valorDepositado);
            saldoAtual = resultadoDeposito;
            System.out.println("Saldo Atual: " + this.saldoAtual);
        } else {
            System.out.println("Deposito Indisponível");
        }
    }
}