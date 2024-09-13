/**
 * Written by Madison Covey
 * For SD1
 * Learning
 */
public class jeditest {

    public static void main(String[] args) {
      int testRun=0;
       for(int x=1;x<101;x++){
        testRun+=x;
          if (x%2==1) {//this is checking to see if the number is even or odd
           System.out.println(x+" is odd"); 
          }else {
            System.out.println(x+" is even"); 
          }

       }
       System.out.println("the total is "+ testRun);
        
    }
}