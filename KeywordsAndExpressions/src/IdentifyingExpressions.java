public class IdentifyingExpressions {
    //Identifying Expressions

    //Mark every Expression above with  |______________|
    public static void main (String [] args) {
        double kilometers = (100 * 1.609344);//This entire line is considered a statment
        //|____________________________|
        //              |______________|

        int highScore = 50;
        //  |____________| Semi Colons do not count as expressions
        if ((highScore > 25) && (highScore > 100)) {
            //|______________|     |_______________| Only inner brackets count as expressions as the
            //|____________________________________|
            highScore = 1000 + highScore;
            // |___________________________|
            //              |______________|
        }
    }
}
