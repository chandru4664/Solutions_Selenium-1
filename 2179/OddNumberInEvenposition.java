package domhtc.employee.eligibility;

public class OddNumberInEvenposition {
	
	public static void main(String[] args)
    {
int num [] =new int[]{9,12,9,12,15};

for (int i=1;i< num.length;i++){
if(i%2 == 0 && num[i]%3 == 0){

System.out.println("odd number in even position:" +num[i]);
  }

else {
System.out.println("condition not satified:" +num[i]);
    }
}
}

}
