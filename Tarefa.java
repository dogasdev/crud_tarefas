import java.time.LocalDate;

public class Tarefa {
    private int id;
    private String title;
    private String description;
    private LocalDate date;

    public Tarefa(int id, String title, String description, LocalDate date) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.date = date;
    }

    public int getID() {
        return id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "Tarefa #" + id + "\nTítulo: " + title + "\nDescrição: " + description + "\nData: " + date;
    }
}
