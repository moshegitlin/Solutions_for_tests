package Summer_2022_second_term.Q4;

public class Actor {
    protected String name;
    protected int age;
    protected int numActs;

    public Actor(String name, int age, int numActs) {
        this.name = name;
        this.age = age;
        this.numActs = numActs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumActs() {
        return numActs;
    }

    public void setNumActs(int numActs) {
        this.numActs = numActs;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", numActs=" + numActs +
                '}';
    }
}
