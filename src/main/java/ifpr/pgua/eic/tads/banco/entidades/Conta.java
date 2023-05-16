package ifpr.pgua.eic.tads.banco.entidades;

public class Conta {

    private String agencia; 
    private String numero;
    private Pessoa cliente; 
    private double saldo;
    public Conta(String agencia, String numero, Pessoa cliente, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public Pessoa getCliente() {
        return cliente;
    }
    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    public String gerarExtrato(){
        String texto="";

        texto = "Nome: "+getCliente()+
                " Agencia: "+getAgencia()+
                " Numero: "+getNumero()+
                " Saldo: "+getSaldo();

        return texto;
    }


}
