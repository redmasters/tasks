package lgshogun.tasks.banco.v2;

public class DadosConta {
    public String nomeTitular;
    public String agencia;
    public int numeroConta;
    public String nomeBanco;
    private double saldoAtual;
    public String chavePix;

    public void imprimirDados(){
        System.out.println("----------------");
        System.out.println("Nome do Banco: "+this.nomeBanco);
        System.out.println("Nome do Titular: "+this.nomeTitular);
        System.out.println("Agência: "+this.agencia);
        System.out.println("Número da Conta: "+this.numeroConta);
        System.out.println("Chave Pix: "+this.chavePix);
        System.out.println("Saldo Atual: R$ "+this.saldoAtual);
    }

    public void setSaldoAtual(double saldoAtual){
        if (saldoAtual < 0) {
            System.out.println("Saldo Inválido: Menor que 0");
            return;
        }
        this.saldoAtual = saldoAtual;
    }

}
