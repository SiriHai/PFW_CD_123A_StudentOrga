package model;

public enum Function {
    ADMINISTRATION("Administration"),
    IT("IT"),
    MARKETING("Marketing"),
    SALES("Sales"),
    NO_FUNCTION("No function");

    private String string;

    private Function(String string) {
        this.string = string;
    }

    public String toString() {
        return string;
    }

    public static Function parseFunction(String string) {
        for (Function function : Function.values()) {
            if (function.string.equals(string)) {
                return function;
            }
        }
        return NO_FUNCTION;
    }

    public static String[] getStrings() {
        Function[] functions = Function.values();
        String[] result = new String[functions.length];
        for (Function function : functions) {
            result[function.ordinal()] = function.toString();
        }
        return result;
    }
}
