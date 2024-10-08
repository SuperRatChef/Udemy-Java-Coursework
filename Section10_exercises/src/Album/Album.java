package Album;
import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<Song>();
    }
    public boolean addSong(String title, double duration){
        Song isAlreadyOnSongs = findSong(title);
        if(isAlreadyOnSongs == null){
            songs.add(new Song(title, duration));
            return true;
        }
        else{
            return false;
        }
    }
    private Song findSong(String songName){
        for(Song song: songs){
            if(song.getTitle() == songName){
                return song;
            }
        }
        return null;
    }
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if (index >= 0 && index < this.songs.size()) {
            playList.add(this.songs.get(index));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song song = findSong(title);
        if (song != null) {
            playList.add(song);
            return true;
        }
        return false;
    }
}