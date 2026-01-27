package Assignment2.q1;

public class Rain {
    public static void main(String[] args) {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] res = new int[3];
        res = maxArea(heights);
        System.out.println("The area of the largest container is: " + res[0] + " between indices " + res[1] + " & " + res[2]);
    }

    static int[] maxArea(int[] heights) {
        if (heights == null || heights.length == 0) {
            return null;
        }

        int i = 0;
        int j = heights.length - 1;
        int res = 0;
        int max_i=-1 , max_j = -1;

        while (i < j) {
            int h = Math.min(heights[i], heights[j]);
            res = Math.max(res, (j-i) * h);
            max_i = Math.max(i , max_i);
            max_j = Math.max(j , max_j);
            if (heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }
        return new int[]{res, max_i, max_j};
    }
}