# Expass4

## Experiment 1

### Created an collection:
![image](https://github.com/587851/dat250assignment1/assets/69521897/634e944a-c7de-4672-a2fc-3c529383fdb6)

### Ran the collection:
![image](https://github.com/587851/dat250assignment1/assets/69521897/5e3580c8-fd13-4fd3-a870-28c395d82f67)

### The responses and request:
![image](https://github.com/587851/dat250assignment1/assets/69521897/a703b74d-4d0e-4136-ba3f-b9f7b18775ad)
![image](https://github.com/587851/dat250assignment1/assets/69521897/f18d1da7-7258-41e9-8ab1-4a7b24644963)

![image](https://github.com/587851/dat250assignment1/assets/69521897/20c540e2-ac20-4c27-8144-f9e3732bc817)


## Experiment 2

```
package no.hvl.dat250.rest.todos;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Rest-Endpoint for todos.
 */
@RestController
@RequestMapping("/todos")
public class TodoController {

  public static final String TODO_WITH_THE_ID_X_NOT_FOUND = "Todo with the id %s not found!";

  private Map<Long, Todo> todos = new HashMap<>();
  private long id = 0L;

  @GetMapping("/{id}")
  public Todo getTodo(@PathVariable Long id) {
    if(!todos.containsKey(id)){
      throw new RuntimeException(TODO_WITH_THE_ID_X_NOT_FOUND.formatted(id));
    }
    return todos.get(id);
  }

  @PutMapping("/{id}")
  public Todo updateTodo(@RequestBody Todo newTodo, @PathVariable Long id) {
    if (!todos.containsKey(id)){
      throw new RuntimeException(TODO_WITH_THE_ID_X_NOT_FOUND.formatted(id));
    }
    Todo t = todos.get(id);
    t.setSummary(newTodo.getSummary());
    t.setDescription(newTodo.getDescription());
    return newTodo;
  }

  @PostMapping()
  public Todo createTodo(@RequestBody Todo newTodo) {
    newTodo.setId(id++);
    todos.put(newTodo.getId(), newTodo);
    return newTodo;
  }

  @DeleteMapping("/{id}")
  public Todo deleteTodo(@PathVariable Long id){
    if (!todos.containsKey(id)){
      throw new RuntimeException(TODO_WITH_THE_ID_X_NOT_FOUND.formatted(id));
    }
      return todos.remove(id);
  }
  @GetMapping
  public List<Todo> getAllTodos() {
      return new ArrayList<Todo>(todos.values());
  }
}
```

![image](https://github.com/587851/dat250assignment1/assets/69521897/57d6490f-30f8-40df-a855-cb31322eb670)


## Experiment 3 (optional)
Did not do

## Experiment 4 (optional)
Did not do

I had no issues or technical problems during the expass. 
