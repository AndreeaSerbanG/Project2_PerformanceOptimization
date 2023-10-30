public class Algorithms {
    // calcularea sumei divizorilor pt numerele perfecte
    public static int sumDiv(int n) {
        int sum = 0;
        for (int d = 2; d <= n/2; d++) {
            if (n % d == 0) {
                sum += d;
            }
        }
        return sum + 1;
    }

    //calcularea sumei cifrelor pt numerele magice
    public static int sumDigit(int n) {
        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static int reduceNumber(int n) {
        int result = n;

        while (result > 9) {
            result = sumDigit(result);
        }

        return result;
    }
}
