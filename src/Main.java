//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main(String[] args) {
        Shape s1;
        // What value can s1 hold?

        //You can't create object for abstract class
       // s1 = new Shape();
        s1 = new Circle("Black", 30.5);

        Shape s2 = new Rectangle("Gold", 20, 25);

        Shape [] shapes = new Shape[2];
        shapes[0] = s1;
        shapes[1] = s2;

for (Shape sh: shapes) {
    //Shape sh : shapes - tells to provide all the indexed values inside shapes array one by one until nothing left
    //Shape sh = s1  // assigning reference value
    //Shape sh = s2

    // invoking reference-specific calculations
    // Dynamic method dispatch or Runtime Polymorphism
    sh.calculateArea();
}
// for (int i = 0; i<shapes.length; i++){
 //   shapes[i].calculateArea();//
        //   }

        // Can a method be static and abstract same time?
        //Can a class be static?
        // Can a class be protected and abstract?

    }
}