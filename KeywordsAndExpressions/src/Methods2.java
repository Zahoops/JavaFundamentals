public class Methods2 {
    public static void main (String [] args) {
        //This is called from line 8. The values are decided here so that I can decide what they are each time I call the method. Thereby allowing lots of flexibility
        drinkCount(5, 5.00, 10.00);//The values have to be in the order that they were declared (luckily Intellij names it for me)
    }

    //All data types of variables and names are declared here, and the values are declared in the call on line 3
    public static void drinkCount (int drinkNumber, double drinkAmount, double drinkCups){
        double totalDrink = (drinkNumber + drinkAmount + drinkCups);
        System.out.println("This much water was consumed " + totalDrink);
    }
}
