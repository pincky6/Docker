public class Main
{
	public static void main(String[] args)
	{
		Box<String> box = new Box<String>();
		box.put("String");
		System.out.println(box.get());
		String[] strArr = {"arrr", "bbb", "ccc"};
		box.print(strArr);
	}
}
