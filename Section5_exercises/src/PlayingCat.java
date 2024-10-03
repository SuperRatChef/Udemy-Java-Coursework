public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer){
            return 25 <= temperature && temperature <= 45;
        }else{
            return 25 <= temperature && temperature <= 35;
        }
    }
}
