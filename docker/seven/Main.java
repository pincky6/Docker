interface Processor {
    void process(Object object);
}

class ConsoleProcessor implements Processor {
    @Override
    public void process(Object object) {
        System.out.println(object);
    }
}

public class Main
{
	public static void main(String[] args)
	{
		ObjectCollection coll = new ObjectCollection();
		coll.add("String");
		coll.add(1);
		coll.add('a');
		coll.process(new ConsoleProcessor());
		coll.remove('a');
		coll.process(new ConsoleProcessor());
	}
}
