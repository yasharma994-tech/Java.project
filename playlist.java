import java.util.Random;

public class Playlist {
    private Song[] songs;
    private int count;

    public Playlist(int capacity) {
        this.songs = new Song[capacity];
        this.count = 0;
    }

    public void addSong(Song song) {
        if (count < songs.length) {
            songs[count] = song;
            count++;
        }
    }

    public void shufflePlaylist() {
        Random random = new Random();
        for (int i = count - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Song temp = songs[i];
            songs[i] = songs[j];
            songs[j] = temp;
        }
    }

    public void display() {
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + songs[i]);
        }
    }
}
