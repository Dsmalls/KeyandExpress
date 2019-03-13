public class MethodsPart2 {

    public static void main(String [] args){

        boolean gameOver = true;
        int Score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, Score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        Score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, Score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        System.out.println("========================================");

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("James", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Willie", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Tony", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Dez", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position "
        + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000){
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000){
            return 2;
        } else if (playerScore >= 100 && playerScore < 500){
            return 3;
        } else {
            return  4;
        }
    }



    public static int calculateScore(boolean gameOver, int Score, int levelCompleted, int bonus){

        if (gameOver){
            int finalScore = Score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }

}