package org.radio.Broadcasts;

import org.radio.Broadcasts.BaseBroadcast;

public class Interview extends BaseBroadcast {

    private String interviewer;
    private final float pricePerMinute = 30;


    public String getInterviewer() {
        return interviewer;
    }

    public void setInterviewer(String interviewer) {
        this.interviewer = interviewer;
    }

    public Interview (int intDuration, String interviewer){
        super(intDuration);
        this.interviewer = interviewer;
    }



    @Override
    public String toString() {
        return "Interview{" +
                "interviewer='" + interviewer + '\'' +
                ", pricePerMinute=" + pricePerMinute +
                '}';
    }
}
