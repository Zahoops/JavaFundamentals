public class TernaryOperands {
    public static void main (String [] args) {

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        if (!isDomestic) {
            System.out.println("Not domestic to our country");
        }
        /* This is a weird one because in australia (Tim's country), the VW is not popular, therefore
        he assigned a (false) to be true by placing after the ternary operand, then the (true) after the
        (false) to assign it as false. If it was in the context of europe, (true) and (false)
        would be switched. */

        System.out.println(); //Just to add some space in the compiler
//comment 1
        int ageOfClient = 28;
        String ageText = ageOfClient >= 29 ? "quite old" : " still young";
        System.out.println("Our client is " + ageText);

    }
}
