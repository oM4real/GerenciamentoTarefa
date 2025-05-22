package GerenciamentoTarefa.com.GerenciamentoTarefa;

public class Task extends GerenciamentoTarefa.com.model.Task {
    private TaskImpl() {
    }

    @org.jetbrains.annotations.NotNull
    @org.jetbrains.annotations.Contract(" -> new")
    public static TaskImpl createTaskImpl() {
        return new TaskImpl();
    }
}
