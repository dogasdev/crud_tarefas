import java.util.ArrayList;

public class ListaTarefas {
    private ArrayList<Tarefa> tarefas;

    public ListaTarefas() {
        tarefas = new ArrayList<>();
    }

    public void addTarefa(Tarefa t) {
        tarefas.add(t);
    }

    public void listaTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Você não criou nenhuma tarefa");
        } else {
            for (Tarefa t : tarefas) {
                System.out.println(t);
            }
        }
    }

    public boolean atualizarTarefa(int id, String newTitulo, String newDesc) {
        for (Tarefa t : tarefas) {
            if (t.getID() == id) {
                t.setTitle(newTitulo);
                t.setDescription(newDesc);
                return true;
            }
        }
        return false;
    }

    public boolean delTarefa(int id) {
        for (Tarefa t : tarefas) {
            if (t.getID() == id) {
                tarefas.remove(t);
                return true;
            }
        }
        return false;
    }
}
