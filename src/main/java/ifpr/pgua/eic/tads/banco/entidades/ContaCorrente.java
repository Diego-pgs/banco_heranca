package ifpr.pgua.eic.tads.banco.entidades;

public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(String agencia, String numero, Pessoa cliente, double saldo, double limite){
        super(agencia, numero, cliente, saldo);
        this.limite = limite;
    }

    public double getLimite(){
        return limite;
    }

    public void setLimite(double limite){
        this.limite = limite;
    }

    @Override
    public String gerarExtrato(){
        String texto;

        texto = super.gerarExtrato();

        texto += " Limite:"+limite;

        return texto;
    }
    
    @Override
    public String sacar(double valor){
        if(valor < 0){
            return "Valor invalido";
        }
        if(valor > saldo + limite){
            return "Saldo Insuficiente";
        }
        saldo = saldo - valor;
        return "Saque realizado com sucesso!";

    }

    @Override
    public String tipo(){
        return "Conta Corrente";
    }

}
