public class Main {

    public static void main(String[] args) {
        // Expression...are building blocks of any Java program, usually created to produce a new value, although sometimes
        // an expression assigns a value to a variable. Expressions are built using values, variables, operators and method calls.
        //  a mile is equal to 1.609344 kilometers

        double kilometers = (100 * 1.609344); // this is an expression...(double is the data type)
        int highscore = 50;

        if (highscore == 50) {
            System.out.println("This is an expression");
        }

        // which of the following code below are expressions
        int score = 100; // score = 100; is and expression...(int is a data type)
        if (score > 99) { // score > 99 is an expression
            System.out.println("I got the high score"); // " I got the high score" is and espression
            score = 0; // this is an expression
        }

    }
}
