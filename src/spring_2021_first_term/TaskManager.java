package spring_2021_first_term;

import java.util.Arrays;
import java.util.Random;

public class TaskManager {
    private Task[] tasks;
    private int numOfTasks;
    public static Random rd = new Random();
    public TaskManager() {
       this.tasks = new Task[100];
       this.numOfTasks =0;
    }

    public Task[] getTasks() {
        return tasks;
    }

    public void setTasks(Task[] tasks) {
        this.tasks = tasks;
    }

    public int getNumOfTasks() {
        return numOfTasks;
    }

    public void setNumOfTasks(int numOfTasks) {
        this.numOfTasks = numOfTasks;
    }

    @Override
    public String toString() {
        return "TaskManager{" +
                "tasks=" + Arrays.toString(tasks) +
                ", numOfTasks=" + numOfTasks +
                '}';
    }
     void insertRandomTasksAll(){
        String[] names = {"Alice", "Bob",
                "Charlie", "Dave", "Eve",
                "Frank", "Grace", "Hannah",
                "Isaac", "Jack", "Kelly",
                "Liam", "Mia", "Nathan",
                "Olivia", "Peter", "Quinn",
                "Rachel", "Sarah", "Tyler",
                "Uma", "Violet", "Wesley",
                "Xander", "Yara", "Zachary"};
        for (int i = 0,j=0; i < tasks.length; i++,j++) {
            String title = names[rd.nextInt(names.length)];
            int minutes = rd.nextInt(60);
            int priority = rd.nextInt(8);
            Task t1 = new Task(title,minutes,priority);
            this.tasks[i] = t1;
        }
        this.numOfTasks =100;

    }
    int importantTask(){
        Task priority = this.tasks[0];
        int index =0;
        for (int i = 0; i < tasks.length; i++) {
            if (priority.getPriority() < tasks[i].getPriority() && !(tasks[i].isComplete())){
                priority =tasks[i];
                index =i;
            }
        }
        return priority.isComplete()?-1:index;
    }
    void Work(int num){
        int i=0;
        int work = importantTask();
        while (num >0 && work >-1){
            if (tasks[work].getMinutes() <= num){
                num -= tasks[work].getMinutes();
                tasks[work].setComplete(true);
                this.numOfTasks--;
            } else {
                tasks[work].setMinutes(tasks[work].getMinutes() - num);
                num -= tasks[work].getMinutes();
            }
            work =importantTask();

        }
    }
    boolean addTask(Task t){
        boolean test = false;
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i]== null || tasks[i].isComplete()) {
                tasks[i] = t;
                test=true;
            }
        }
       return test;
    }
}
