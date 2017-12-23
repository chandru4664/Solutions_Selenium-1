package Primenumber;

public class Entityclass {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entityclass eobj = new Entityclass();
		eobj.setId(100);
		eobj.setName("Mani");
	//	System.out.println(eobj.getId());
	//	System.out.println(eobj.getName());
		
		eobj.setId(200);
		eobj.setName("Ghilli");
	//	System.out.println(eobj.getId());
	//	System.out.println(eobj.getName());
		System.out.println(eobj);

	}

}
