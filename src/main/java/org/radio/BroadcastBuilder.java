package org.radio;

import org.radio.Broadcasts.*;

public class BroadcastBuilder implements Builder{

    BaseBroadcast broadcast = new BaseBroadcast();
    Song song = new Song();

    @Override
    public Builder setDuration(int duration) {
        broadcast.broadcastDuration = duration;
        return this;
    }

    @Override
    public Builder setSong(String singerName, String songName) {
        song.setSingerName(singerName);
        song.setSongName(songName);
        return this;
    }

    @Override
    public Builder setInterview(Interview interview) {
        return null;
    }

    @Override
    public Builder setAdvertising(Advertising advertising) {
        return null;
    }

    @Override
    public Broadcast build() {
        return null;
    }
}
