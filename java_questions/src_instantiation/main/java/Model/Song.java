package Model;

/**
 * Sample class used to model a Song.
 * There is no need to change anything in this class.
 */
public class Song {
    String title;
    int runtime;

    /**
     * No-args constructor
     */
    public Song(){
//        some sensible starting values
        this.title = "sample title";
        this.runtime = 180;
    }

    /**
     * Constructor that may be used when we would like to provide the starting values for this
     * model's fields
     */
    public Song(String title, int runtime) {
        this.title = title;
        this.runtime = runtime;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", runtime=" + runtime +
                '}';
    }
}
