package org.APCSLowell;

public class APLine {
    int A, B, C;
    public APLine(int a, int b, int c) {
        A = a;
        B = b;
        C = c;
    }
    public boolean isOnLine(int x, int y) {
        return A * x + B * y + C == 0;
    }
    public double getSlope() {
        return -(double)A / (double)B;
    }
}
