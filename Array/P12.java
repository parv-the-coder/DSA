import java.util.*;

public class P12 {
    public static void trappingrainwater(int height[]) {
        int n = height.length;
        // calculate left max boundary -- array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calculate right max boundary -- array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedwater = 0;
        for (int i = 0; i < n; i++) {
            // waterlevel = min(leftMax boind, RightMaxbound)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            trappedwater += waterlevel - height[i];
        }
        System.out.println("TrappedWater:" + trappedwater);
    }

    public static void main(String[] args) {
        int building[] = { 4, 0, 2, 6, 3, 2, 5 };
        trappingrainwater(building);

    }
}
