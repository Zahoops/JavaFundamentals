public class Methods {
    public static void main (String [] args) {
        //This is the result of the method starting at line 7. We are calling the method
        calculateDistance(); //This contains everything in the method calculateDistance
        //This prevents the need to duplicate code

        }
//I have created a new method outside the psvm method
    public static void calculateDistance () {//"calculateDistance" is highlighted, meaning it is being called.
        //These are the variables that calculateDistance will hold
        double myDistance = 10.00;
        double hisDistance = 30.00;
        double maxDistance = (myDistance + hisDistance) * 10.00;
        //This block of code consists of the calculation
        if (hisDistance > myDistance) {
            System.out.println("He ran further than me");
        } else if (hisDistance < myDistance) {
            System.out.println("I ran further than him");
        }
    }//The block of code from line 7 to 18 will be contained in line 4
    //Executing it without the call statement will not allow it to run
}
