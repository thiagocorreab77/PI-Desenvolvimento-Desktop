import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coleta de dados
        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o CNPJ do cliente:");
        String cnpjCliente = scanner.nextLine();

        System.out.println("Digite o telefone do cliente:");
        String telefoneCliente = scanner.nextLine();

        System.out.println("Digite o equipamento:");
        String nomeEquipamento = scanner.nextLine();

        System.out.println("Digite a descrição do serviço:");
        String descricaoServico = scanner.nextLine();

        System.out.println("Digite o valor do serviço:");
        String valorServico = scanner.nextLine();

        System.out.println("Digite o status do equipamento:");
        String statusEquipamento = scanner.nextLine();

        System.out.println("Manutenção Elétrica? ou Mecânica?");
        String tipoEquipamento = scanner.nextLine();

        System.out.println("Digite manutenção Preventiva? Ou Corretiva?");
        String tipoManutencao = scanner.nextLine();

        // Criação dos objetos
        Cliente cliente = new Cliente(nomeCliente, cnpjCliente, telefoneCliente);
        Equipamento equipamento = new Equipamento(nomeEquipamento, tipoEquipamento, statusEquipamento, valorServico);
        Manutencao manutencao = new Manutencao(cliente, equipamento, descricaoServico, tipoManutencao);

        // Limpa visual (simulado) e mostra resultado
        System.out.print("\033[H\033[2J"); // Comando ANSI para limpar o console (funciona em alguns terminais)
        System.out.flush();

        manutencao.realizarManutencao();

        scanner.close();
    }
}
