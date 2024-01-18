import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList<Song> p;

     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
    public Playlist(){
        p = new ArrayList<Song>();
    }
      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */
    public void addSong(Song mySong) {
        p.add(mySong);
    }

    public void likeSong(int pos) {
        p.get(pos).Like();
    }

    public void removeSong(int pos) {
        p.remove(pos);
    }

    public void examineSongs(){
        for(int i = 0; i < p.size(); i++){
            System.out.println(p.get(i).toString());
            System.out.println();
        }
    }

    public void examineLikedSongs(){
        for(int i = 0; i < p.size(); i++){
            if(p.get(i).getIsLiked()){
                System.out.println(p.get(i).toString());
                System.out.println();
            }
        }
    }

    public int getTotalDuration(){
        int totalDuration = 0;

        for(int i = 0; i < p.size(); i++){
            totalDuration += p.get(i).getDuration();
        }

        return totalDuration;
    }

    


}
