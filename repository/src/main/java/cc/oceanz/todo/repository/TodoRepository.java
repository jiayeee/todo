package cc.oceanz.todo.repository;

import cc.oceanz.todo.model.TodoItem;

import java.util.HashMap;
import java.util.Map;

public class TodoRepository {

    private static Map<String, TodoItem> items = new HashMap<>();

    public void save(TodoItem item) {
        items.put(item.getName(), item);
    }

    public TodoItem query(String name) {
        return items.get(name);
    }
}
