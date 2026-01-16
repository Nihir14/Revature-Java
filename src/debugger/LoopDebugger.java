package debugger;

public class LoopDebugger {

    public void printNumbers() {
        for (int i = 1; i <= 5; i++) {   // breakpoint here
            System.out.println("i = " + i);
        }
    }
}
