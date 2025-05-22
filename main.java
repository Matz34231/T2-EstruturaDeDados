public class main {
    public static void main(String[] args) throws InterruptedException {
        PilhaReimpressao pilha = new PilhaReimpressao(3);

        Documento d1 = new Documento("Arquivo.pdf", "https://github.com/Matz34231/T2-EstruturaDeDados/blob/main/FilaDocumento.java");
        Documento d2 = new Documento("Arquivo.pdf", "Pedro");
        Documento d3 = new Documento("Arquivo.pdf", "https://github.com/Matz34231/T2-EstruturaDeDados/blob/main/FilaDocumento.java");

        pilha.push(d1);
        
        //espera 1 segundo pra visualizar a diferença no tempo.
        Thread.sleep(1000);
        pilha.push(d2);
        Thread.sleep(1000);
        pilha.push(d3);
        System.out.println(pilha);

        Documento reimpresso = pilha.pop();
        System.out.println("Reimpresso: " + reimpresso + " (espera: " + reimpresso.calcularEspera() + "s)");

        System.out.println("Está na pilha? arquivo2.pdf: " + pilha.contains("arquivo2.pdf"));
        System.out.println("Posição de arquivo1.pdf: " + pilha.posicaoNaPilha("arquivo1.pdf"));    
    }
}
