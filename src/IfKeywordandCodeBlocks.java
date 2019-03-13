public class IfKeywordandCodeBlocks {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 5;
        int bonus = 100;

        // The Java if statement is used to test the condition. It checks boolean condition: true or false.
        // There are various types of if statement in java.
        // -if statement
        // -if-else statement
        // -if-else-if ladder
        // -nested if statement

        if (score < 10000) {
            System.out.println("Your score was 10000");
        } else {
            System.out.println("Got it here");
        }

        if (score == 10000) {
            System.out.println("Your score was 10000");
        }

        if (score < 10000 && score > 15000) {
            System.out.println("Your score was less than 10000 but great than 5000");
        } else if (score < 15000){
            System.out.println("Your score was less than 5000");
        } else {
            System.out.println("Got it");
        }

        System.out.println("===================================================================");

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }





    }
}
