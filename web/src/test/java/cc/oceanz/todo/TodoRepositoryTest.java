package cc.oceanz.todo;

import cc.oceanz.todo.model.TodoItem;
import cc.oceanz.todo.repository.TodoRepository;
import org.junit.Assert;
import org.junit.Test;

public class TodoRepositoryTest {

    private TodoRepository repository = new TodoRepository();

    @Test
    public void testSave() {

        TodoItem item = new TodoItem("oceanz");
        repository.save(item);

        item = repository.query(item.getName());
        Assert.assertNotNull(item);
//        Assert.assertNull(item);
    }
}
