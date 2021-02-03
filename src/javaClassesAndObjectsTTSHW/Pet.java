package javaClassesAndObjectsTTSHW;

public class Pet {

		// TODO create a Pet Class with 4 instance variables, 2 constructors, 3 Getters and 3 Setters
		private String name;
		private Integer age;
		private String location;
		private String type;
		
		// 2 constructors
		public Pet() {}
		
		public Pet(String name, int age, String location, String type) {
			this.name = name;
			this.age = age;
			this.location = location;
		}
		
		// 3 Getters and 3 Setters
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
