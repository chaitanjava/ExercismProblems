import java.util.Scanner;

class Leap {

    boolean isLeapYear(int year) {

     /*   Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year");
        year = sc.nextInt();


      */

        if (year % 4 == 0) {
            if (year % 100 == 0) {


                if (year % 400 == 0)
                    return true;

                else
                    return false;

            } else
                return true;
        }

            else
                return false;



        }

    }

