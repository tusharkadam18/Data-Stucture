import java.util.*;
public class ArraysDemo{
   public int[] insertAtPos(int[] arr, int pos, int element){
       int[] temparr = new int[arr.length+1];
       System.arraycopy(arr, 0, temparr, 0, arr.length);
       for (int i = temparr.length-1; i > pos ; i--) {
           temparr[i] = temparr[i-1];
       }
       temparr[pos] = element;
       arr = temparr;
       return arr;
   }
   public int[] deleteElement(int[] arr, int element){
       int[] temparr = new int[arr.length-1];
       int pos = 0;
       boolean c = false;
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] == element){
               arr[i] = 0;
               pos = i;
               c = true;
               break;
           }
       }
       if (c) {
           System.arraycopy(arr, 0, temparr, 0, pos);
           if (temparr.length - pos >= 0) System.arraycopy(arr, pos + 1, temparr, pos, temparr.length - pos);
           return temparr;
       }
       else {
           return arr;
       }
   }
    public int[] deleteAllElement(int[] arr, int element){
        int pos = 0;
        int count = 0;
        boolean c = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element){
                arr[i] = 0;
                pos = i;
                c = true;
                count++;
            }
        }

        int[] temparr = new int[arr.length-count];
        if (c) {
            System.arraycopy(arr, 0, temparr, 0, pos-1);
            if (temparr.length - pos >= 0) System.arraycopy(arr, pos + 1, temparr, pos, temparr.length - pos);
            return temparr;
        }
        else {
            return arr;
        }
    }
    public int[] deleteFromPos(int[] arr, int pos){
       int[] temparr = new int[arr.length-1];
       arr[pos] = 0;
       System.arraycopy(arr, 0, temparr, 0, pos);
       if (temparr.length - pos >= 0) System.arraycopy(arr, pos + 1, temparr, pos, temparr.length - pos);
       return temparr;
    }

    public static void main(String[] args) {
        ArraysDemo arraysDemo = new ArraysDemo();
        int[] arr = {25, 63, 95, 56, 56};
        int pos = 2;
        int element = 64;
        int[] temp1, temp2;
        temp1 = arraysDemo.insertAtPos(arr,pos,element);
        temp2 = arraysDemo.deleteFromPos(temp1,pos);
        System.out.println(Arrays.toString(arr) + " Array After adding element at position "+ (pos+1));
        System.out.println(Arrays.toString(arraysDemo.insertAtPos(arr,pos,element)));
        System.out.println(Arrays.toString(arraysDemo.insertAtPos(arr,pos,element)) + " Array After removing the element from position " + (pos+1));
        System.out.println(Arrays.toString(temp2));
        element = 56;
        System.out.println(Arrays.toString(temp2) + " Array After deleting the first occurrence of " + element);
        System.out.println(Arrays.toString(arraysDemo.deleteElement(temp2,element)));
        System.out.println(Arrays.toString(arr) + " Array After deleting all the occurrences of " + element);
        System.out.println(Arrays.toString(arraysDemo.deleteAllElement(arr,element)));
    }
}


// PS E:\DataStuctureAndAlgorithms\Day1\ADSArrays\src> java ArraysDemo      
// [25, 63, 95, 56, 56] Array After adding element at position 3
// [25, 63, 64, 95, 56, 56]
// [25, 63, 64, 95, 56, 56] Array After removing the element from position 3
// [25, 63, 95, 56, 56]
// [25, 63, 95, 56, 56] Array After deleting the first occurrence of 56
// [25, 63, 95, 56]
// [25, 63, 95, 56, 56] Array After deleting all the occurrences of 56
