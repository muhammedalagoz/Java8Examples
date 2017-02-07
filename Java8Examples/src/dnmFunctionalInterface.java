
public class dnmFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foo foo = (x,y) -> (2*x+y);
		int sonuc = foo.apply(3,4);
		System.out.println("Sonuç: "+sonuc); // Çıktı: 10
		// veya
//		Foo foo1 = (x, y) -> Math.pow(x,y);
//		int sonuc1 = foo1.apply(3,2);
//		System.out.println("Sonuç: "+sonuc1); // Çıktı: 3*3 = 9
	}

}


@FunctionalInterface // Opsiyonel
interface Foo{
int apply(int x, int y);
}