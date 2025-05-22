package GerenciamentoTarefa.com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private boolean completed;

    public Task() {
    }

    public static Task createTask() {
        return new Task();
    }

    public Object isCompleted() {

        return null;
    }

    public void getClass(Object completed) {
    }

    public Object getTitle() {

        return null;
    }

