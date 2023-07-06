public class ContainerWithMostWater11 {
    private static int maxArea(int[] height) {
        int size = height.length;
        int max = 0, area, i = 0, j = size - 1;
        while (j > i) {
            area = height[i] < height[j] ? height[i] : height[j];
            area = (j - i) * area;
            if (max < area) {
                max = area;
            }
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
