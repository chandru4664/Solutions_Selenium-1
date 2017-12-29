package selenium1.exam1;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Person implements Externalizable{

	public Person() {
		super();
	}
	
	
	public Person(Insurance insurance) {
		super();
		this.insurance = insurance;
	}


	public Insurance getInsurance() {
		return insurance;
	}


	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}


	private transient Insurance insurance;

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(insurance.getInsNum());
		out.writeUTF(insurance.getName());
		out.writeDouble(insurance.getPrice());
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		int insNo = in.readInt();
		String name = in.readUTF();
		double price = in.readDouble();
		
		insurance=new Insurance(insNo,name,price);
		
	}


	@Override
	public String toString() {
		return "Person [insurance=" + insurance + "]";
	}
	
	
}
