public class OperatorPrecedence2 {
    public static void main (String [] args){

        //This is probably how I would have done the 7 step Operator Precedence challenge.
        //But the requirement of 7 steps as opposed to 6 threw me off haha.
        //Will attempt all challenges going forward using my own intuition.
        double firstVariable = 20.00;
        double secondVariable = 80.00;
        double result = (firstVariable + secondVariable) * 100.00;
        double remainder = (result % 30.00);
        String isNoremainder = (remainder == 0) ? "No remainder" : "Is Remainder";
        System.out.println(isNoremainder);

    }
}
