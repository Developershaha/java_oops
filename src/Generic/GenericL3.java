package Generic;
class Generic<T>{
    private T ref;
    public Generic(T ref){
        this.ref=ref;
    }
   public void showType(){
        System.out.println("show which type of data accepting "+ref.getClass().getName());
    }
    public T getRef(){
        return ref;
    }
}
public class GenericL3 {
    public static void main(String[] args) {
        Generic<Integer> g=new Generic<>(90);
        g.getRef();

        g.showType();

    }
}
