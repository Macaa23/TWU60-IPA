public class TriangleExercises {

    public static void main (String[] args){

        TriangleExercises triangleExercises = new TriangleExercises();

        System.out.println("Easiest Exercise Ever:");
        System.out.println(triangleExercises.easiestExerciseEver()+"\n");

        System.out.println("Draw A Horizontal Line:");
        System.out.println(triangleExercises.drawAHorizontalLine(3)+"\n");

        System.out.println("Draw A Vertical Line:");
        System.out.println(triangleExercises.drawAVerticalLine(3)+"\n");

        System.out.println("Draw A Right Triangle:");
        System.out.println(triangleExercises.drawARightTriangle(3)+"\n");

    }

    public String easiestExerciseEver(){
        return "*";
    }

    public String drawAHorizontalLine(int n){
        String line = "";
        for (int i = 0; i < n ; i++){
            line +="*";
        }

        return line;
    }

    public String drawAVerticalLine(int n){
        String line = "";
        for (int i = 0; i < n ; i++){
            line +="*\n";
        }

        return line;
    }

    public String drawARightTriangle(int n){
        String line = "";
        for (int i = 0; i <= n ; i++){
            for (int j = 0; j < i; j++){
                line+= "*";
            }

            line+= "\n";
        }

        return line;
    }

}
