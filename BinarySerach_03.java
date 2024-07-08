public class BinarySerach_03 {
    public static int binarySerach(int numbers[], int key) {
        int start = 0;
        int last = numbers.length - 1;
        while (start <= last) {
            
            int mid = (start + last) / 2;

            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                last = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int key = 70;

        int res = binarySerach(arr, key);

        System.out.println("index of key is " + res);

    }

}
