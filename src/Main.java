import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello sts");
		Predicate<Integer> p=i-> i%2==0;
		System.out.println(p.test(5));

	}

}
