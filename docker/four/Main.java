public class Main
{
public static void main(String[] args)
{
	Person p1 = new Person("Kirill", 19), p2 = new Person("Il", 12);
	System.out.println("Compare p1 and p2");
	System.out.println(p1.compareTo(p2));
}
}
