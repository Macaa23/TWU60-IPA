public class TriangleExercises {

    public static void main (String[] args){

        TriangleExercises triangleExercises = new TriangleExercises();

        System.out.println("Easiest Exercise Ever:");
        System.out.println(triangleExercises.easiestExerciseEver()+"\n");

        System.out.println("Draw A Horizontal Line:");
        System.out.println(triangleExercises.drawAHorizontalLine(3));

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

}
