package org.radio;

import org.radio.Broadcasts.Advertising;
import org.radio.Broadcasts.Broadcast;
import org.radio.Broadcasts.Interview;

public interface Builder {

    Builder setDuration (int duration);
    Builder setSong (String singerName, String songName );
    Builder setInterview (Interview interview);
    Builder setAdvertising (Advertising advertising);

    Broadcast build();
}
