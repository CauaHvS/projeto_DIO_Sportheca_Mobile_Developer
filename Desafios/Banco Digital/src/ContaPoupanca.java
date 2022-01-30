public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extrato() {
        System.out.println("==========EXTRATO BANCARIO==========");
        System.out.println("===========CONTA POUPANÇA===========");
        super.extratoComum();
    }

}
