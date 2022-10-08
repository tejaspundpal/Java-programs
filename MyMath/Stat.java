package MyMath;
import java.util.*;
import java.lang.*;

public class Stat
{
    public float min(float[] arr)
    {
        //return (float)Collection.min(Arrays.asList(arr));
        float minimum = arr[0];
        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i] < minimum){
                minimum = arr[i];
            }
        }
        return minimum;
    }
    public float max(float[] arr)
    {
        //return (float)Collection.max(Arrays.asList(arr));
        float maximum = arr[0];
        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i] > maximum){
                maximum = arr[i];
            }
        }
        return maximum;
    }
    public float sum(float[] arr)
    {
        float sum = 0;
        for(int i = 0;i < arr.length;i++)
        {
            sum = sum + arr[i];
        }
        return sum;
    }
    public float average(float[] arr)
    {
        float sum = 0;
        for(int i = 0;i < arr.length;i++)
        {
            sum = sum + arr[i];
        }
        float avg = (float)sum/ arr.length;
        return avg;
    }
}