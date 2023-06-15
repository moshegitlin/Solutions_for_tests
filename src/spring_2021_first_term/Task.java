package spring_2021_first_term;

public class Task {
    private String title;
    private int minutes;
    private int priority;
    private boolean isComplete;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", minutes=" + minutes +
                ", priority=" + priority +
                ", isComplete=" + isComplete +
                '}';
    }

    public Task(String title, int minutes, int priority) {
        this.title = title;
        this.minutes = minutes;
        this.priority = priority;
        this.isComplete =false;

    }
    int doIt(int num){
        if(num > this.minutes){
            this.isComplete=false;

        }else {
            this.isComplete=true;
            this.minutes =num;
        }
        return this.isComplete?0:num- this.minutes;
    }


}
