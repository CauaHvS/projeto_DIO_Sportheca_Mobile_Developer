public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente c1 = new Cliente();
        c1.setNome("João");
        Cliente c2 = new Cliente();
        c2.setNome("Maria");

        Conta cc = new ContaCorrente(c1);
        cc.depositar(100);
        Conta cp = new ContaPoupanca(c2);
        cc.transferir(cp,50);
        cp.transferir(cc,0.01);

        cc.extrato();
        cp.extrato();
    }
}
