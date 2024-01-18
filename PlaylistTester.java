/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @BrendanPoon
 * @01/18/24
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        //Make your playlist here
        Playlist p = new Playlist();

        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */
        p.addSong(new Song("Piano Concerto No. 2", "Sergei Rachmaninoff", 2053));
        p.addSong(new Song("Life on Mars", "David Bowie", 250));
        p.addSong(new Song ("Ballade No. 1", "Frédéric Chopin", 563));
        p.addSong(new Song("November Rain", "Guns N' Roses", 557));

        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        p.examineSongs();

        System.out.println("Liking the songs in positions 0 and 3...\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        p.likeSong(0);
        p.likeSong(3);

        System.out.println("Printing the songs...\n");
        p.examineSongs();

        System.out.println("Removing the song in position 1...\n");
        p.removeSong(1);

        System.out.println("Printing the songs...\n");
        p.examineSongs();

        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!
        p.examineLikedSongs();

        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        System.out.println(p.getTotalDuration());

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        p.removeUnlikedSongs();

        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
        p.examineLikedSongs();
    }
}
