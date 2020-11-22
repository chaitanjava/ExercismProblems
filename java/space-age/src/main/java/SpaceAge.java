import java.math.BigDecimal;

class SpaceAge {



    double onEarth(double seconds) {
        double onEerthAge = seconds/31557600;
          return onEerthAge;
    }

    double onMercury(double seconds) {
        double onMercury = seconds/131027745;
        return onMercury;
    }

    double onVenus(double seconds) {
    double onVenus = seconds/51296717;
    return onVenus;
    }

    double onMars(double seconds) {
        double onMars = seconds/16778676;
        return onMars;
    }

    double onJupiter(double seconds) {
        double onJupiter = seconds/2660256;
        return onJupiter;
    }

    double onSaturn(double seconds) {
        double onSaturn = seconds/1071656;
        return onSaturn;
    }


    double onUranus(double seconds) {
        double onUranus = seconds/375610;
        return onUranus;
    }

    double onNeptune(double seconds) {
        double onNeptune = seconds/191500;
        return onNeptune;
    }

}
