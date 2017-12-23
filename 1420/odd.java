package oddnumber;

public class odd {
    int limit;
    
    int j ;
    
    public void printodd(int l) 
    
    {
    
        this.limit = l;
        String flag="d";
       
        for(j=1;j<= limit;j ++)
    
    {
    
       if( j % 2 != 0)
       
        if (!flag.equals("p"))
        {
           System.out.println(" "+j);
           flag = "p";
           
        }
           
         else
         
         {
         
          System.out.println("-" + j);
          
          flag = "d";
           
         }
               }
    }
}
    
    class printOdnum{
    
    public static void main(String[] args) {
        
        odd obj = new odd();
        
        obj.printodd(20);
        
    }
    }
