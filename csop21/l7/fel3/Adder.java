public class Adder
{
    public static String add(final String s, final String s2) {
        try {
            return Integer.toString(Integer.parseInt(s) + Integer.parseInt(s2));
        }
        catch (NumberFormatException ex) {
            try {
                return Double.toString(Double.parseDouble(s) + Double.parseDouble(s2));
            }
            catch (NumberFormatException ex2) {
                throw new IllegalArgumentException("One or both of the parameters were not numbers");
            }
        }
    }
}
