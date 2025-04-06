public class Equipamento {
    private String nome;
    private String tipo;
    private String status;
    private String valorServico;

    public Equipamento(String nome, String tipo, String status, String valorServico) {
        this.nome = nome;
        this.tipo = tipo;
        this.status = status;
        this.valorServico = valorServico;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getStatus() {
        return status;
    }

    public String getValorServico() {
        return valorServico;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Equipamento: " + nome + ", Tipo: " + tipo + ", Status: " + status + ", Valor do serviço: " + valorServico;
    }
}
