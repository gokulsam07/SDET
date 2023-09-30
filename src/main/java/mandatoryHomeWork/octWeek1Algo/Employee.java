package mandatoryHomeWork.octWeek1Algo;

public class Employee {

	int id;
	int age;
	String country;


	public Employee(int id,int age,String country) {
		this.id=id;
		this.age=age;
		this.country=country;
	}
	
	@Override
	public String toString() {
		return "{" + "id = " + id + ", age = "+ age + ", country = "+ country + "}";
	}
}
