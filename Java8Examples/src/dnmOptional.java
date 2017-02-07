import java.time.LocalDate;
import java.util.Optional;


public class dnmOptional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ornek a = new ornek();
		Optional<ornek> ornek1 = Optional.of(a);
		ornek1.ifPresent( x -> System.out.println( x.getName() + " is ok!" ) );
		
		ornek a2 = new ornek();
		a2.setName("sdasdas");
		Optional<ornek> ornek2 = Optional.of(a2);
		ornek2.ifPresent( x -> System.out.println( x.getName() + " is ok!" ) );
		
		LocalDate d = Optional.of(LocalDate.now()).get();
	}

}

class ornek{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}