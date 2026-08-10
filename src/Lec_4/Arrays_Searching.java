package Lec_4;

//Write a function that searches for an element in an array and returns its index if the element is present; otherwise, return -1

public class Arrays_Searching {
    public static void search_Element(int arr[],int element){
        for(int i=0;i<arr.length;i++){
            if (arr[i]==element){
                System.out.println(i+" "+element);
                return;
            }

        }
        System.out.println(-1);

    }
    public static void main(String[] args){
        int arr[]={12,20,34,78,2,5};
        search_Element(arr,34);
    }
}
