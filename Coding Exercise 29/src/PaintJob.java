public class PaintJob {

  public static void main(String[] args) {

    int return_value1 = getBucketCount(2.75, 3.25, 2.5, 1);
    if (return_value1 == -1) {
      System.out.println("Invalid Value!");
    } else {
      System.out.println("Number of Buckets = " + return_value1);
    }

    int return_value2 = getBucketCount(7.25, 4.3, 2.35);
    if (return_value2 == -1) {
      System.out.println("Invalid Value!");
    } else {
      System.out.println("Number of Buckets = " + return_value2);
    }

    int return_value3 = getBucketCount(3.26, 0.75);
    if (return_value3 == -1) {
      System.out.println("Invalid Value!");
    } else {
      System.out.println("Number of Buckets = " + return_value3);
    }
  }

  public static int getBucketCount(
      double width, double height, double areaPerBucket, int extraBuckets) {

    if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)) {
      return -1;
    } else {
      return ((int) Math.ceil(width * height / areaPerBucket - extraBuckets));
    }
  }

  public static int getBucketCount(double width, double height, double areaPerBucket) {

    if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)) {
      return -1;
    } else {
      return ((int) Math.ceil(width * height / areaPerBucket));
    }
  }

  public static int getBucketCount(double area, double areaPerBucket) {

    if ((area <= 0) || (areaPerBucket <= 0)) {
      return -1;
    } else {
      return ((int) Math.ceil(area / areaPerBucket));
    }
  }
}
