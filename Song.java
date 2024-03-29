/**
 * File for a Song class to be used in the Playlist Project
 * @author Brendan Poon
 * @version 01/17/24
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private String title;
    private String artist;
    private int durationInSeconds;
    private boolean isLiked;

    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song (String myTitle, String myArtist, int myDurationInSeconds) {
        title = myTitle;
        artist = myArtist;
        durationInSeconds = myDurationInSeconds;
        isLiked = false;
    }

     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */

      public String getTitle(){
        return title;
      }

      public String getArtist(){
        return artist;
      }

      public int getDuration(){
        return durationInSeconds;
      }

      public boolean getIsLiked(){
        return isLiked;
      }

      public String toString(){
        return title + " by " + artist + " (" + durationInSeconds / 60 + ":" + durationInSeconds % 60 + ") " + ", Liked: " + isLiked;
      }

      public void Like(){
        isLiked = true;
      }

      public void UnLike(){
        isLiked = false;
      }

}
