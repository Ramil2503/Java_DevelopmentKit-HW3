package pair;

public record RecordPair<A, B> (A a, B b) {
    @Override
    public String toString() {
        return "[Pair \na= " + a + "\nb= " + b + "]";
    }
}
