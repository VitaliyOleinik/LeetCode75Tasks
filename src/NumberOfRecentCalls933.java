import java.util.LinkedList;

public class NumberOfRecentCalls933 {
    LinkedList<Integer> slideWindow;

    public NumberOfRecentCalls933() {
        this.slideWindow = new LinkedList<Integer>();
    }

    public int ping(int t) {
        // step 1). append the current call
        this.slideWindow.addLast(t);

        // step 2). invalidate the outdated pings
        while (this.slideWindow.getFirst() < t - 3000)
            this.slideWindow.removeFirst();

        return this.slideWindow.size();
    }
}
