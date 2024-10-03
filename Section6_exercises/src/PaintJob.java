public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double wallArea = width * height;
        int bucketsNeeded = (int) Math.ceil(wallArea / areaPerBucket);
        int bucketsToBuy = bucketsNeeded - extraBuckets;


        return (bucketsToBuy > 0) ? bucketsToBuy : 0;
    }


    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1; // Invalid input
        }
        double wallArea = width * height;

        return (int) Math.ceil(wallArea / areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        return (int) Math.ceil(area / areaPerBucket);
    }
}