package banco;

public class Conta {

    private String titular;
    private String numero;
    private Double saldo;

    public Conta(String t, String n){
        this.titular = t;
        this.numero = n;
        this.saldo = 0.0;
    }

    public void sacar(Double valor) throws SaldoInsuficienteException,
            ValorInvalidoException{
        if (valor <= this.saldo && valor > 0) {
            this.saldo = this.saldo - valor;
        } else if (valor > this.saldo){
            // Erro de tentar sacar mais do que temos na conta
            throw new SaldoInsuficienteException();
        }else{
            //Erro de tentar sacar um valor menor que zero
            throw new ValorInvalidoException();
        }
    }

    public void depositar(Double valor){
        if (valor > 0)
            this.saldo = this.saldo + valor;
    }

    public Double getSaldo() {
        return saldo;
    }
}
