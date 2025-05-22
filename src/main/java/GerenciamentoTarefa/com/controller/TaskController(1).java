package GerenciamentoTarefa.com.controller;

import GerenciamentoTarefa.com.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService service;

    @GetMapping
    public List<Task> getAllTasks() {
        return service.listAll();
    }

    @GetMapping("/{id}")
    public Task getTask(@PathVariable Long id) {
        return service.getById(id).orElse(null);
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return service.save(task);
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
        return service.update(id, task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        service.delete(id);
    }
}
