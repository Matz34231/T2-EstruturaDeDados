public class No {
    private Documento info;
    private No proximo;

    public No(Documento info) {
        this.info = info;
    }
    public Documento getInfo() {
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
