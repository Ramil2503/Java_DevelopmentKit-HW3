package pair;

public class Main {
    public static void main(String[] args) {
        //Pair pair = new Pair<>("aaaa", 132423); // possible, but not recommended
        Pair<String, Integer> pair = new Pair<>("aaaa", 132423);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair.toString());
    }
}
