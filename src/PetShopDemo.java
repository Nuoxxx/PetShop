import java.sql.PseudoColumnUsage;

public class PetShopDemo {

	public static void main(String[] args) {
		PetShop petShop = new PetShop(5);
		petShop.add(new Cat("��è", "��ɫ��", 2));
		petShop.add(new Cat("��è", "��ɫ��", 2));
		petShop.add(new Cat("��è", "��ɫ��", 2));
		petShop.add(new Dog("��������", "��ɫ��", 2));
		petShop.add(new Dog("��ë", "��ɫ��", 2));
		petShop.add(new Dog("����", "��ɫ��", 2));
		print(petShop.search("��"));				
	}
	
	public static void print(Pet p[]) {
		for (int i = 0; i < p.length; i++) {
			if (p[i] !=null) {
				System.out.println(p[i].getName()+","+p[i].getColor()+","+p[i].getAge());
			}
		}
	}

}
