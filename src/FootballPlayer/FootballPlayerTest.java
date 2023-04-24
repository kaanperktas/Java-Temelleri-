package FootballPlayer;

public class FootballPlayerTest {
    public static void main(String[] args) {
        FootBallPlayer player = new FootBallPlayer();
        player.no = 13;
        player.name = "Enner Valencia";
        player.minutes = 0;
        player.inPlay = true;
        player.numberOfGoals = 0;

        player.play(90);
        player.score();
        player.score();
        player.score();
        player.play(32);

        System.out.println("Alex played totally" + " " + player.minutes + " " + "minutes so far.");
        System.out.println("Number of goals Alex scored:" + " " + player.numberOfGoals);
    }
}
