
public class Manutencao {
    private Cliente cliente;
    private Equipamento equipamento;
    private String descricao;

    public Manutencao(Cliente cliente, Equipamento equipamento, String descricao) {
        this.cliente = cliente;
        this.equipamento = equipamento;
        this.descricao = descricao;
    }

    public void realizarManutencao() {
        System.out.println("Realizando manutenção no equipamento: " + equipamento.getNome());
        System.out.println("Cliente: " + cliente.getNome());
        equipamento.setStatus("Em manutenção");
        System.out.println("Descrição: " + descricao);
        System.out.println("Status do equipamento: " + equipamento.getStatus());
    }
}

