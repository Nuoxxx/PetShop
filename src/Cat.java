
class Cat implements Pet{
	
	private String name;
	private String color;
	private int age;
	
	public Cat(String name,String color,int age){
		this.setName(name);
		this.setColor(color);
		this.setAge(age);
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return this.color;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return this.age;
	}

}
