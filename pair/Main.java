package pair;

public class Main {
    public static void main(String[] args) {
        // use our Class Pair
        Pair<String, Integer> pair = new Pair<>("aaaa", 1234);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair.toString());

        // use record instead of Class
        RecordPair<String, Integer> recordPair = new RecordPair<>("aaaa", 1234);
        System.out.println(recordPair.a());
        System.out.println(recordPair.b());
        System.out.println(recordPair.toString());
    }
}
