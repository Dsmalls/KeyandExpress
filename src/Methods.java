public class Methods {

    public static void main(String [] args){

        // A method is a set of code which is referred to by name and can be called (invoked) at any point in a
        // program simply by utilizing the method's name. Think of a method as a subprogram that acts
        // on data and often returns a value. Each method has its own name.

//        boolean gameOver = true;
//        int Score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        calculateScore(true, 800, 5, 100);

        calculateScore(true, 10000,8, 200);

//        if (gameOver){
//            int finalScore = Score + (levelCompleted * bonus);
//            finalScore += 1000;
//            System.out.println("Your final score was " + finalScore);
//        }

//        Score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        if (gameOver){
//            int finalScore = Score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }
    }

    // new method calculating the score
    // new Method example below
    // defining the parameter from my main method to the new method
    public static void calculateScore(boolean gameOver, int Score, int levelCompleted, int bonus ){
//        boolean gameOver = true;
//        int Score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        if (gameOver){
            int finalScore = Score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
        }

    }
}
