public class IfThenElseChallenge {
    public static void main(String[] args) {
        //Challenge: Create a new code segment identical to the first, then output 2 different print statements
        //Code Segment 1
        boolean gameOver = true;
        int score = 800;
        int levelComplete = 5;
        int bonus = 100;
        int finalScore = score;

        if (gameOver) {//this is the same as if (gameOver == true) - Do this to make code more readable
            finalScore += (levelComplete * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        //Code Segment 2
        //Step 1: Set the existing score variable to 10,000
        int newScore = 10_000;
        //Step 2: Set the existing levelCompleted variable to 8
        int newlevelComplete = 8;
        //Step 3: Set the existing bonus variable to 200
        int newBonus = 200;
        int newFinalScore = score;

        if (gameOver) {
            newFinalScore += (newlevelComplete * newBonus);
            System.out.println("Your new score is " + newFinalScore);
        }
    }

}
