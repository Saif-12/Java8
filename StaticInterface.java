package Java8;

public interface StaticInterface {
	
	static void print()
	{
		System.out.println("Static inside functional interface!!");
	}
	public static void main(String[] args) {
		
		StaticInterface.print();
	}

}
