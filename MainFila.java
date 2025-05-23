import java.time.LocalDateTime;

public class MainFila {
    public static void main(String[] args) {
        FilaDocumento fila = new FilaDocumento(3);

        PilhaDocumento d1 = new PilhaDocumento("arquivo1.pdf", "João");
        PilhaDocumento d2 = new PilhaDocumento("arquivo2.pdf", "Maria");
        PilhaDocumento d3 = new PilhaDocumento("arquivo3.pdf", "Ana");

        // Adicionando documentos
        fila.enfileira(d1);
        fila.enfileira(d2);
        fila.enfileira(d3);

        // Tentando adicioanr mais um documento
        PilhaDocumento d4 = new PilhaDocumento("arquivo4.pdf", "Carlos");
        try {
            fila.enfileira(d4); 
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        
        fila.mostrarFila();

        // Consultas
        System.out.println("Contém arquivo2.pdf? " + (fila.buscarDocumento("arquivo2.pdf") != -1));
        System.out.println("Posição de arquivo2.pdf: " + fila.buscarDocumento("arquivo2.pdf"));

        // Impressão de documentos
        PilhaDocumento impresso = fila.desenfileira();
        System.out.println("Documento impresso: " + impresso);
    }
}
