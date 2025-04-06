public class Manutencao {
    private Cliente cliente;
    private Equipamento equipamento;
    private String descricao;
    private String tipoManutencao;

    public Manutencao(Cliente cliente, Equipamento equipamento, String descricao, String tipoManutencao) {
        this.cliente = cliente;
        this.equipamento = equipamento;
        this.descricao = descricao;
        this.tipoManutencao = tipoManutencao;
    }

    public void realizarManutencao() {
        equipamento.setStatus("Em manutenção");

        System.out.println("\nManutenção: " + tipoManutencao);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CNPJ: " + cliente.getCnpj());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("\nRealizando manutenção no equipamento: " + equipamento.getNome());
        System.out.println("Descrição do serviço: " + descricao);
        System.out.println("Status do equipamento: " + equipamento.getStatus());
    }
}
