public class MainPilha {
    public static void main(String[] args) throws InterruptedException {
        PilhaReimpressao pilha = new PilhaReimpressao(3);

        PilhaDocumento d1 = new PilhaDocumento("Arquivo.pdf", "https://github.com/Matz34231/T2-EstruturaDeDados/blob/main/FilaDocumento.java");
        PilhaDocumento d2 = new PilhaDocumento("Arquivo.pdf", "Pedro");
        PilhaDocumento d3 = new PilhaDocumento("Arquivo.pdf", "https://github.com/Matz34231/T2-EstruturaDeDados/blob/main/FilaDocumento.java");

        pilha.push(d1);
        
        //espera 1 segundo pra visualizar a diferença no tempo.
        Thread.sleep(1000);
        pilha.push(d2);
        Thread.sleep(1000);
        pilha.push(d3);
        System.out.println(pilha);

        PilhaDocumento reimpresso = pilha.pop();
        System.out.println("Reimpresso: " + reimpresso + " (espera: " + reimpresso.calcularEspera() + "s)");

        System.out.println("Está na pilha? arquivo2.pdf: " + pilha.contains("arquivo2.pdf"));
        System.out.println("Posição de arquivo1.pdf: " + pilha.posicaoNaPilha("arquivo1.pdf"));    
    }
}
    