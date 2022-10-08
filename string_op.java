public class string_op
{
    public static void main(String[] args)
    {
        String s = " Hello";
        String s1 = new String(" Tejas");
        System.out.println(s);
        System.out.println(s1);
        
        System.out.println(s + s1);
        
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        
        System.out.println(s1.substring(0,4));
        
        System.out.println(s1.replace("s","aaaa"));
        
        System.out.println(s.concat(s1));
        
        System.out.println(s1.indexOf("j"));
    }
}