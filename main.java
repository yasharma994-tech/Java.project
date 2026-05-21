public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist(5);

        playlist.addSong(new Song("Believer", "Imagine Dragons"));
        playlist.addSong(new Song("Shape of You", "Ed Sheeran"));
        playlist.addSong(new Song("Blinding Lights", "The Weeknd"));

        System.out.println("Playlist:");
        playlist.display();

        System.out.println();

        playlist.shufflePlaylist();
        System.out.println("After Shuffle:");
        playlist.display();
    }
}
