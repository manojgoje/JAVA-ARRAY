public class lowestNumber_04 {

    public static int smallestNumber(int arr[]) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];

            }

        }
        return smallest;
    }

    public static int largestValue(int arr[])
    {
        int largest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if (largest < arr[i]) {
                largest = arr[i];
                
            }
        }
        return largest;
    }

    public static void main(String[] args) {

        int number[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        int small = smallestNumber(number);
        int large = largestValue(number);
        System.out.println("the smallest value is "+small +"the largest is "+large);

    }

}
