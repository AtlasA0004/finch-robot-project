package com.finch;

import com.birdbrain.Finch;

public class FinchTest{
    public static void main(String[] args){
        Finch bird  = new Finch();
        boolean metGoal = false;

        bird.setBeak(100, 100, 100);
        bird.pause(1);

        while(!metGoal){
            
            if(bird.getDistance() > 5){
                bird.setMove("F", (bird.getDistance() - 4), 50);
            }

            bird.setTurn("R", 90, 50);
            if(bird.getDistance() < 5){

                bird.setTurn("L", 180, 50);

                if(bird.getDistance() < 5){
                    metGoal = true;
                }

            }


        }



    }
}