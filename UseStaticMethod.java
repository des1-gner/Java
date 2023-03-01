public class UseStaticMethod{
  public static void aMethod(){
    System.out.println("static method is called");
  }
  //instance method
   public void bMethod(){
    System.out.println("nonstatic method is called");
  }
  public static void main(String[] args){
    //call method
    aMethod();
    //try to call nonstatic method
    //bMethod();
    //create instance
    UseStaticMethod usm = new UseStaticMethod();
    //call instance method
    usm.bMethod();
    
  }
}