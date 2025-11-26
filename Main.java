import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ListaTarefas lista = new ListaTarefas();
        int idContador = 1;

        while (true) {
            System.out.println("GERENCIAMENTO DE TAREFAS");
            System.out.println("(1) Criar nova tarefa\n(2) Listar tarefas\n(3) Atualizar Tarefas\n(4) Deletar Tarefa\n(5) Finalizar Programa");
            System.out.println("Escolha uma opção: ");

            int option = teclado.nextInt();

            switch (option) {
                case 1:

                    teclado.nextLine();
                    System.out.print("Insira o título da tarefa: ");
                    String title = teclado.nextLine();
                    System.out.print("Insira a descrição da tarefa: ");
                    String description = teclado.nextLine();
                    LocalDate date = LocalDate.now();

                    Tarefa t = new Tarefa(idContador, title, description, LocalDate.now());
                    lista.addTarefa(t);
                    idContador++;
                    break;

                case 2:
                    lista.listaTarefas();
                    break;

                case 3:
                    System.out.print("Digite o ID da tarefa que deseja atualizar: ");
                    int idAtualizar = teclado.nextInt();
                    teclado.nextLine(); // limpar buffer
                    System.out.print("Novo título: ");
                    String newTitle = teclado.nextLine();
                    System.out.print("Nova descrição: ");
                    String newDesc = teclado.nextLine();
                    lista.atualizarTarefa(idAtualizar, newTitle, newDesc);
                    break;

                case 4:
                    System.out.print("Digite o ID da tarefa que deseja deletar: ");
                    int idDeletar = teclado.nextInt();
                    lista.delTarefa(idDeletar);
                    break;

                case 5:
                    System.out.println("Finalizando Programa");
                    teclado.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
