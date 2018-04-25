public class PrimeFactorsExercise {

    public static void main(String[] args) {

        PrimeFactorsExercise primeFactors = new PrimeFactorsExercise();

        primeFactors.primeFactorsExcercises(30);

    }

    public void primeFactorsExcercises(int n) {
        String line = "";
        double temp = n;

        while (temp > 1) {
            if (temp % 2 == 0) {
                line += 2 + ", ";
                temp = temp / 2;
            } else if (temp % 3 == 0) {
                line += 3 + ", ";
                temp = temp / 3;
            } else if (temp % 5 == 0) {
                line += 5 + ", ";
                temp = temp / 5;
            } else if (temp % 7 == 0) {
                line += 7 + ", ";
                temp = temp / 7;
            } else if (temp % 11 == 0) {
                line += 11 + ", ";
                temp = temp / 11;
            } else if (temp % 13 == 0) {
                line += 13 + ", ";
                temp = temp / 13;
            } else if (temp % 17 == 0) {
                line += 17 + ", ";
                temp = temp / 17;
            } else {
                break;
            }
        }
        System.out.println("Your input: " + n);
        System.out.println("Prime Factors: " +line);
    }
}
