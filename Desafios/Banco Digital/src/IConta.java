public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void extrato();

    void transferir(IConta contaDestino, double valor);
}
