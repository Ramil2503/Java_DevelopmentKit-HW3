package calculator;
public class Calculator {
    public static <A extends Number, B extends Number> Number sum(A a, B b) {
        // doubleValue can be used for any subclass of class Number: Integer, Long, Float, Double
        // SIMPLE SOLUTION
        // return a.doubleValue() + b.doubleValue();

        // OPTIMIZED SOLUTION
        // I optimized code here. First we check for a and b being from the same class.
        // If they are not from the same class. We go from the bigger class to smaller
        // double in this case, if there is no double we check maybe we have float here
        // if there is also no float. We will use long; case when we have Integer and Integer we
        // checked at the beginning.
        if (a.getClass() == Integer.class && b.getClass() == Integer.class) {
            return a.intValue() + b.intValue();
        } else if (a.getClass() == Long.class && b.getClass() == Long.class) {
            return a.longValue() + b.longValue();
        } else if (a.getClass() == Float.class && b.getClass() == Float.class) {
            return a.floatValue() + b.floatValue();
        } else if (a.getClass() == Double.class || b.getClass() == Double.class) {
            return a.doubleValue() + b.doubleValue();
        } else if (a.getClass() == Float.class || a.getClass() == Float.class) {
            return a.floatValue() + b.floatValue();
        } else if (a.getClass() == Long.class || b.getClass() == Long.class) {
            return a.longValue() + b.longValue();
        } else {
            throw new IllegalArgumentException("Unsupported number types");
        }
    }

    public static <A extends Number, B extends Number> Number multiply(A a, B b) {
        if (a.getClass() == Integer.class && b.getClass() == Integer.class) {
            return a.intValue() * b.intValue();
        } else if (a.getClass() == Long.class && b.getClass() == Long.class) {
            return a.longValue() * b.longValue();
        } else if (a.getClass() == Float.class && b.getClass() == Float.class) {
            return a.floatValue() * b.floatValue();
        } else if (a.getClass() == Double.class || b.getClass() == Double.class) {
            return a.doubleValue() * b.doubleValue();
        } else if (a.getClass() == Float.class || a.getClass() == Float.class) {
            return a.floatValue() * b.floatValue();
        } else if (a.getClass() == Long.class || b.getClass() == Long.class) {
            return a.longValue() * b.longValue();
        } else {
            throw new IllegalArgumentException("Unsupported number types");
        }
    }

    public static <A extends Number, B extends Number> Number divide(A a, B b) {
        if (a.getClass() == Integer.class && b.getClass() == Integer.class) {
            return a.intValue() / b.intValue();
        } else if (a.getClass() == Long.class && b.getClass() == Long.class) {
            return a.longValue() / b.longValue();
        } else if (a.getClass() == Float.class && b.getClass() == Float.class) {
            return a.floatValue() / b.floatValue();
        } else if (a.getClass() == Double.class || b.getClass() == Double.class) {
            return a.doubleValue() / b.doubleValue();
        } else if (a.getClass() == Float.class || a.getClass() == Float.class) {
            return a.floatValue() / b.floatValue();
        } else if (a.getClass() == Long.class || b.getClass() == Long.class) {
            return a.longValue() / b.longValue();
        } else {
            throw new IllegalArgumentException("Unsupported number types");
        }
    }

    public static <A extends Number, B extends Number> Number subtract(A a, B b) {
        if (a.getClass() == Integer.class && b.getClass() == Integer.class) {
            return a.intValue() - b.intValue();
        } else if (a.getClass() == Long.class && b.getClass() == Long.class) {
            return a.longValue() - b.longValue();
        } else if (a.getClass() == Float.class && b.getClass() == Float.class) {
            return a.floatValue() - b.floatValue();
        } else if (a.getClass() == Double.class || b.getClass() == Double.class) {
            return a.doubleValue() - b.doubleValue();
        } else if (a.getClass() == Float.class || a.getClass() == Float.class) {
            return a.floatValue() - b.floatValue();
        } else if (a.getClass() == Long.class || b.getClass() == Long.class) {
            return a.longValue() - b.longValue();
        } else {
            throw new IllegalArgumentException("Unsupported number types");
        }
    }
}
 