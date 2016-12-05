
public class PetShop {
	private Pet[] pets;					//����������
	private int foot;					//���ݵı���λ��
	public PetShop(int len){			 //���췽�����ٳ�������Ĵ�С
		if (len>0) {
			this.pets = new Pet[len];
		}else {
			this.pets = new Pet[1];
		}
	}
	
	public boolean add(Pet pet){    //���ӳ���
		if (this.foot<this.pets.length) {
			this.pets[this.foot] = pet;
			this.foot++;
			return true;
		}else {
			return false;
		}
	}
	
	public Pet[] search(String keyword){
		Pet p[] = null;
		int count = 0;
		for (int i = 0; i < this.pets.length; i++) {
			if (this.pets[i] !=null) {
				if (this.pets[i].getName().indexOf(keyword) != -1 
						||this.pets[i].getColor().indexOf(keyword) != -1) {
					count++;
				}
			}
		}
		
		p = new Pet[count];
		int f = 0;
		for (int i = 0; i < this.pets.length; i++) {
			if (this.pets[i].getName().indexOf(keyword) != -1 
					||this.pets[i].getColor().indexOf(keyword) != -1){
				p[f]= this.pets[i];
				f++;
			}
		}
		return p;
	}
}
