public class Test
{
	static int x = 11;
	private int y = 33;
    private int z = 25;
    public void method1(int x)
	{
		Test t = new Test();
		this.x = 22;
        this.y = 55;
		y = 44;

		System.out.println("Test.x: " + Test.x);
		System.out.println("t.x: " + t.x);
      //  System.out.println("Test.y: " + Test.y);
		System.out.println("t.y: " + t.y);
		System.out.println("y: " + y);
        System.out.println("x: " + x);
        	System.out.println("t.z: " + t.z);
	}

	public static void main(String args[])
	{
		Test t = new Test();
		t.method1(5);
	}
}