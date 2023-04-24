package FootballPlayer;

public class FootBallPlayer {
    int no;
    String name;
    boolean inPlay;
    int minutes;
    int numberOfGoals;

    void play(int minutesToPlay){
        minutes =  minutes + minutesToPlay;
    }
    void  score(){
        numberOfGoals ++;
    }
}
