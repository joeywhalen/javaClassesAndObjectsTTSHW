package javaClassesAndObjectsTTSHW;

public class Pet {

		// TODO create a Pet Class with 4 instance variables, 2 constructors, 3 Getters and 3 Setters
		private String name;
		private Integer age;
		private String location;
		private String type;
		
		public Pet(String name, int age, String type){
			this.name = name;
			this.age = age;
			this.type = type;
		}
		
		public Pet(String name, int age, String location) {
			this.name = name;
			this.age = age;
			this.location = location;
		}
		
		public String getName()
		{
			return name;
		}
		
		public void setName(String name)
		{
			this.name= name;
		}
		
		public int getAge()
		{
			return age;
		}
		
		public void setAge(int age)
		{
			this.age = age;
		}
		
		public String getType()
		{
			return type;
		}
		
		public void setLocation(String location)
		{
			this.location = location;
		}
	}
