package home_work_in_exeption.ex1;

public class Ex1 {
    public static void printingAnElementByArrayIndex(int index, int[] arr){
        System.out.println(arr[index]);
    }
    public static int  dividingTwoNumbers(int one, int two){
        return  one / two;
    }
    public static int [] creatingAnArray(int size){

        return new int[size];
    }
    //-----------------------------------------------------------------------------
    public static int[] differenceInCells(int [] arr, int[] arr2){
        if (arr.length != arr2.length){
            System.out.println("Array lengths are not equal");
        } else

            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] - arr2[i];
            } return arr;
    }
    public static int[] privateElements(int [] arr, int[] arr2) {
        if (arr.length != arr2.length){
            throw new RuntimeException("Array lengths are not equal");
        } else

            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] / arr2[i];
            } return arr;
    }



}
