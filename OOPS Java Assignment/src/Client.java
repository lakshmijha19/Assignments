
abstract class Persistence
{
	abstract void persist();
}

class FilePersistence extends Persistence
{
	public void persist()
	{
		System.out.println("Persistent : File");
	}
}

class DataPersistence extends Persistence
{
	public void persist()
	{
		System.out.println("Persistent : Data");
	}
}

public class Client {

	public static void main(String[] args) {
		
		Persistence p1 = new FilePersistence();
		p1.persist();
		
		Persistence p2 = new DataPersistence();
		p2.persist();
	}

}
