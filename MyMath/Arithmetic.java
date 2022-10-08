package MyMath;
import java.util.*;
import java.lang.*;

public class Arithmetic
{
    float a,b;
    public Arithmetic()
    {
        a = 0;
        b = 0;
    }
    public void setData(float a,float b)
    {
        this.a = a;
        this.b = b;
    }
    public float addition()
    {
        return a+b;
    }
    public float subtraction()
    {
        return a-b;
    }
    public float multiplication()
    {
        return a*b;
    }
    public float division()
    {
        return a/b;
    }
}