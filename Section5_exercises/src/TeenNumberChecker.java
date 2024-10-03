public class TeenNumberChecker {
    public static boolean hasTeen(int age1, int age2, int age3){
        if((13 <= age1 && age1 <= 19) || (13 <= age2 && age2 <= 19) || (13 <= age3 && age3 <= 19)){
            return true;
        }
        return false;
    }
    public static boolean isTeen(int age){
        return (13 <= age && age <= 19);
    }
}
