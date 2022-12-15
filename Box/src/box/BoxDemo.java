
package box;

class Box{
    double width;
    double height;
    double depth;
    
    Box(double w, double h, double d){
        this.width = w;
        this.height = h;
        this.depth = d;
        
    }

    Box(Box mybox2) {
      
    }
    
   double volume(){
       return width * height * depth;
   }
}
public class BoxDemo {

    public static void main(String[] args) {
     Box mybox1 = new Box(10, 20, 15);
     Box mybox2 = new Box(2, 5, 7);
     Box myboxC = new Box( 2, 5, 7);
     
     double vol = myboxC.volume();
        System.out.println("The volume is : " + vol);
    
    }
    
}
