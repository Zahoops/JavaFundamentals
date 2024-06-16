public class TernaryOperandExercises {
    public static void main (String [] args){

        //Challenge 1: Voting Eligibility
        int yourAge = 20;
        String votingAge = (yourAge >= 18) ? " So you can vote!" : " So you cannot vote";
        System.out.println("You are " + yourAge + votingAge);

        //Challenge 2: Grade Pass or Fail
        int myGrade = 30;
        String passedGrade = (myGrade >= 40) ? " You have passed" : " You have not passed";
        System.out.println("Your grade is " + myGrade + ", therefore" + passedGrade);

        //Challenge 3: Discount Eligibility
        int customerTime = 20;
        int diffTime = (30 - customerTime);
        String discountEligible = (customerTime >= 30) ? "You get a discount." : "No discount for you.";
        System.out.println("You have been a member for " + customerTime + " days, therefore " + discountEligible + " You have " + diffTime + " more day(s) until you get it");

    }
}
