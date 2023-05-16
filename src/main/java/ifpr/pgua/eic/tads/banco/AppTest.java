package ifpr.pgua.eic.tads.banco;

import ifpr.pgua.eic.tads.banco.entidades.ContaCorrente;
import ifpr.pgua.eic.tads.banco.entidades.ContaPoupanca;
import ifpr.pgua.eic.tads.banco.entidades.Pessoa;

public class AppTest {

    public static void main(String [] args){
        Pessoa ze = new Pessoa("zé", "0123", 25, 500);
        Pessoa chico = new Pessoa("chico", "4567", 46, 1000);
        
        ContaPoupanca poupanca1 = new ContaPoupanca("123","009988", chico, 100, 0.05);
        ContaPoupanca poupanca2 = new ContaPoupanca("456","000091", ze, 100, 0.10);

        ContaCorrente corrente1 = new ContaCorrente("123","009988", chico, 0);
        ContaCorrente corrente2 = new ContaCorrente("456","000091", ze, 0);
     
        System.out.println(poupanca1.gerarExtrato());
        System.out.println(corrente1.gerarExtrato());

        poupanca1.setTaxaRendimento(0.0001);
        corrente1.setLimite(1000);
    }
    
}
