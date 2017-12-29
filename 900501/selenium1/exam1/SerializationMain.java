package selenium1.exam1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationMain {

	public static void main(String[] args){
		//Serialization example
		ObjectOutputStream obj;
		try {
			obj = new ObjectOutputStream(new FileOutputStream("Person.txt"));
			obj.writeObject(new Person(new Insurance(001,"Rajesh",125d)));
			obj.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
					
		
		//Deserialization example
		ObjectInputStream ois;
		Person person;
		try {
			ois = new ObjectInputStream(new FileInputStream("Person.txt"));
			person = (Person) ois.readObject();
			System.out.println(person);
			ois.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
