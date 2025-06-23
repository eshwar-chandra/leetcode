class Solution {
    public int trap(int[] height) {

        int N = height.length;
        int[] leftMax = new int[N];
        int[] rightMax = new int[N];

        int currMaxLeft = 0;
        int currMaxRight = 0;
        for(int i=0; i < N; i++) {
            currMaxLeft = currMaxLeft > height[i] ? currMaxLeft : height[i];
            currMaxRight = currMaxRight > height[N-1-i] ? currMaxRight : height[N-1-i];
            leftMax[i] = currMaxLeft - height[i];
            rightMax[N-1-i] = currMaxRight - height[N-1-i];
        }

        int totalWater = 0;

        for (int i =0; i < N; i++) {
            totalWater += Math.min(leftMax[i], rightMax[i]);
        }
        return totalWater;
    }
}

// [0,1,0,2,1,0,1,3,2,1,2,1]
// [0,2,3,1,2,3,2,0,0,1,0,0]
// [0,0,1,0,1,2,1,0,1,2,1,2]
// [0,0,1,0,1,2,1,0,0,1,0,0]