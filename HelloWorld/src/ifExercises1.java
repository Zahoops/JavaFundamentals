public class ifExercises1 {
    public static void main (String [] args){
        System.out.println("Hello, Zahoor");

        boolean isAlien = false;

        if (!isAlien){//I used the NOT operator (!) instead of writing if(isAlien == false) - this is better for readability
            System.out.println("Is not an alien");
            System.out.println("and I'm afraid of aliens");
        }
        //if (isAlien == true){
        //System.out.println("Is an alien");
        //System.
        //System.out.print("and I'm not afraid of aliens"};}
        int topScore = 100;

        if (topScore == 100) {
            System.out.println("You got the highest score");
        }
        if (topScore != 100) {
            System.out.println("You did not get the high score");
        }
        int secondTopScore = 33;
        int differenceScore = (topScore - secondTopScore);
        if (secondTopScore < topScore){
            System.out.println("Your score is -" + secondTopScore + "-. You need -" + differenceScore + "- more points for new Highscore");
        }
    }
}
