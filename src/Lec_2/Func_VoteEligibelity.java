package Lec_2;

public class Func_VoteEligibelity {
    public static void EligibleToVote(int age){
        if(age<0){
            System.out.println("invalid input");
        }
      else if(age>=18){
          System.out.println("eligible to vote");
      }
      else {
          System.out.println("not eligible to vote");
      }
    }
    public static void main(String []args){
        EligibleToVote(-1);
        EligibleToVote(17);
        EligibleToVote(18);
    }
}
