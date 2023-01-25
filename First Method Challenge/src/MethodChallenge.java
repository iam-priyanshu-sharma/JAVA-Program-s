public class MethodChallenge {

  public static void main(String[] args) {

    int highScorePosition = calculateHighScorePosition(1500);

    displayHighScorePosition("Priyanshu", highScorePosition);

    highScorePosition = calculateHighScorePosition(1000);

    displayHighScorePosition("Aditya", highScorePosition);

    highScorePosition = calculateHighScorePosition(500);

    displayHighScorePosition("Sanket", highScorePosition);

    highScorePosition = calculateHighScorePosition(100);

    displayHighScorePosition("Ashish", highScorePosition);

    highScorePosition = calculateHighScorePosition(50);

    displayHighScorePosition("Rohit", highScorePosition);
  }

  public static void displayHighScorePosition(String player_name, int high_score_position) {

    System.out.println(
        player_name + " get " + high_score_position + " position on the high score list.");
  }

  public static int calculateHighScorePosition(int player_score) {

    int position = 0;

    if (player_score >= 1000) {
      position = 1;
    } else if (player_score >= 500) {
      position = 2;
    } else if (player_score >= 100) {
      position = 3;
    } else {
      position = 4;
    }
    return position;
  }
}
