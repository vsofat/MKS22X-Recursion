import java.util.*;

public class recursion{

  public static void main(String[] args) {
    // DRIVER -- MR.K
    for (int index = 0; index < 6; index++){
      testFib(index);
      testSqrt(index);
    }
    /*
    // Sqrt
    System.out.println("16: " + sqrt(16, .001) + "; " + sqrt(16) + "; "+ Math.sqrt(16));
    System.out.println("100: " + sqrt(100, .001) + "; " + sqrt(100) + "; " + Math.sqrt(100));
    System.out.println("1: " + sqrt(1, .001) + "; " + sqrt(1) + "; " + Math.sqrt(1));
    System.out.println(".5: " + sqrt(.5, .001) + "; " + sqrt(.5) + "; " + Math.sqrt(.5));
    System.out.println("): " + sqrt(0, .001) + "; " + sqrt(0) + "; " + Math.sqrt(0));

    // Fib
    System.out.println("Fib 0: " + fib(0));
    System.out.println("Fib 1: " + fib(1));
    System.out.println("Fib 5: " + fib(3));
    System.out.println("Fib 7: " + fib(5));
    System.out.println("Fib 40: " + fib(40));
    System.out.println("Fib 51: " + fib(51));
    */
  }

  //testcase must be a valid index of your input/output array
  public static void testFib(int testcase){
    recursion r = new recursion();
    int[] input = {0,1,2,3,5,30};
    int[] output ={0,1,1,2,5,832040};
    int max = input.length;
    if(testcase < input.length){
      int in = input[testcase];
      try{

        int ans = r.fib(in);
        int correct = output[testcase];
        if(ans == correct){
          System.out.println("PASS test fib "+in+". "+correct);
        }
        else{
          System.out.println("FAIL test fib"+in+". "+ans+" vs "+correct);

        }
      }catch(IllegalArgumentException n){
        if(in < 0){
          System.out.println("PASS test fib"+in+" IllegalArgumentException");
        }else{
          System.out.println(" FAIL IllegalArgumentException in test case:"+in);
        }
      }catch(Exception e){
        System.out.println(" FAIL Some exception in test case:"+in);
      }
    }
  }


  //testcase must be a valid index of your input/output array
  public static void testSqrt(int testcase){
    recursion r = new recursion();
    double[] input = {0.0,1.0, 2.0, 4.0, 7.0};
    double[] output = {0.0,1.0,1.4142135623730951,2.0,2.6457513110645907};
    int max = input.length;
    if(testcase < input.length){
      double in = input[testcase];
      try{

        double ans = r.sqrt(in,.00001);
        double correct = Math.sqrt(in);
        if(closeEnough(ans,correct)){
          System.out.println("PASS test sqrt "+in+" "+ans);
        }
        else{
          System.out.println("FAIL test sqrt "+in+" "+ans+" vs "+correct);

        }
      }catch(IllegalArgumentException n){
        if(in < 0){
          System.out.println("PASS test sqrt"+in+" IllegalArgumentException");
        }else{
          System.out.println(" FAIL IllegalArgumentException in test case:"+in);
        }
      }catch(Exception e){
        System.out.println(" FAIL Some exception in test case:"+in);
      }
    }
  }

  public static double sqrt(double num, double threshold){
    if (num == 0){
      return 0;}
      return squareRoot(num,1,threshold);
    }

    public static double sqrt(double num){ //overrides previous function
      if (num == 0){
        return 0;}
        return squareRoot(num,1,0.00001); //threshold from documentation on website
      }

      public static double squareRoot(double num, double guess, double threshold){ //helper method
        if(num == 0){ //technically don't need this if in the other methods
        return 0;}
        if((Math.abs((num-guess*guess) / num) <= threshold)){
          return guess;}
          else{
            double Newguess=(((num/guess) + guess)/2);
            return squareRoot(num,guess,threshold);}}

            public static int fib(int num){
              if (num < 0){
                throw new IllegalArgumentException("Num entered must be positive."); // this is a precondition
              }
              if (num < 2){
                return 1;
              }
              return fibLinear(num, 1, 1);
            }

            public static int fibLinear(int num, int previous, int previouser){
              if (n == 2){
                return previous+previouser;}
                return fibLinear(num-1, previous+previouser, previous);
              }

              public static ArrayList<Integer> makeAllSums(int nums){
                ArrayList<Integer> sums = new ArrayList<Integer>();
                return allSums(nums,0,sums); //need to determine params
              }

              public static void allSums(int nums, int current, ArrayList<Integer> all) {
                if (n <= 0) {
                  all.add(current);
                  return all;
                }
                allSums(n - 1, current + n, all);
                allSums(n - 1, current, all);
              }

            }
