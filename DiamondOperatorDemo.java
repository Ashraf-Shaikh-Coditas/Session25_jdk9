package Week6.Session25_JDK_9_UPDATE;

abstract class AnonymousClassDemo<Integer> {
     abstract Integer show(Integer val);
}

public class DiamondOperatorDemo{
    public static void main(String[] args) {
        AnonymousClassDemo<Integer> obj = new AnonymousClassDemo<>() {
            @Override
            Integer show(Integer val) {
                return val;
            }
        };

        System.out.println("The value is :: "+obj.show(3));
    }
}

/*

The value is :: 3

* */