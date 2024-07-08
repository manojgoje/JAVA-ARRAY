
public class LinearSerch_02 {


    public static int linerSerach (int numbers[],int key)
    {
        for(int i=0;i<numbers.length;i++)
        {
            if (numbers[i] == key)
             {
            
                return i;
            }
        }

              return -1;   
    }
    public static void main(String[] args) {

        int numbers [] = {10,20,30,40,50,60,70,80,90,100};
        int key = 10;

       int index = linerSerach(numbers,key);


       if (index == -1) {
        System.out.println("Number was not found ");
        
       }
       else{
        System.out.println("number is found on the index : "+index);
       }
    }
    
}