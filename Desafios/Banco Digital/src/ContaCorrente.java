public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extrato() {
        System.out.println("==========EXTRATO BANCARIO==========");
        System.out.println("===========CONTA CORRENTE===========");
        super.extratoComum();
    }


}
