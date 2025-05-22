public class FilaDocumento {
    private Documento[] dados;
    private int primeiro, ultimo, ocupacao;

    public FilaDocumento(int capacidade) {
        dados = new Documento[capacidade];
        primeiro = 0;
        ultimo = 0;
        ocupacao = 0;
    }

    public boolean filaVazia() {
        return ocupacao == 0;
    }

    public boolean filaCheia() {
        return ocupacao == dados.length;
    }

    private int proximaPosicao(int posicao) {
        return (posicao + 1) % dados.length;
    }

    public void enfileira(Documento doc) {
        if (filaCheia()) throw new RuntimeException("Fila cheia.");
        dados[ultimo] = doc;
        ultimo = proximaPosicao(ultimo);
        ocupacao++;
    }

    public Documento desenfileira() {
        if (filaVazia()) throw new RuntimeException("Fila vazia.");
        Documento temp = dados[primeiro];
        primeiro = proximaPosicao(primeiro);
        ocupacao--;
        return temp;
    }

    public int buscarDocumento(String nomeArquivo) {
        for (int i = primeiro, cont = 0; cont < ocupacao; cont++, i = proximaPosicao(i)) {
            if (dados[i].getNomeArquivo().equalsIgnoreCase(nomeArquivo)) {
                return cont;    
            }
        }
        return -1;
    }

    public void mostrarFila() {
        System.out.println("=== Fila de Impressão ===");
        for (int i = primeiro, cont = 0; cont < ocupacao; cont++, i = proximaPosicao(i)) {
            System.out.println((cont + 1) + " - " + dados[i]);
        }
    }

    public int getOcupacao() {
        return ocupacao;
    }
}
