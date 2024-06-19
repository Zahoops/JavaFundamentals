public class IfThenStatements {

    public static void main (String [] args){

        //Variables
        boolean gameOver = true;
        int score = 5000;
        int levelComplete = 5;
        int bonus = 100;
        //Simple if statement
        if (score == 5000) {
            System.out.println("Your score is 5000");
        }
        //Simple if else statement
        if (score <= 5000){//This code block will execute if conditions are met
            System.out.println("Your score was less than or equal to 5000");
        } else {//This code block will execute if conditions above are not met
            System.out.println("Got here");
        }
        //If with an else if and else block
        if ((score <= 5000) && (score > 1000)){//This condition is checked first
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000){//If above condition is false, this is then executed
            System.out.println("Your score was less than 1000");
        } else {//If both prior conditions are false, then this is executed.
            System.out.println("Got here");
        }






    }
}
