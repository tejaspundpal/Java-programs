package MyMath;
import java.util.*;
import java.lang.*;
//import java.util.Arrays;
//import java.util.Collections;

public class Trig
{
    double angle;
    double radian;
    public Trig(){
        this.angle = 0;
    }

    public void setAngle(double angle)
    {
        radian = Math.toRadians(angle);
    }
    public double sine()
    {
        return Math.sin(radian);
    }
    public double cosine()
    {
        return Math.cos(radian);
    }
    public double tangent()
    {
        return Math.tan(radian);
    }
    public double cotangent()
    {
        return 1/Math.tan(radian);
    }
    public double secant()
    {
        return 1/Math.sin(radian);
    }
    public double cosecant()
    {
        return 1/Math.cos(radian);
    }
}