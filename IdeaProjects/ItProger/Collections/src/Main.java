import java.util.*;

public class Main {

    /*public static void main(String[] args) {
        HashMap<String, Boolean> hMap = new HashMap<>();
        hMap.put("Alex", true);
        hMap.put("Ole", false);
        hMap.put("Hash", true);

        *//*boolean ole = hMap.get("Ole");
        System.out.println(ole);*//*

        for (Map.Entry<String, Boolean> entry : hMap.entrySet()) {
            String key = entry.getKey();
            boolean value = entry.getValue();
            System.out.println(key + " is " + value);
        }
    }*/

    /*public static void main(String[] args) {
        //Map<String, Integer> hMap = new HashMap<>();// SORTS BY VALUE COUNTING
        //Map<String, Integer> hMap = new LinkedHashMap<>();// SORTS BY AS IT IS
        //Map<String, Integer> hMap = new TreeMap<>();// SORTS BY KEYS
        Map<String, Integer> hMap = new TreeMap<>();
        hMap.put("first", 6);
        hMap.put("hasCar", 4);
        hMap.put("asWife", 1);

        *//*boolean ole = hMap.get("Ole");
        System.out.println(ole);/*//*


        for (Map.Entry<String, Integer> entry : hMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            System.out.println(key + " is " + value);
        }
    }*/

    public static void main(String[] args) {
        //Map<String, Integer> hMap = new HashMap<>();// SORTS BY VALUE COUNTING
        //Map<String, Integer> hMap = new LinkedHashMap<>();// SORTS BY AS IT IS
        //Map<String, Integer> hMap = new TreeMap<>();// SORTS BY KEYS
        Map<String, Integer> hMap = new TreeMap<>();
        hMap.put("first", 6);
        hMap.put("hasCar", 4);
        hMap.put("asWife", 1);

        /*boolean ole = hMap.get("Ole");
        System.out.println(ole);/*/


        for (Map.Entry<String, Integer> entry : hMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            System.out.println(key + " is " + value);
        }

        //Set<String> hSet = new HashSet<>();// te zapisi kotorie ne povtoryayutsia
        Set<String> hSet = new TreeSet<>();// te zapisi kotorie ne povtoryayutsia
        hSet.add("banana");
        hSet.add("banana");
        hSet.add("potato");
        hSet.add("milk");
        hSet.add("banana");

        for (String str : hSet){
            System.out.println(str);
        }
    }
}
