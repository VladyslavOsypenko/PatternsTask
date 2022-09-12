package org.radio;

import org.radio.Broadcasts_composer.Advertising;
import org.radio.Broadcasts_composer.Broadcast;
import org.radio.Broadcasts_composer.Interview;

public interface Builder {

    Builder setDuration (int duration);
    Builder setSong (String singerName, String songName );
    Builder setInterview (Interview interview);
    Builder setAdvertising (Advertising advertising);

    Broadcast build();
}
