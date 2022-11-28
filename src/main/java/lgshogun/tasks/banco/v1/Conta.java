package lgshogun.tasks.banco.v1;
public class Conta {

    // Modelo da Conta de Banco
    public String nomeTitular;
    public String agencia;
    public int numDaConta;
    public String nomeBanco;
    public double saldoAtual;
    public String chavePix;

    // Método: Impressão das informações da conta
    public void imprimir(){
        System.out.println("----------------");
        System.out.println("Nome do Titular: "+this.nomeTitular);
        System.out.println("Agência: "+this.agencia);
        System.out.println("Número da Conta: "+this.numDaConta);
        System.out.println("Nome do Banco: "+this.nomeBanco);
        System.out.println("Saldo Atual: "+this.saldoAtual);
        System.out.println("Chave Pix: "+this.chavePix);
    }

    // Método: Saque do saldo da conta
    public void sacar(double valorSacar){
        if (saldoAtual > 0) {
            double resultadoSacar = saldoAtual - valorSacar;
            if (resultadoSacar < 0) {
                System.out.println("Saque não realizado: Saque maior que o saldo");
            } else {
                System.out.println(nomeTitular+" Sacou: " + valorSacar);
                saldoAtual = resultadoSacar;
                System.out.println("Saldo Atual: "+this.saldoAtual);
            }
        } else{
            System.out.println("Saque não realizado: Saldo igual a 0");
        }

    }

    // Método: Deposito de valores no saldo da conta
    public void depositar(double valorDepositar){
        if (valorDepositar > 0) {
            double resultadoDepositar = saldoAtual + valorDepositar;
            System.out.println(nomeTitular + " Depositou: " + valorDepositar);
            saldoAtual = resultadoDepositar;
            System.out.println("Saldo Atual: " + this.saldoAtual);
        } else {
            System.out.println("Deposito não realizado: Valor é menor ou igual a 0");
        }
    }

    // Método: Transferência de valores do saldo da conta
    public void transferir(String receptor, double valorTransferir){
        if (valorTransferir > 0) {
            double resultadoTransferir = saldoAtual - valorTransferir;
            if (resultadoTransferir < 0 && receptor == "") {
                System.out.println("Transferência não realizada: Chave não solicitada ou saldo indisponível");
            } else {
                System.out.println(nomeTitular + " Transferiu: " + valorTransferir + "; Para a Chave Pix: " + receptor);
                saldoAtual = resultadoTransferir;
                System.out.println("Saldo Atual: " + this.saldoAtual);
            }
        }
    }
}