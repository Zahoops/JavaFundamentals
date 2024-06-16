public class OperatorPrecedence {
    //First 7 Step Challenge
    public static void main (String [] args) {
        //Step 1: Create a double variable with a value of 20.00
        double firstVariable = 20.00;
        //Step 2: Create a second variable of type double with a value of 80
        double secondVariable = 80.00;
        //Step 3 Add both numbers together, then multiply by 100
        double result = (firstVariable + secondVariable) * 100;
        /*Step 4 use the remainder operator to figure out what the
        remainder from the result of the operation in Step 3, and 40.00, will be.*/
        double remainder = (result % 40.00);
        /*Step 5 Create a boolean variable that assigns the value true
        if the remainder in Step 4 is 0.00, or false if it's not 0. */
        boolean isNoRemainder = (remainder == 0.00);
        /*Step 6 Write and if statement that displays a message: "got some remainder
        if the boolean in Step 5 is not true */
        if (isNoRemainder == false) {
            //Step 7: Output the boolean variable just to see what the result is.
            System.out.println("Got some remainder");
        }

//Second 7 Step Challenge
        //Step 1: Create a double variable with a value of 50.00
        double myMoney = 50.00;
        //Step 2 : Create a second variable of type double with a value of 150.00
        double herMoney = 150.00;
        //Step 3: Add both numbers together then divide by 100
        double resultOf = (myMoney + herMoney) / 100.00;
        /*Step 4: Use the remainder operator to figure out what the remainder from
        the result of the operation in step 3 and 6.00 will be */
        double remainderOf = (resultOf % 6.00);
        /*Step 5: Create a boolean variable that assigns the value true if the
        remainder in Step 4 is less than 1.00, or false if it's 1.00 or more. */
        boolean isRemainder = (remainderOf < 1.00);
        //Step 6 Output the boolean variable just to see what the result is
        System.out.println(isRemainder);
        /*Step 7: write an if then statement that displays "remainder is significant"
        if the boolean in Step 5 is false */
        if (isRemainder == false) {
            System.out.println("Remainder is significant");
        }

    }
}
