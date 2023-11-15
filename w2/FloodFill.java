package w2;

class FloodFill {
    private void helper(int[][] image, int sr, int sc, int newColor, int originalColor) {
        int rows = image.length;
        int cols = image[0].length;

        if (sr < 0 || sr >= rows || sc < 0 || sc >= cols || image[sr][sc] == newColor
                || image[sr][sc] != originalColor) {
            return;
        }

        image[sr][sc] = newColor;

        if (sr > 0 && image[sr - 1][sc] == originalColor && image[sr - 1][sc] != newColor) {
            floodFill(image, sr - 1, sc, newColor);
        }
        if (sr < rows - 1 && image[sr + 1][sc] == originalColor && image[sr + 1][sc] != newColor) {
            floodFill(image, sr + 1, sc, newColor);
        }
        if (sc > 0 && image[sr][sc - 1] == originalColor && image[sr][sc - 1] != newColor) {
            floodFill(image, sr, sc - 1, newColor);
        }
        if (sc < cols - 1 && image[sr][sc + 1] == originalColor && image[sr][sc + 1] != newColor) {
            floodFill(image, sr, sc + 1, newColor);
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        helper(image, sr, sc, color, image[sr][sc]);
        return image;
    }
}
