import java.util.Arrays;

public class Main {

public static void main(String [] args)
{
    System.out.println("Input: " + Arrays.toString(args));
    System.out.println(answer(args[0], args[1]));
}

public static String answer(String M, String F) {

    try {
        long numM = Long.parseLong(M);
        long numF = Long.parseLong(F);

        String output = "impossible";
        long count = 0;
        while (numM > 1 || numF > 1) {

            if (!checkIsValid(numM, numF)) {
                numM = numF = 0;
            }
            else if (numM > numF) {
                numM -= numF;
                count++;
            }
            else if (numF > numM) {
                numF -= numM;
                count++;
            }

            //System.out.println("cycle: " + count + " " + numM + " " + numF);
        }

        if (numM == 1 && numF == 1) {
            output = ""+count;
        }

        return output;
    }
    catch (NumberFormatException nfe) {
        return "impossible";
    }
}

protected static boolean checkIsValid(long numM, long numF) {
    boolean valid = true;
    if (numM % 2 == 0 && numF % 2 == 0) {
        valid = false;
    }
    else if (numM == numF) {
        valid = false;
    }
    else if (numM <= 0 || numF <= 0) {
        valid = false;
    }
    else if (numM > 1 && numF % numM == 0) {
        valid = false;
    }
    else if (numF > 1 && numM % numF == 0) {
        valid = false;
    }

    return valid;
}
}