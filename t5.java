public class t5
{
  public static void main(String [] args)
  {
    int counter=0;
    int years=1;
    final double increase=0.05;
    double tution_fee=10000;
    System.out.printf("%10s %10s \n" , "Years" ,"Tution_fee");
    while(counter<10)      
    {  
      System.out.printf("%10d %10.3f \n",years,tution_fee);
      years++;
      tution_fee=tution_fee+(tution_fee*increase);      
      counter++;
    }
    
  }
}
