package com.company.IteratorPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Songs80s implements ISongIterator{
    ArrayList<SongInfo> bestSongs;

    public Songs80s() {
        bestSongs = new ArrayList<>();
        addSong("Roam", "B 52s", 1989);
        addSong("Cruel Summer", "Bananarama", 1984);
        addSong("Head Over Heels", "Tears For Fears", 1985);
    }

    private void addSong(String songName, String bandName, int releaseDate){
        SongInfo song = new SongInfo(songName, bandName, releaseDate);
        bestSongs.add(song);
    }

    @Override
    public Iterator createIterator() {
        return bestSongs.iterator();
    }
}
