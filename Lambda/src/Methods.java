
import java.util.*;

interface Predicate<T>
{
	public boolean test(T t);
}

interface Function<T,R>
{
	public R apply(T t);
}

interface Consumer<T>
{
	public void accept(T t);
}

interface Supplier<R>
{
	public R get();
}

public class Methods {

	public static void main(String args[])
	{
		Predicate<Integer> p = i-> i%2==0;
		System.out.println(p.test(10));
		
		Function<Integer,Integer> f= i->i*i;
		System.out.println(f.apply(10));
		
		Consumer<String> c = s->System.out.println(s);
		c.accept("Lakshmi Jha");
		
		Supplier<Date> s = ()->new Date();
		System.out.println(s.get());
	}
}
