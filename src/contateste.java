public class contateste {
    public static void main(String[] args){
        contaMetodo conta = new contaMetodo();
        conta.cliente = "Alabama";
        conta.saldo = 4000.00;
        conta.exibesaldo();
        conta.saque(2000);
        conta.exibesaldo();
        conta.deposito(2000);
        conta.exibesaldo();

        contaMetodo destino = new contaMetodo();
        destino.cliente = "Bahia";
        destino.saldo = 0;
        destino.exibesaldo();

        conta.transferenciaValor(destino, 2000);
        destino.exibesaldo();

        conta.exibesaldo();
        destino.exibesaldo();
    }
}
