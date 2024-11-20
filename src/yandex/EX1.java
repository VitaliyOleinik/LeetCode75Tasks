package yandex;

public class EX1 {
    public static void main(String[] args) {
        int data[] = new int[]{55, 6, 4, 7};
        boolean up = true;
        boolean down = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] < data[i + 1] ) {
                up = false;
            }
            if (data[i] > data[i + 1]) {
                down = false;
            }
        }
        System.out.println(down || up);
    }
}
