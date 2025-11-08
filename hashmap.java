import java.util.HashMap;

public class hashmap {
    public static void called(String[] arr) {
        HashMap<String, Integer> hm = new HashMap<>();

        for (String key : arr) {
            if (hm.containsKey(key)) {
                int curval = hm.get(key);
                hm.put(key, curval + 1);
            } else {
                hm.put(key, 1);
            }
        }

        for (String s : hm.keySet()) {
            System.out.println(s + " " + hm.get(s));
        }
    }

    public static void main(String[] args) {
        String[] arr = {"hai","hi", "hai", "hello", "to"};
        called(arr);
    }
}