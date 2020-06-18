package com.company.IteratorPattern;

public class RadioStation {
    public static void main(String[] args) {
        Songs70s songs70s = new Songs70s();
        Songs80s songs80s = new Songs80s();
        Songs90s songs90s = new Songs90s();

        DJ dj = new DJ(songs70s, songs80s, songs90s);
        dj.showTheSongs();
    }
}
