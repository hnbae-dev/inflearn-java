package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {

    Queue<Task> taskQueue = new ArrayDeque<>();

    public void addTask(Task task) {
        taskQueue.offer(task);
    }

    public void processNextTask() {
        Task task = taskQueue.poll();
        task.execute();
    }

    public int getRemainingTasks() {
        return taskQueue.size();
    }
}
