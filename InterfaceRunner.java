package Java8;

public class InterfaceRunner implements Interface1,Interface2 {

	public static void main(String[] args) {
		
		InterfaceRunner in=new InterfaceRunner();
		in.print();

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		Interface2.super.print();
	}

}
