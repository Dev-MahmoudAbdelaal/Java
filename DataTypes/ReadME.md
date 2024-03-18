<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>
   <h1>Java Data Types</h1>
    <p>Data types specify the different sizes and values that can be stored in a variable. There are two types of data types in Java:</p>
    <ul>
        <li>Primitive data types: The primitive data types include boolean, char, byte, short, int, long, float, and double.</li>
        <li>Non-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays.</li>
    </ul>
    <h2>Java Primitive Data Types</h2>
    <p>In Java language, primitive data types are the building blocks of data manipulation. These are the most basic data types available in the Java language.</p>
    <p>Java is a statically-typed programming language. It means all variables must be declared before their use. That is why we need to declare a variable's type and name.</p>
    <p>There are 8 types of primitive data types:</p>
    <table border="1">
        <tr>
            <th>Data Type</th>
            <th>Default Value</th>
            <th>Default size</th>
        </tr>
        <tr>
            <td>boolean</td>
            <td>false</td>
            <td>1 bit</td>
        </tr>
        <tr>
            <td>char</td>
            <td>'\u0000'</td>
            <td>2 byte</td>
        </tr>
        <tr>
            <td>byte</td>
            <td>0</td>
            <td>1 byte</td>
        </tr>
        <tr>
            <td>short</td>
            <td>0</td>
            <td>2 byte</td>
        </tr>
        <tr>
            <td>int</td>
            <td>0</td>
            <td>4 byte</td>
        </tr>
        <tr>
            <td>long</td>
            <td>0L</td>
            <td>8 byte</td>
        </tr>
        <tr>
            <td>float</td>
            <td>0.0f</td>
            <td>4 byte</td>
        </tr>
        <tr>
            <td>double</td>
            <td>0.0d</td>
            <td>8 byte</td>
        </tr>
    </table>
    <h3>Boolean Data Type</h3>
    <p>The Boolean data type is used to store only two possible values: true and false. This data type is used for simple flags that track true/false conditions.</p>
    <h3>Byte Data Type</h3>
    <p>The byte data type is an 8-bit signed two's complement integer. Its value-range lies between -128 to 127 (inclusive). Its minimum value is -128 and maximum value is 127. Its default value is 0.</p>
    <h3>Short Data Type</h3>
    <p>The short data type is a 16-bit signed two's complement integer. Its value-range lies between -32,768 to 32,767 (inclusive). Its minimum value is -32,768 and maximum value is 32,767. Its default value is 0.</p>
    <h3>Int Data Type</h3>
    <p>The int data type is a 32-bit signed two's complement integer. Its value-range lies between -2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1) (inclusive). Its minimum value is -2,147,483,648 and maximum value is 2,147,483,647. Its default value is 0.</p>
    <h3>Long Data Type</h3>
    <p>The long data type is a 64-bit two's complement integer. Its value-range lies between -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)(inclusive). Its minimum value is -9,223,372,036,854,775,808 and maximum value is 9,223,372,036,854,775,807. Its default value is 0.</p>
    <h3>Float Data Type</h3>
    <p>The float data type is a single-precision 32-bit IEEE 754 floating point. Its value range is unlimited. It is recommended to use a float (instead of double) if you need to save memory in large arrays of floating point numbers. The float data type should never be used for precise values, such as currency. Its default value is 0.0F.</p>
    <h3>Double Data Type</h3>
    <p>The double data type is a double-precision 64-bit IEEE 754 floating point. Its value range is unlimited. The double data type is generally used for decimal values just like float. The double data type also should never be used for precise values, such as currency. Its default value is 0.0d.</p>
    <h3>Char Data Type</h3>
    <p>The char data type is a single 16-bit Unicode character. Its value-range lies between '\u0000' (or 0) to '\uffff' (or 65,535 inclusive). The char data type is used to store characters.</p>
    <h4>Why char uses 2 bytes in Java and what is '\u0000'?</h4>
    <p>It is because Java uses Unicode system not ASCII code system. The '\u0000' is the lowest range of Unicode system. To get detail explanation about Unicode visit next page.</p>
</body>

</html>