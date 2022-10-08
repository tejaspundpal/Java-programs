public class for_each
{
public static void main(String [] args)
{
    int[] marks = {90,95,100,85,80};
    int no=0;
for (int num : marks) 
{
    //printing all elements 
    System.out.println(num);
    
    // only changes num, not the array element
    num = num*3; 
    no = num; 
    
    
    //printing all elements after multiplying by 3
    //  System.out.println(num);
}
System.out.println("num = "+ no);
}
}