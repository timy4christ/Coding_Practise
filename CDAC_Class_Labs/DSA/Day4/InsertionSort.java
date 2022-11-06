class InsertionSort{
    public static void main(String[] args) {
        
        int arr[] = {60,10,5,42,33};
        int n = arr.length;

        for(int i=1; i<n; i++){

            int key = arr[i];
            for(int j=i-1; j>=0; j--){

                if(arr[j] > key){
                    arr[j+1] = arr[j];
                } else

            }



        }

    }
}