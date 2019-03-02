import java.util.Comparator;
public class Animal implements Comparator<Dog> {
	public int compare(Dog a,Dog b) {
		return a.getLegs() - b.getLegs();
	}
	public int getLegs() {
		return 0;
	}

}
