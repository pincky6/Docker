public class Main{
	public static void main(String[] args)
	{
		Person p1 = new Person("Kirill", "Loban", 19);
		System.out.println(p1.toString());
		System.out.println("Clone");
		Person p2 = p1.clone();
		System.out.println(p2.toString());
	}
}
