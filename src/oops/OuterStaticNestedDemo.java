package oops;

class OuterStaticNestedDemo {

    static int data = 100;

    static class Inner {
        void show() {
            System.out.println(data);
        }
    }

    public static void main(String[] args) {

        OuterStaticNestedDemo.Inner obj = new OuterStaticNestedDemo.Inner();
        obj.show();
    }
}
