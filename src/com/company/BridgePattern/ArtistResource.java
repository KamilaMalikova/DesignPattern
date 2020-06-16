package com.company.BridgePattern;

public class ArtistResource implements IResource{
    Artist artist;

    public ArtistResource(Artist artist){
        this.artist = artist;
    }

    @Override
    public String snipped() {
        return artist.bio;
    }

    @Override
    public String image() {
        return artist.image;
    }

    @Override
    public String title() {
        return artist.name;
    }

    @Override
    public String url() {
        return artist.url;
    }
}
