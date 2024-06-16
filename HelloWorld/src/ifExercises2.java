public class ifExercises2 {
    public static void main (String [] args) {

        int highScore = 137;
        int yourScore = 139;//change this value to change the output
        int diffscore = (highScore - yourScore);
        int moreScore = (highScore + yourScore);

        if (yourScore > highScore) {
            moreScore = (yourScore - highScore);
        }

        if ((yourScore > highScore) || (yourScore == highScore)){//could have used >=, but wanted to test OR operator
            System.out.println("You have the highest score by " + moreScore + " point(s)");
        }
        if ((yourScore < highScore) && (yourScore <= 50)) {
            System.out.println("You are nowhere near the high score");
        }

        if ((yourScore < highScore) && (yourScore >= 51 )) {
            System.out.println("You need " + diffscore + " more points for highscore");
        }

        /* Testing the NOT operator (!)
        boolean isCar = true;

        if (!isCar) {
            System.out.println("is car fale");
        }

        if (isCar) {
            System.out.println("Is true");
        }*/
    }
}
/*This was a good practice session to change the output based on the yourScore variabe
//However, I was never able to figure out how to distinguish between point and
// points based on the value given by moreScore.
//If it was a single value, it doesnt make sense to make it say "points".
Maybe future me can figure this out?
*/
