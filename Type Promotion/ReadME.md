 <h1>Type Promotion in Java</h1>
    <p>Type promotion, also known as type conversion or type casting, is the automatic conversion of a value from one data type to another data type. In Java, type promotion occurs in several contexts:</p>
    <h2>Numeric Promotion</h2>
    <ul>
        <li>In arithmetic expressions, operands of different types are promoted to a common type before the operation is performed.</li>
        <li>The promotion hierarchy in Java is: <code>byte</code> → <code>short</code> → <code>int</code> → <code>long</code> → <code>float</code> → <code>double</code>.</li>
        <li>Smaller data types are promoted to larger data types to prevent loss of precision or data truncation.</li>
    </ul>
    <h2>Assignment Conversion</h2>
    <ul>
        <li>In assignment statements, the value is automatically converted to the type of the variable if necessary.</li>
        <li>Narrowing conversions may require an explicit cast.</li>
    </ul>
    <h2>Method Invocation</h2>
    <ul>
        <li>When invoking methods, arguments are promoted to match the method signature if possible.</li>
        <li>The compiler chooses the most specific method that matches the argument types after promotion.</li>
    </ul>
    <h2>Automatic Type Conversion</h2>
    <ul>
        <li>Some types can be implicitly converted to other types without requiring an explicit cast.</li>
        <li>Numeric types can be promoted to larger numeric types, and smaller integer types can be promoted to <code>float</code> or <code>double</code>.</li>
    </ul>
    <p>Type promotion is crucial for ensuring compatibility and consistency in Java programs, but it's essential to be aware of potential loss of precision or data truncation that may occur during promotions, especially in narrowing conversions. In such cases, explicit type casting is required to safely convert data between different types.</p>
<h2>Examples:</h2>
    <pre>
public class TypePromotionExamples {
    public static void main(String[] args) {
        // Numeric Promotion
        byte byteValue = 10;
        int intValue = 20;
        double doubleValue = byteValue + intValue; // byte is promoted to int, then int is promoted to double
        System.out.println("Numeric Promotion: " + doubleValue);

        // Assignment Conversion
        double doubleNumber = 3.14;
        int intNumber = (int) doubleNumber; // Explicit cast needed for narrowing conversion
        System.out.println("Assignment Conversion: " + intNumber);

        // Method Invocation
        double result = calculateArea(5); // int is promoted to double
        System.out.println("Method Invocation: " + result);

        // Automatic Type Conversion
        int x = 10;
        double y = x; // int is automatically promoted to double
        System.out.println("Automatic Type Conversion: " + y);
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}
    </pre>