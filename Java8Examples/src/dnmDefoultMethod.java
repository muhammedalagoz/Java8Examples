
public class dnmDefoultMethod implements InterfaceA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dnmDefoultMethod method = new dnmDefoultMethod();
		method.sayHi();
	}

	@Override
	public void saySomething() {
		// TODO Auto-generated method stub
	}
	
}
interface InterfaceA {
	 
    public void saySomething();
 
    default public void sayHi() {
      System.out.println("Hi");
    }
    static boolean isNull(String str) {
		System.out.println("Interface Null Check");

		return str == null ? true : "".equals(str) ? true : false;
	}
}