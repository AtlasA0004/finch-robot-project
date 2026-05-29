package com.finch;

import com.birdbrain.Finch;

public class FinchTest{
    public static void main(String[] args){
        Finch bird  = new Finch();
        boolean metGoal = false;

        bird.setBeak(100, 100, 100);
        bird.pause(1);

        while(!metGoal){
            bird.setMove("F", bird.getDistance(), 50);
            metGoal =true;
        }



    }
}