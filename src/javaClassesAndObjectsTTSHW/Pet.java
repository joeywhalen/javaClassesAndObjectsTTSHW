package javaClassesAndObjectsTTSHW;

public class Pet {

	public static void main(String[] args) {
		// TODO create a Pet Class with 4 instance variables, 2 constructors, 3 Getters and 3 Setters
		private String petName;
		private Integer age;
		private String location;
		private String type;
		
		public Pet() {}
		
		public Pet(String petName, int age, String location, String type) {
			this.petName = petName;
			this.age = age;
			this.location = location;
			this.type = type;
		}
		
		
	}

}
