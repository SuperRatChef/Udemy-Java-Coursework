public class BarkingDog {
    public static void main(String[] args) {
        System.out.println("Shoudl wake up: "+ shouldWakeUp(true, 23));
    }
    public static boolean shouldWakeUp(boolean isDogCurrentlyBarking, int hourOfDay){
        if(hourOfDay < 0 || 23 < hourOfDay){
            return false;
        }else{
            if((hourOfDay < 8 || 22 < hourOfDay) && isDogCurrentlyBarking){
                return true;
            }else{
                return false;
            }
        }
    }
}
