public class MethodOverloading {

    // Method Overloading allows a class to have more than one method having
    // the same name, if their argument lists are different. It is similar to constructor overloading
    // in Java, that allows a class to have more than one constructor having different argument lists.


    public static void main(String [] args){
        int newScore = calculateScore("Robert" , 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        System.out.println("==============================================");
        calcFeetAndInchesToCentimeters(7, 5);
        calcFeetAndInchesToCentimeters(100);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        if ((feet < 0) && ((inches < 0) && (inches > 12))){
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){

        if (inches < 0) {
            return  -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " score " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;

    }
}
