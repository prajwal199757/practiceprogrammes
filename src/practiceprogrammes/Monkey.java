package practiceprogrammes;
public class Monkey extends Animal {
private String breed;

public Monkey(String breed) {
	super();
	this.breed = breed;
}

public String getBreed() {
	return breed;
}

public void setBreed(String breed) {
	this.breed = breed;
}
 
public void eat()
{
System.out.println("monkey is eating");	
}

public void sleep()
{
System.out.println("monkey is sleeping");	
}
}
