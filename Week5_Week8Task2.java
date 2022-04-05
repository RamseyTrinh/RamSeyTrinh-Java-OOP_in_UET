import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ArithmeticException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.NullPointerException;

public class Week8Task2 {

    public void nullPointerEx() {
        String a = null;
        System.out.println(a.length());
    }

    /**
     * Null Pointer.
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
        return "No Error!";

    }

    public void arrayIndexOutOfBoundsEx() {
        int[] arr = new int[23];
        System.out.println(arr[30]);
    }

    /**
     * out of bounds.
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            return "Lỗi Array Index Out of Bounds";
        }
        return "No Error";
    }

    public void arithmeticEx() {
        double value = 2 / 0;
        System.out.println(value);
    }

    /**
     * arithmetic.
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }
        return "Không lỗi";
    }

    public void fileNotFoundEx() throws FileNotFoundException {
        FileInputStream a = new FileInputStream("D\\Hoang.txt");
    }

    /**
     * file not found.
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            return "Lỗi File Not Found";
        }
        return "No Error!";
    }

    public void ioEx() throws IOException {
        FileInputStream fis = new FileInputStream("D\\test.txt");
    }

    /**
     * ioEx.
     */

    public String ioExTest() {
        try {
            ioEx();
        } catch (IOException e) {
            // TODO: handle exception
            return "Lỗi IO";
        }
        return "No Error!";
    }

}
