import java.util.ArrayList;
import java.util.Arrays;

class Practice {
    private static void sum_up_recursive(ArrayList<Integer> numbers, int target, ArrayList<Integer> partial) {
        int s = 0;
        for (int x: partial) s += x;
        if (s == target)
            System.out.println(target + " Cents: "+"yes; used coins ="+Arrays.toString(partial.toArray()));
        if (s >= target)
            return;
        for(int i=0;i<numbers.size();i++) {
            ArrayList<Integer> remaining = new ArrayList<>();
            int n = numbers.get(i);
            for (int j=i+1; j<numbers.size();j++) remaining.add(numbers.get(j));
            ArrayList<Integer> partial_rec = new ArrayList<>(partial);
            partial_rec.add(n);
            sum_up_recursive(remaining,target,partial_rec);
        }
    }

    public static void main(String args[]) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        numbers.add(25);
        numbers.add(25);
        numbers.add(25);

        int[] toPay = {0, 1, 4, 5, 7, 8};
        for (int i : toPay) {
            sum_up_recursive(numbers, i, new ArrayList<>());
        }
    }
}