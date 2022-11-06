// array is sorted, find the first and last occurance of an element, in terms of index;
// application of binarySort

// addition total no of occurance of key in a sorted array

class FirstLastOccurance {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 3, 3, 3, 3, 3, 3, 5 };
        int key = 3;

        int firstIndex = firstOcc(arr, 0, arr.length - 1, 3);
        int lastIndex = lastOcc(arr, 0, arr.length - 1, 3);
        int totOccurance = lastIndex - firstIndex + 1;

        System.out.println("First Occurance of " + key + " is index " + firstIndex);
        System.out.println("Last Occurance of " + key + " is index " + lastIndex);
        System.out.println("Total no of Occurance for " + key + " is " + totOccurance);


    }

    public static int firstOcc(int[] arr, int start, int end, int key) {

        int mid = start + (end - start) / 2;
        int index = -1;
        while (start <= end) {

            if (arr[mid] == key) {
                index = mid;
                end = mid - 1;
            }

            else if (arr[mid] > key)
                end = mid - 1;

            else
                start = mid + 1;

            mid = start + (end - start) / 2;
        }

        return index;
    }

    public static int lastOcc(int[] arr, int start, int end, int key) {

        int mid = start + (end - start) / 2;
        int index = -1;
        while (start <= end) {

            if (arr[mid] == key) {
                index = mid;
                start = mid + 1;
            }

            else if (arr[mid] > key)
                end = mid - 1;

            else
                start = mid + 1;

            mid = start + (end - start) / 2;
        }

        return index;
    }

}