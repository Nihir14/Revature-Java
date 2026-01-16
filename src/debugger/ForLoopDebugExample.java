package debugger;

public class ForLoopDebugExample {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 5; i++) {   // step into this loop
            sum = sum + i;              // watch sum & i
        }

        System.out.println("Total Sum = " + sum);
    }
}
