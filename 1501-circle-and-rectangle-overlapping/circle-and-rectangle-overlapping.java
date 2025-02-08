class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int a = Math.max(x1,(Math.min(xCenter , x2)));
        int b = Math.max(y1,(Math.min(yCenter , y2)));
        int w = xCenter - a;
        int y = yCenter - b;
        System.out.print(w+" "+y);
        return ((w*w + y*y) <= radius*radius);
    }
}