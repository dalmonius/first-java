public class contaMetodo {
    String cliente;
    double saldo;

    void exibesaldo(){
        System.out.println(cliente + ", seu saldo é de " + saldo);
    }

    void saque(double valor){
        saldo -= valor; // saldo = saldo - valor (?)
        System.out.println("Você realizou um saque de: " + valor);
    }

    void deposito(double valor){
        saldo += valor;
        System.out.println("Você realizou um depósito de: " + valor);
    }

    void transferenciaValor(contaMetodo destino, double valor){
        this.saque(valor);
        destino.deposito(valor);
        System.out.println("Você recebeu uma trasferência de: " + valor); // wtf
    }
}
