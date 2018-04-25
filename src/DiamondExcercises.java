public class DiamondExcercises {

    public static void main(String[] args) {

        DiamondExcercises diamondExcercises = new DiamondExcercises();

        System.out.println("Isosceles Triangle:");
        System.out.println(diamondExcercises.isoscelesTriangle(3)+"\n");

        System.out.println("Diamond:");
        System.out.println(diamondExcercises.diamond(3)+"\n");

        System.out.println("Diamond With Name:");
        System.out.println(diamondExcercises.diamondWithName(3)+"\n");

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

    public String diamond(int n) {
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

        for (int i = n - 1; i >= 1; i--) {
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

    public String diamondWithName(int n) {
        String line = "";

        for (int i = 1; i <= n; i++) {

            for (int k = n; k >= i; k--) {
                line += " ";
            }

            if(i == n ){
                line+= "Rocío\n";
                continue;
            }

            for (int j = 2; j <= i * 2; j++) {
                line += "*";
            }
            line += "\n";
        }

        for (int i = n - 1; i >= 1; i--) {
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
