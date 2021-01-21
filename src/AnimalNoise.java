import model.Cat;
import model.Dog;

public class AnimalNoise {

	// add your animal class to the model package
	// only push this file and the animal class you created

	public static void main(String[] args) {

		Cat fluffy = new Cat();
		System.out.println(fluffy.speak());
		
		Dog doggy = new Dog();
		System.out.println(doggy.speak());

		Cow moomoo = new Cow();
		System.out.println(moomoo.speak());
	}
}
