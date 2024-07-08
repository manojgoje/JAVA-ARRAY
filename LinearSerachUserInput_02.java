import java.util.Scanner;

public class LinearSerachUserInput_02 {


    public static int serachElement(int array[],int key)
    {
        for(int i=0;i<array.length;i++)
        {
            if (array[i] == key) {

                return i;
                
            }
        }

        return -1;

    }
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.println("ENter the size of an array");
       int arrSize = sc.nextInt();

       int content [] = new int[arrSize];

       System.out.println("enter The Elements here ");
       for(int i=0;i<content.length; i++)
       {
            content[i] = sc.nextInt();
       }
       


       System.out.println("Your array element is ");
       for(int i=0;i<content.length;i++)
       {
        System.out.print(content[i] +" ");
       }
       System.out.println("Enter your key here");
        int key = sc.nextInt();

       int index =serachElement(content,key);

       if (index == -1) {
        System.out.println("Element not found here");
        
       }
       else{
        System.out.println("element is found on at index is "+ index);
       }

       sc.close();
    }
};