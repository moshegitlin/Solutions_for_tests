package spring_2022_first_term.Q5;

import java.util.Arrays;

public class Disc {
    private String discName;
    private Song [] songs;

    public Disc(String discName, Song[] songs) {
        this.discName = discName;
        this.songs = songs;
    }

    public String getDiscName() {
        return discName;
    }

    public void setDiscName(String discName) {
        this.discName = discName;
    }

    public Song[] getSongs() {
        return songs;
    }

    public void setSongs(Song[] songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "Disc{" +
                "discName='" + discName + '\'' +
                ", songs=" + Arrays.toString(songs) +
                '}';
    }

    public boolean exist(String nSong, String pSong){
    for (Song s : songs){
        if (s.getName().equals(nSong) && s.getPerformer().equals(pSong)) return true;
    }
    return false;
    }
    public static String largeDiscName(Disc d1, Disc d2){
        Disc max = (d1.getSongs().length >d2.getSongs().length)?d1:d2;
    return max.getDiscName();
    }
}
