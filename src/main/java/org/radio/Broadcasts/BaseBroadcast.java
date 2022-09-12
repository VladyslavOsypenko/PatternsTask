package org.radio.Broadcasts;

public class BaseBroadcast implements Broadcast {
    String broadcastName;
    public int broadcastDuration;




    public BaseBroadcast (String broadcastName, int broadcastDuration){
        this.broadcastName = broadcastName;
        this.broadcastDuration = broadcastDuration;
    }
    public BaseBroadcast (){

    }
    public BaseBroadcast (int duration){
        this.broadcastDuration = duration;
    }
    @Override
    public void getBroadcast() {

    }

    @Override
    public String toString() {
        return "BaseBroadcast{" +
                "broadcastName='" + broadcastName + '\'' +
                ", broadcastDuration=" + broadcastDuration +
                '}';
    }

    public String getBroadcastName() {
        return broadcastName;
    }

    public void setBroadcastName(String broadcastName) {
        this.broadcastName = broadcastName;
    }

    public int getBroadcastDuration() {
        return broadcastDuration;
    }

    public void setBroadcastDuration(int broadcastDuration) {
        this.broadcastDuration = broadcastDuration;
    }
}
