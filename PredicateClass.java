package Java8.Predicate;

import java.util.function.Predicate;

public class PredicateClass {
	
	public static void main(String[] args) {
		Predicate<String> pr=s->s.length()<4;
		
		//System.out.println("Check length of string "+ pr.test("Samar"));
		
       Predicate<String> checkLengthEvenOrOdd=s->s.length()%2==0;
		
		//System.out.println("Check length is even or odd "+ checkLengthEvenOrOdd.test("Samar"));
		
		//after merging with and
		
		boolean test = pr.and(checkLengthEvenOrOdd).test("Saif");
		System.out.println(test);
		//after merging with or
		boolean test2 = pr.or(checkLengthEvenOrOdd).test("Saifa");
		System.out.println(test2);
		boolean test3 = pr.negate().test("Saif");
		System.out.println(test3);
	}

}
 