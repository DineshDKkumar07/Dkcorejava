package dkprograms;
public class Main {

static void add(int a, int b, int c){
	
    System.out.println(a+b+c);
    
    }
    
    static void add( char k){
     
     System.out.println('n');
     
    }
    void add(String name) {
    
    System.out.println("HH");
    
    }
    
    Main(){
    
    System.out.println("adding constructor too");
    }
    

  public static void main(String[] args) {
    
    add(10,20,30);
    add('C');
    Main m1=new Main();
    m1.add("Dk");
    new Main();
    
    

  }
}
