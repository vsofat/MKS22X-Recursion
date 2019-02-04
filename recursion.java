public class recursion{

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


  }
