package Lec_3;
//Find all the even number in an array
public class Loops_Array_Even {

    public static void main (String[] args){
        int arr[]={1,2,4,5,6};

        int arrLength=arr.length;

        for(int i=0;i<arrLength;i++){
            if(arr[i]%2==0) {
                System.out.println("Even number "+arr[i]);
            }
        }
    }
}
