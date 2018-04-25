public class DiamondExcercises {

    public static void main(String[] args) {

        DiamondExcercises diamondExcercises = new DiamondExcercises();
        System.out.println(diamondExcercises.isoscelesTriangle(3));

    }

    public String isoscelesTriangle(int n) {
        String line = "";

        for (int i = 1; i <= n; i++) {
            for (int k = n; k >= i; k--) {
                line += " ";
            }

            for (int j = 2; j <= i * 2; j++) {
                line += "*";
            }
            line += "\n";
        }
        return line;
    }

}
