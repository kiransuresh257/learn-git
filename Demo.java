public class Demo {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        
        objA.message();
        objB.message();
    }
}

class A {
    void message() {
        System.out.println("This is class A");
    }
}

class B {
    void message() {
        System.out.println("This is class BB");
    }
}
