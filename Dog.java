
public class Dog extends Animal{
	String name;
	int numLegs;
	Dog(String dogName, int legs){
		numLegs = legs;
		name = dogName;
	}
	public int getLegs() {
		return numLegs;
	}
	public String toString(){
		return name;
	}
}
