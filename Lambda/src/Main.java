
class Main {

	public static void main(String[] args)
	{
		Thread t=new Thread();
		t.start();
		
		for(int i=0;i<=3;i++)
		{
		Consumer<Integer> c = s->System.out.println(s);
		c.accept(1);
		c.accept(2);
		c.accept(3);
		c.accept(4);
		c.accept(5);
		}
	}
}
