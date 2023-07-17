public class FindTheHighestAltitude1732 {
    private static int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int highestPoint = currentAltitude;
        for (int altitudeGain : gain) {
            currentAltitude += altitudeGain;
            highestPoint = Math.max(highestPoint, currentAltitude);
        }
        return highestPoint;
    }

    public static void main(String[] args) {
        int[] gain = new int[] {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
}
