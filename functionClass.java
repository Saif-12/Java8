package Java8.function;

import java.util.Scanner;
import java.util.function.Function;

public class functionClass {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		Function<Integer, Integer> fn= i->i*i;
		System.out.println("Square of the number is "+ fn.apply(n));
		
		Function<Integer, Integer> cube= i->i*i*i;
		System.out.println("cube of the number is "+ cube.apply(n));
		
		// functional chaining by using andThen
		
		Integer apply = fn.andThen(cube).apply(n);
		System.out.println(apply);
		
		//// functional chaining by using compose
		
		Integer apply2 = fn.compose(cube).apply(n);
		System.out.println(apply2);
		
	}

}
