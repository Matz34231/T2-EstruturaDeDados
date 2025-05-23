public class No {
    private PilhaDocumento info;
    private No proximo;

    public No(PilhaDocumento info) {
        this.info = info;
    }
    public PilhaDocumento getInfo() {
        return info;
    }
    public No getProximo() {
        return proximo;
    }
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString(){
        return info.toString();
    }
}
