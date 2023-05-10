
public class Main
{
	public static void main(String[] args)
	{
		Person p1 = new Person("Kirill", "Lobic", 19);
		Person p2 = new Person("Vacia", "Vacia", 14);
		Person p3 = new Person("Kirill", "Lobic", 19);

		System.out.println("Equals p1 with p2\n");
		System.out.println(p1.toString());
		System.out.println(p2.toString());

		System.out.print(p1.equals(p2));
		System.out.println();		

		System.out.println("Equals p1 with p3\n");
		System.out.println(p1.toString());
		System.out.println(p3.toString());
		System.out.print(p1.equals(p3));
		System.out.println();		

		System.out.println("Hash p1");
		System.out.println(p1.hashCode());
	}
}
