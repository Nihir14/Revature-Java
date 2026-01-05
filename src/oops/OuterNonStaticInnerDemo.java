package oops;

class OuterNonStaticInnerDemo {

    private String msg = "Hello from Outer class";

    class Inner {
        void show() {
            System.out.println(msg); // accessing outer class member
        }
    }

    public static void main(String[] args) {

        OuterNonStaticInnerDemo outer = new OuterNonStaticInnerDemo();
        OuterNonStaticInnerDemo.Inner inner = outer.new Inner();
        inner.show();
    }
}
