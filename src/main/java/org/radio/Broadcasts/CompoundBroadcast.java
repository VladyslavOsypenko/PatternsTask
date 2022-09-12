package org.radio.Broadcasts;

import org.radio.Broadcasts.BaseBroadcast;
import org.radio.Broadcasts.Broadcast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompoundBroadcast extends BaseBroadcast {


    protected List <Broadcast> list = new ArrayList<>();

    public CompoundBroadcast(int duration, String name, Broadcast... list){
        super(name,duration);
        add(list);
    }


    public void add(Broadcast broadcast){
        list.add(broadcast);
    }

    public void add(Broadcast... broadcast){
        list.addAll(Arrays.asList(broadcast));
    }

    @Override
    public int getBroadcastDuration(){
        return list.stream().mapToInt(Broadcast::getBroadcastDuration).sum();
    }

    public void getBroadcast(Broadcast... list){
        System.out.println("Duration: " + getBroadcastDuration() + " " + "Broadcast Name: " + getBroadcastName());
        for (int i = 0; i<list.length; i++ ){
            System.out.println(Arrays.toString(list));
        }


    }

    @Override
    public String toString() {
        return "BroadcastProgramsList: " + '\n' +  list;
    }
}
