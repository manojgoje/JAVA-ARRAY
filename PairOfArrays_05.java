public class PairOfArrays_05 {


    public static void arrayPair(int arr[])
    {
        int total = 0;
        for(int i=0;i<arr.length;i++)
        {
            int current = arr[i];

            for(int j=i+1; j<arr.length;j++)
            {
                System.out.print("("+current +","+arr[j]+")");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50};
        arrayPair(arr);
        // formula for finding the pair is ( n(n-1)/2 )  n= array element
        
    }
}