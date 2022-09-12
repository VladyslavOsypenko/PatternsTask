package org.radio.Broadcasts_composer;

public class Song extends BaseBroadcast {
    private String singerName;
    private String songName;

    public Song (int songDuration, String singerName, String songName){
        super(songDuration);
        this.singerName = singerName;
        this.songName = songName;
    }

    public Song() {

    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }



    @Override
    public String toString() {
        return "Song{" +
                "singerName='" + singerName + '\'' +
                ", songName='" + songName + '\'' +
                '}';
    }
}
