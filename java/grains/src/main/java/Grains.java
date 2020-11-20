import java.math.BigInteger;

class Grains {


    int grainsOnSquare(final int square) {

        if(square == 1) {
            return 1;
        }
        else if(square == 2) {
            return 2;
        }
        return square * 2;
    }

    BigInteger grainsOnBoard() {

     /*   double a = 2.0;
        double b = 63.0;

        double  total = 1 * Math.pow(a, b);
*/
     BigInteger total = BigInteger.valueOf(2).pow(64);
     BigInteger total1 = new BigInteger("1");
     BigInteger total2 = total.subtract(total1);
        return total2;
    }

}
