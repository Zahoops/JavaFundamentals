public class ifExercises3 {
    public static void main (String [] args) {
//Code Block 1
        System.out.println("Hello Again");
//Code Block 2
        int highScore = 89; //The set high score
        int yourScore = 101; //Score value of player
        int diffScore = (highScore - yourScore);//The difference calculated at through the expressions

        if (yourScore >= highScore) { //if your score is greater than or equal to highScore, then return the message
            System.out.println("You have the new HighScore!");
        }

        if (yourScore < highScore) { //if your score is less than highScore, then return the message
            System.out.println("You have " + yourScore + " points. You need " + diffScore + " more points to get the highscore");//The difference calculated
        }
        if ((highScore > 90 ) || (yourScore <= 90  )) {
            System.out.println("Either both of the conditions are true");
        }

    }
}
