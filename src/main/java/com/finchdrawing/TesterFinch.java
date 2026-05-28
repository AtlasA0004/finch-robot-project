package com.finchdrawing;

import com.birdbrain.Finch;

public class TesterFinch {
    public static void main(String[] args){
        FinalFinch bird = new FinalFinch("A");

        bird.playNote(60,0.5);
        bird.setBeak(5, 0, 100);
        
        for (int i = 0; i< 16; i++){
            bird.setMove("F", 10, 100);
            bird.setTurn("R",90,100);
        }

    }


}