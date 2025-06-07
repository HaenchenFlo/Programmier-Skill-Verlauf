package Prog2.AB6.Aufgabe4;

import java.time.Duration;
import java.util.Objects;

public class Song {
    private String title;
    private String artist;
    private Duration duration;
    private int releaseDate;
    private String lyrics;

    public Song(String title,String artist,Duration duration, int releaseDate) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.releaseDate = releaseDate;
        this.lyrics = "";
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public String getTitle() {
        return this.title;
    }
    public String getArtist() {
        return this.artist;
    }
    public Duration getDuration() {
        return this.duration;
    }
    public int getReleaseDate() {
        return this.releaseDate;
    }
    public String getLyrics() {
        return this.lyrics;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s",
                releaseDate, artist, title, formatDuration(duration));
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;
        Song song = (Song) o;
        return releaseDate == song.releaseDate &&
                Objects.equals(title, song.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, releaseDate);
    }

    private String formatDuration(Duration duration) {
        long minutes = duration.toMinutes();
        long seconds = duration.minusMinutes(minutes).getSeconds();
        return String.format("%d:%02d", minutes, seconds);
    }
}
