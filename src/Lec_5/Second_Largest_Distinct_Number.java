package Lec_5;

public class Second_Largest_Distinct_Number {
    public static  int Second_largest_dist_number(int []a){
        int first_largest_number=Integer.MIN_VALUE;
        int second_largest_distinct_number=Integer.MIN_VALUE;
        int n=a.length;
        for(int i=0;i<n;i++) {
            if (a[i]>first_largest_number){
                second_largest_distinct_number=first_largest_number;
                first_largest_number=a[i];

            } else if (a[i]>second_largest_distinct_number && a[i]!=first_largest_number) {
                second_largest_distinct_number=a[i];
            }
        }
       return  second_largest_distinct_number;
    }
    public static void main(String[] args){
        int arr[]={10,20,-1,-2,76,76};
        System.out.println(Second_largest_dist_number(arr));
    }
}
