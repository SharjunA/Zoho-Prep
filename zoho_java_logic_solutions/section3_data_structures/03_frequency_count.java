import java.util.*;
public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,4};
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) freq.put(num, freq.getOrDefault(num, 0) + 1);
        for (Map.Entry<Integer, Integer> e : freq.entrySet())
            System.out.println(e.getKey() + ": " + e.getValue());
    }
}