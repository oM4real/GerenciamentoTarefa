package GerenciamentoTarefa.com.service;

import GerenciamentoTarefa.com.model.Task;
import GerenciamentoTarefa.com.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    public List<Task> listAll() {
        return repository.findAll();
    }

    public Optional<Task> getById(Long id) {
        return repository.findById(id);
    }

    public Task save(Task task) {
        return repository.save(task);
    }

    public Task update(Long id, Task taskData) {
        return repository.findById(id).map(task -> {
            task.getClass(taskData.getTitle());
            task.setDescription(taskData.getDescription());
            task.getClass(taskData.isCompleted());
            return repository.save(task);
        }).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
