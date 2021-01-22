import model.Cat;
import model.Cow;
import model.Dog;
import model.Pig;
import model.Duck;
import model.Mongoose;

public class AnimalNoise {

	// add your animal class to the model package
	// only push this file and the animal class you created

	public static void main(String[] args) {

		Cat fluffy = new Cat();
		System.out.println(fluffy.speak());
		
		Dog doggy = new Dog();
		System.out.println(doggy.speak());
		
		Pig wilbur = new Pig();
		System.out.println(wilbur.speak());

		Cow moomoo = new Cow();
		System.out.println(moomoo.speak());
		
		Duck ducky = new Duck();
		System.out.println(ducky.speak());
		
		Mongoose rikkitikkitavi = new Mongoose();
		System.out.println(rikkitikkitavi.speak());
	}
}

