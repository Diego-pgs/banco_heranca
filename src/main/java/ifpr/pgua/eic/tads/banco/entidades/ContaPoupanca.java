package ifpr.pgua.eic.tads.banco.entidades;

public class ContaPoupanca extends Conta{

    private double rendimento;
    private double taxaRendimento;
    
    public ContaPoupanca(String agencia, String numero, Pessoa cliente, double saldo, double taxaRendimento) {
        super(agencia, numero, cliente, saldo);
        //TODO Auto-generated constructor stub
        this.taxaRendimento = taxaRendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
    
    @Override
    public String gerarExtrato(){
        String texto = "";

        texto = super.gerarExtrato();
        texto += "TaxaRendimento: "+taxaRendimento+" Rendimentos: "+rendimento;
        
        return texto;
    }

    /*@Override
    public String tipo(){
        return super.tipo()+"Conta Poupança";
    }*/

    @Override
    public String tipo(){
        return "Conta Poupança";
    }

    public void render(){
        rendimento = rendimento + (saldo * taxaRendimento);
    }
}
