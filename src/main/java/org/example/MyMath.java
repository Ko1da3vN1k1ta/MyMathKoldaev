package org.example;

public class MyMath {
    private static final double PI = 3.141592653589793;
    private static final double E = 2.71828182845;
public static double toRadians(double degrees){

    return degrees * (PI/180);
}
public static double sin(double degrees){

    double radians = toRadians(degrees);
    double sin = 0;
    double progress = radians;
    for(int i = 1; i <= 10; i++){
        sin += progress;
        progress *= -(radians * radians)/((2 + i)*(2 * i + 1));
    }
    return sin;
}
    public static double sqrt(double number) {

        double t;
        double squareRoot = number / 2;
        do {
            t = squareRoot;
            squareRoot = (t + (number / t)) / 2;
        } while ((t - squareRoot) != 0);
        return squareRoot;
    }
    public static double cos(double degrees){

    double sin = sin(degrees);
    return sqrt(1 - sin * sin);
    }
public static double tg(double degrees){

    return sin(degrees)/cos(degrees);
}
public static double areaCircle(double radius){

    return PI * (radius * radius);
}
public static double lengthCircle(double radius){

return 2 * PI * radius;
}
public static int random(long seed) {
        int bits = 32;
        seed = (seed * 0x5DEECE66DL + 0xBL) & ((1L << 48) - 1);
        return (int) (seed >>> (48 - bits));
    }
}
