public class MaxSubArraySum_08 {
    public static void MaxSubArraySum(int numbers[])
    {
        int currSum = 0;
        int maxSum  = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length;i++)
        {
            int start = i;
            for(int j=i ;i<numbers.length;j++)
            {

                int end = j;
                currSum = 0;
                for(int k=start;k<end;k++)
                {
                    currSum += numbers[k];

                }
                System.out.println(currSum);

            }
            if (maxSum>currSum) {
                maxSum= currSum;
                
            }
        }
    }
    
    public static void main(String[] args) {
        

        int numbers [] ={10,20,30,40,50};
        MaxSubArraySum(numbers); 


        
    }

    
}
