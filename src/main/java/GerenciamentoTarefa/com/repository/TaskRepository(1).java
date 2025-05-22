package GerenciamentoTarefa.com.repository;

import GerenciamentoTarefa.com.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
