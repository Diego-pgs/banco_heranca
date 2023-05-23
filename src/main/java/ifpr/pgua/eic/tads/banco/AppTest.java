package ifpr.pgua.eic.tads.banco;

import java.util.ArrayList;

import ifpr.pgua.eic.tads.banco.entidades.Conta;
import ifpr.pgua.eic.tads.banco.entidades.ContaCorrente;
import ifpr.pgua.eic.tads.banco.entidades.ContaPoupanca;
import ifpr.pgua.eic.tads.banco.entidades.Pessoa;

public class AppTest {

    public static void main(String[] args) {

        //ArrayList<ContaPoupanca> poupancas = new ArrayList<>();
        //ArrayList<ContaCorrente> correntes = new ArrayList<>();

        ArrayList<Conta> contas = new ArrayList<>();

        Pessoa ze = new Pessoa("Zé", "0123", 25, 500);
        Pessoa chico = new Pessoa("Chico", "4567", 35, 1000);

        ContaPoupanca poupanca = new ContaPoupanca("123", "009988", 
                                                   chico, 100, 0.05);

        ContaCorrente corrente = new ContaCorrente("123", "1000156", ze, 0, 100);
        
        String retPoupanca = poupanca.sacar(200);
        String retContaCorrente = corrente.sacar(99);

        System.out.println(retPoupanca);
        System.out.println(retContaCorrente);

        System.out.println(poupanca.tipoCompleto());
        System.out.println(corrente.tipoCompleto());

        /*
        poupancas.add(poupanca);
        correntes.add(corrente);
        System.out.println(poupancas.size());
        System.out.println(correntes.size());
        */

        contas.add(poupanca);
        contas.add(corrente);

        /*
        System.out.println(contas.size());
        for(Conta aux:contas){
            System.out.println(aux.tipo());
        }*/

        for(Conta aux:contas){
            if(aux instanceof ContaPoupanca){
                ContaPoupanca var = (ContaPoupanca) aux;
                var.render();
                System.out.println("Rendeu...");
            }else{
                System.out.println("Não rendeu...");
            }
        }
    }
}
