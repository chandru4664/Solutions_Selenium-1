package logic;

public class Series {

    int limit;
    
    int j ;
    
    public void prindivision(int l) 
    
    {
    
        this.limit = l;
        String flag="d";
       
        for(j=1;j<= limit;j ++)
    
    {
        
        System.out.println("1/"+j);
    
        }
    }
}
    
    class PrintMdivision{
    
    public static void main(String[] args) {
        
        Series obj = new Series();
        
        obj.prindivision(20);
        
    }
    }

