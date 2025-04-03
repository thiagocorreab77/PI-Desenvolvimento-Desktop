

public class Equipamento {
    private String nome;
    private String tipo;
    private String status;

    public Equipamento(String nome, String tipo, String status) {
        this.nome = nome;
        this.tipo = tipo;
        this.status = status;
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

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Equipamento: " + nome + ", Tipo: " + tipo + ", Status: " + status;
    }
}
