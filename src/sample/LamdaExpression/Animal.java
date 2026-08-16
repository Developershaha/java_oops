package sample.LamdaExpression;

//@FunctionalInterface
public interface Animal {
//   public static int calculate(int a,int b);

    default void show(){
        System.out.println("hey this is show method calling");
    }
}
