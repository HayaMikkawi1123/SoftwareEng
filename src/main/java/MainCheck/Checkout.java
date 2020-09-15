package MainCheck;

import java.util.ArrayList;

public class Checkout {
	int total=0; 
	public ArrayList <Fruit> al= new ArrayList<Fruit>();
	public void pushing (Fruit f) {
		al.add(f);
	}
	public void add (int count, String pro) {
		for (int i=0; i<al.size();i++)
		{
			if (al.get(i).name.equals(pro)) {
				total+= count*al.get(i).price;
			}
		}
	
	}
    public Integer finalTotal() {
    	return Integer.valueOf(total);
    }

}
