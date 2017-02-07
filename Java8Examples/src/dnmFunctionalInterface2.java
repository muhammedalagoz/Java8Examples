


public class dnmFunctionalInterface2 {

	public static void main(String[] args) {
//		Consumer2<String> consumer = new Consumer2<String>() {
//
//			@Override
//			public void accept(String t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//			
//		};
		
//		lambda -> 
		Consumer2<String> consumer = (msg) -> {
			System.out.println(msg);
		};
		
		
		consumer.accept("Merhaba Dünya");
		
		BiFunction<Integer, Integer, String> biFunction = (a, b) -> "Sonuç:" + (a + b);
		String result = biFunction.apply(3,5);
		System.out.println(result);
		
		Predicate<Integer> predicate = a -> (a > 0);
		boolean pos = predicate.test(5); // true
		boolean neg = predicate.test(-5);
	}

}


@FunctionalInterface
interface Consumer2<T> {
void accept(T t);
}

@FunctionalInterface
 interface BiFunction<T, U, R> {
R apply(T t, U u); // (t,u) -> r
}

@FunctionalInterface
interface Predicate<T> {
boolean test(T t); // t-> true/false
}
