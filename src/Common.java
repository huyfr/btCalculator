public class Common {
    public static double calculator(double first, double second, String operator) {
        switch (operator) {
            case "add":
                return first + second;
            case "minus":
                return first - second;
            case "multiple":
                return first * second;
            case "divide":
                if (second != 0) {
                    return first / second;
                } else {
                    throw new RuntimeException("Khong the chia cho khong");
                }
            default:
                throw new RuntimeException("Invalid operation");
        }
    }
}
