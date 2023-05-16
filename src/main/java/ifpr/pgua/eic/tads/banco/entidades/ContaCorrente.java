package ifpr.pgua.eic.tads.banco.entidades;

public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(String agencia, String numero, Pessoa cliente, double saldo){
        super(agencia, numero, cliente, saldo);
        this.limite = limite;
    }

    public double getLimite(){
        return limite;
    }

    public void setLimite(double limite){
        this.limite = limite;
    }
    
}
