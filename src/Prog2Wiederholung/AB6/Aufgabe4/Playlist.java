package Prog2Wiederholung.AB6.Aufgabe4;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Song> songs;

    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public void add(Song song) {
        songs.add(song);
    }

    public void delete(Song song) {
        songs.remove(song);
    }

    public void play() {
        if(songs.isEmpty()) {
            System.out.println("Playlist ist Leer");
            return;
        }
        for(Song song : songs) {
            play(song);
        }
    }

    public void play(Song song) {
        System.out.println("Spiele Song: " + song);
        System.out.println(song.getLyrics());
        System.out.println("---------------");
    }

    public void shuffle() {
        if(songs.isEmpty()) {
            System.out.println("Playlist ist Leer");
            return;
        }
        RandomIterator<Song> iterator = new RandomIterator<>(songs);
        while(iterator.hasNext()) {
            play(iterator.next());
        }
    }
 }
