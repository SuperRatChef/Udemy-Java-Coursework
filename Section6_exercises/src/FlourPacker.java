public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int maxBigBagsUsed = Math.min(goal / 5, bigCount);

        int remainingKilos = goal - (maxBigBagsUsed * 5);

        return remainingKilos <= smallCount;
    }
}
