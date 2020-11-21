import org.apache.commons.lang3.StringUtils;

public class Hamming {
    public int hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new UnsupportedOperationException("leftStrand and rightStrand must be of equal length.");
        }
        else if (leftStrand.equals(rightStrand)) {
            return 0;
        }
        else if(leftStrand.equals("")) {
            throw new UnsupportedOperationException("left strand must not be empty.");
        }
        else if(rightStrand.equals("")) {
            throw new UnsupportedOperationException("right strand must not be empty.");
        }
     else {
            String difference = StringUtils.difference(leftStrand, rightStrand);
            int hammingDistance = difference.length();
            return hammingDistance;

        }


    }



}
