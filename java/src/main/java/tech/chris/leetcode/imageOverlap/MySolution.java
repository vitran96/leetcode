package tech.chris.leetcode.imageOverlap;

public class MySolution implements ImageOverlap {
    private int[][] newImg (int[][] img) {
        int newSize = img.length * 3 - 2;
        int[][] newImg = new int[newSize][newSize];
        int startIndex = img.length - 1;
        int traversalLength = img.length * 2 - 1;
        for (int i = startIndex; i < traversalLength; i++) {
            int[] row = newImg[i];
            System.arraycopy(img[i - startIndex], 0, row, startIndex, img.length);
        }
        return newImg;
    }

    private int count (int[][] img1, int[][] img2, int x, int y) {
        int count = 0;
        for (int i = 0; i < img2.length; i++) {
            int[] img2Row = img2[i];
            int[] img1Row = img1[y + i];
            for (int j = 0; j < img2.length; j++) {
                if (img2Row[j] == 1 && img2Row[j] == img1Row[x + j]) {
                    count++;
                }
            }
        }

        return count;
    }

    @Override
    public int largestOverlap (int[][] img1, int[][] img2) {
        img1 = newImg(img1);
        int result = 0;
        int traversalLength = img2.length * 2 - 1;
        for (int y = 0; y < traversalLength; y++) {
            for (int x = 0; x < traversalLength; x++) {
                int count = count(img1, img2, x, y);
                if (count > result) {
                    result = count;
                }
            }
        }
        return result;
    }
}
