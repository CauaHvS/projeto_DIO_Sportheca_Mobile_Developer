package one.digitalinnovation;

public class No {

    private int dado;
    private No refNo = null;

    public No() {
    }

    public No(int dados) {
        this.dado = dados;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dados) {
        this.dado = dados;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dados=" + dado +
                '}';
    }
}
