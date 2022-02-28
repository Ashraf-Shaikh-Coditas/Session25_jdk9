package Week6.Session25_JDK_9_UPDATE;

interface DemoInterface {
    void method1();

    static void method2(){                  // static method
        System.out.println("Static method called ...");
    }

    default void method3() {               // default method
        System.out.println("Default method called ...");
    }

    private void method4() {              // private method
        System.out.println("Private method called ....");
    }
}
public class InterfaceEnhancementDemo {
    public static void main(String[] args) {
        DemoInterface ref_obj = new DemoInterface() {
            @Override
            public void method1() {
                System.out.println(" Abstract Method called ....");
            }
        };

        ref_obj.method1();
        DemoInterface.method2();
        ref_obj.method3();

    }
}


/*

 Abstract Method called ....
Static method called ...
Default method called ...


* */