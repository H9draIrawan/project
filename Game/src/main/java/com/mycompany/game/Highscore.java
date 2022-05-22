package com.mycompany.game;

public class Highscore<t,v> {

    private t name;
    private v score;

    public Highscore(t name, v score) {
        this.name = name;
        this.score = score;
    }

    public t getName() {
        return name;
    }

    public void setName(t name) {
        this.name = name;
    }

    public v getScore() {
        return score;
    }

    public void setScore(v score) {
        this.score = score;
    }
    
    
}
