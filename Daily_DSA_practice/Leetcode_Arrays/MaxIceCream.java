import java.util.Arrays;

public class MaxIceCream {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;

        for (int i = 0; i < costs.length; i++) {
            if (costs[i] <= coins) {
                coins -= costs[i];
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        MaxIceCream m = new MaxIceCream();
        System.out.println(m.maxIceCream(new int[]{1, 3, 2, 4, 1}, 7));
    }

}