public class ArrayOps {
    public static void main(String[] args) {

    }
    
    public static int findMissingInt (int [] array) { //finds missing int in the array
        int missingInt = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == missingInt) {
                missingInt++;
            }
        }
        return missingInt;
    }

    public static int secondMaxValue(int [] array) { //returns second max value of array
        int max = 0;
        int max2 = 0;
        for(int i = 0; i<array.length;i++){ //gets max value of the array
            max = Math.max(max, array[i]);
        }
        for(int i = 0;i < array.length;i++){ //gets the max value of the array thats samller than max
            if ((max > array[i]) && (array[i] > max2)) {
                max2 = array[i];
            }
        }
        if (maxTwice(array)) {
            max2 = max;
        }
        return max2;
    }
    public static boolean maxTwice(int [] array){ //checks wether the max value appears more than once
        int max = 0;
        int count = 0;
        for(int i = 0; i<array.length;i++){ 
            max = Math.max(max, array[i]);
        }
        for(int i = 0; i<array.length;i++){
            if (array[i] == max) {
                count++;
            }
        }
        if (count >=2) {
            return true;
        }else
        return false;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) { //check wether two arrays contain the same elements
        int [] set1 = set(array1);
        int [] set2 = set(array2);
        int [] difference = diffSets(set1, set2);
        if ((difference.length == 0) && set1.length == set2.length) {
            return true;
        }else return false;
        
    }
    public static void printArray(int[] array){ //prints an array of ints
        System.out.print('{');
        for (int i = 0; i < array.length; i++){
        System.out.print(array[i]);
        char c = i != array.length - 1 ? ',' : '}';
        System.out.print(c);
         }
        System.out.println();
        }
    public static boolean contains(int[] arr, int value, int index) { //checks if an array contains a certain value at a certain index
        for (int i = 0; i < index; i++) {
            if (arr[i] == value) {
            return true;
            }
        }
            return false ;
        }
    public static boolean contains(int[] arr, int value) { //checks if an array contains a certain value
            for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
            return true;
            }
            }
            return false;
        }    
            
    public static int countUnique(int[] arr) { //counts how many unique chars are in an array
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                count = contains(arr, arr[i], i) ? count : count + 1;
            }
            return count;
        }
                        
            
        public static int [] set (int[] arr) {
            int [] res = new int [countUnique(arr)];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
            if (!contains(arr, arr[i], i)){
            res[index++] = arr[i];
            }
            }
            return res;
            }
        
            public static int [] diffSets(int[] set1, int[] set2) { //calculates the different elemnts between two sets
                int [] arr = new int [set1.length];
                int size = 0;
                for (int i = 0; i < set1.length; i++) {
                if (!contains(set2, set1[i])){
                arr[size++] = set1[i];
                }
                }
                int [] res = new int [size];
                for (int i = 0; i < res.length; i++) {
                res[i] = arr[i];
                }
                return res;
                }
                
            
    

    public static boolean isSorted(int [] array) { //checks if the array is sorted up or down or not at all
        if (upSorted(array) || downSorted(array)) {
            return true;
    
        }else return false;
    }
          
    public static boolean upSorted(int [] array) { //checks if the array is sorted up
        for(int i = 0; i<array.length - 1; i++){
            if(array[i] > array[i + 1]){
                return false;
            }
        }   
        return true;
    }
    public static boolean downSorted(int [] array) { //checks if the array is sorted down
        for(int i = 0; i<array.length - 1; i++){
            if(array[i] < array[i + 1]){
                return false;
            }
        }   
        return true;
    }

}
