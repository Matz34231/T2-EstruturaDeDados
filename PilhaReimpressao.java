public class PilhaReimpressao {
    private No topo;
    private int tamanho;
    private final int capacidadeMaxima;

    public PilhaReimpressao(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public boolean estaVazia() {
        return topo == null;
    }

    public boolean estaCheia() {
        return tamanho >= capacidadeMaxima;
    }

    public void push(PilhaDocumento doc) {
        if (estaCheia()) {
            System.out.println("Capacidade máxima atingida. Não é possível adicionar: " + doc.getNomeArquivo());
            return;
        }

        No novo = new No(doc);  
        novo.setProximo(topo);
        topo = novo;
        tamanho++;
    }

    public PilhaDocumento pop() {
        if (estaVazia()) throw new RuntimeException("Pilha vazia");

        PilhaDocumento doc = topo.getInfo();

        // Registra o horário da reimpressão corretamente
        doc.impressaoImpressao();

        topo = topo.getProximo();
        tamanho--;
        return doc;
    }

    public PilhaDocumento peek() {
        if (estaVazia()) throw new RuntimeException("Pilha vazia");
        return topo.getInfo();
    }

    public boolean contains(String nomeArquivo) {
        No atual = topo;
        while (atual != null) {
            if (atual.getInfo().getNomeArquivo().equals(nomeArquivo)) return true;
            atual = atual.getProximo();
        }
        return false;
    }

    public int posicaoNaPilha(String nomeArquivo) {
        No atual = topo;
        int posicao = 0;
        while (atual != null) {
            if (atual.getInfo().getNomeArquivo().equals(nomeArquivo)) return posicao;
            atual = atual.getProximo();
            posicao++;
        }
        return -1;
    }

    @Override
    public String toString() {
        if (estaVazia()) return "Pilha vazia\n";
        String resultado = "Pilha de Reimpressão:\n";
        No atual = topo;
        while (atual != null) {
            resultado += atual + "\n";
            atual = atual.getProximo();
        }
        return resultado;
    }
}
