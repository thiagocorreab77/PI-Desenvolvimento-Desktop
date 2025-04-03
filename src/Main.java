import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cadastro de clientes
        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Digite o CNPJ do cliente:");
        String endereco = scanner.nextLine();
        System.out.println("Digite o telefone do cliente:");
        String telefone = scanner.nextLine();

        Cliente cliente = new Cliente(nomeCliente, endereco, telefone);

        // Cadastro de equipamento
        System.out.println("Digite o nome do equipamento:");
        String nomeEquipamento = scanner.nextLine();
        System.out.println("Digite o valor do serviço:");
        String tipoEquipamento = scanner.nextLine();
        System.out.println("Digite o status do equipamento (Ex: Funcionando, Quebrado,):");
        String statusEquipamento = scanner.nextLine();

        Equipamento equipamento = new Equipamento (nomeEquipamento, tipoEquipamento, statusEquipamento);

        // Realizar manutenção
        System.out.println("Digite a descrição da manutenção:");
        String descricaoManutencao = scanner.nextLine();

        Manutencao manutencao = new Manutencao(cliente, equipamento, descricaoManutencao);
        manutencao.realizarManutencao();
        
        scanner.close();
    }
}


