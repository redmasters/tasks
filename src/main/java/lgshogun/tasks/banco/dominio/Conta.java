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
}