package Week6.Session25_JDK_9_UPDATE;

public class RunTimeVersionDemo {
    public static void main(String[] args) {
        Runtime.Version v = Runtime.version();
        System.out.println("Java Version :: " + v);
        System.out.println("Java Version Major:: " + v.major());
        System.out.println("Java Version Minor :: " + v.minor());
        System.out.println("Java Version Security :: " + v.security());
        System.out.println("Java Version Build:: " + v.build().get());
    }
}

/*

Java Version :: 17.0.1+12-LTS-39
Java Version Major:: 17
Java Version Minor :: 0
Java Version Security :: 1
Java Version Build:: 12

* */
