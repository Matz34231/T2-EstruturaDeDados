import java.time.LocalDateTime;

public class Documento{
    private String nomeArquivo;
    private String nomeUsuario;
    private LocalDateTime horarioSolicitacao;
    private LocalDateTime horarioImpressao;

    public Documento(String nomeArquivo, String nomeUsuario){
        this.nomeArquivo = nomeArquivo;
        this.nomeUsuario = nomeUsuario;
        this.horarioSolicitacao = LocalDateTime.now();
    }
    public void impressaoImpressao(){
        this.horarioImpressao = LocalDateTime.now();
    }
    public long calcularEspera() {
        if(horarioImpressao != null)
            return java.time.Duration.between(horarioSolicitacao, horarioImpressao).toSeconds();
        return -1;
    }
    public String getNomeArquivo() {
        return nomeArquivo;
    }
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    public LocalDateTime getHorarioSolicitacao() {
        return horarioSolicitacao;
    }
    @Override
    public String toString() {
        return nomeArquivo + "("+ nomeUsuario + ") - Solicitado: " + horarioSolicitacao;
    }
}