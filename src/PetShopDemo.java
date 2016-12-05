import java.sql.PseudoColumnUsage;

public class PetShopDemo {

	public static void main(String[] args) {
		PetShop petShop = new PetShop(5);
		petShop.add(new Cat("白猫", "白色的", 2));
		petShop.add(new Cat("黑猫", "黑色的", 2));
		petShop.add(new Cat("花猫", "花色的", 2));
		petShop.add(new Dog("拉布拉多", "白色的", 2));
		petShop.add(new Dog("金毛", "金色的", 2));
		petShop.add(new Dog("秋田", "黄色的", 2));
		print(petShop.search("黑"));				
	}
	
	public static void print(Pet p[]) {
		for (int i = 0; i < p.length; i++) {
			if (p[i] !=null) {
				System.out.println(p[i].getName()+","+p[i].getColor()+","+p[i].getAge());
			}
		}
	}

}
