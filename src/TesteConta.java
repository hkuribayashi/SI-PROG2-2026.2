import banco.Conta;
import banco.SaldoInsuficienteException;
import banco.ValorInvalidoException;

import javax.swing.*;

void main(){
    Conta c1 = new Conta("Hugo", "1111");
    c1.depositar(100.0);
    c1.depositar(50.0);
    //Tentar fazer um saque inválido
    try {
        c1.sacar(50000.0);
    } catch (ValorInvalidoException e) {
        JOptionPane.showMessageDialog(null, "Erro: Tentamos sacar um valor inválido");
    }catch (SaldoInsuficienteException se){
        JOptionPane.showMessageDialog(null, "Erro: Tentamos sacar mais do que temos em conta");
    }
    IO.println("Saldo: "+c1.getSaldo());
}