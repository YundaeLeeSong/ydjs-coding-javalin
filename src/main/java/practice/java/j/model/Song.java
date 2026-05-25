package practice.java.j.model;

/**
 * Sample class used to model a Song.
 */
public class Song {
    public String title;
    public int runtime;

    public Song() {
        this.title = "sample title";
        this.runtime = 180;
    }

    public Song(String title, int runtime) {
        this.title = title;
        this.runtime = runtime;
    }

    @Override
    public String toString() {
        return "Song{" + "title='" + title + '\'' + ", runtime=" + runtime + '}';
    }
}
