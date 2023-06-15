package spring_2022_first_term.Q5;

public class Song {
    private String name;
    private String performer;
    private int length;

    public Song(String name, String performer, int length) {
        this.name = name;
        this.performer = performer;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", performer='" + performer + '\'' +
                ", length=" + length +
                '}';
    }

    public String status() {
        return performer+"/"+name+":"+length;
    }
}
