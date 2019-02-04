public class recursion{

  public static double sqrt(double num, double threshold){
    if (num == 0){
      return 0;}
    return squareRoot(num,1,threshold);
    }

  public static double sqrt(double num){
    if (n == 0){
      return 0;}
    return squareRoot(num,1,0.00001);
  }

  public static double squareRoot(double num, double guess, double threshold){ //helper method
    if(num == 0){ //technically don't need this if in the other methods
    return 0;}
  if((Math.abs((num-g*g) / num) <= threshold)){
    return g;}
  else{
    double Newguess=(((num/guess) + guess)/2);
    return squareRoot(num,guess,threshold);}}

  }
