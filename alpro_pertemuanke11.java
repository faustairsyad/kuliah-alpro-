package uts;
public class searching {
    public static void main(String[] args) {
      
 /* data array
        int[] myArray = {1, 3, 5, 7, 8, 10, 12, 14, 16};
        int dicari = 8;
        System.out.println(dicari+" " + "telah ditemukan pada index: "+myBinarySearch(myArray, dicari));
    }

  */


    /* algoritma search dengan method

    static int linear(int[] myArray, int dicari) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == dicari) {
                return i;
            }
        }
        return -1;

    }

     */

    /* binary method
    static int myBinarySearch(int[] myArray, int dicari) {
        int low = 0;
        int high = myArray.length - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = myArray[mid];
            if (midVal < dicari)
                low = mid + 1;
            else if (midVal > dicari)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1); // key not found
    }
}

     */


/* shorting


package uts;
public class searching {
    public static void main(String[] args) {
        int[] myArray = {8, 15, 21, -4, 11, 37, 25};
        int minvalIndex = 0;

        for (int i = 0; i < myArray.length - 1; i++) {
            minvalIndex = i;
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[j] < myArray[minvalIndex]) {
                    minvalIndex = j;
                }
            }
            if (minvalIndex != i) {
                int temp = myArray[i];
                myArray[i] = myArray[minvalIndex];
                myArray[minvalIndex] = temp;
            }

        }
            for (int a: myArray){
                    System.out.println(a);
                }

            }
        }


*/
