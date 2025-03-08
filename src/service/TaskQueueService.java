package service;

import model.Task;
import java.util.ArrayDeque;
import java.util.Queue;

public class TaskQueueService {
    private Queue<Task> queue = new ArrayDeque<>();

    public void enqueue(Task task) {
        queue.offer(task);
    }

    public Queue<Task> listTasks() {
        return new ArrayDeque<>(queue);
    }

    public Task dequeue() {
        return queue.poll();
    }
}
