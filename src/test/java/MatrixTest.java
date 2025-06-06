import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MatrixTest {
    @Test
    public void testMatrixAddition() {
        Matrix m1 = new Matrix(2);
        Matrix m2 = new Matrix(2);

        m1.set(0, 0, 1);
        m1.set(0, 1, 2);
        m1.set(1, 0, 3);
        m1.set(1, 1, 4);

        m2.set(0, 0, 5);
        m2.set(0, 1, 6);
        m2.set(1, 0, 7);
        m2.set(1, 1, 8);

        m1.add(m2);

        assertEquals(6, m1.get(0, 0));
        assertEquals(8, m1.get(0, 1));
        assertEquals(10, m1.get(1, 0));
        assertEquals(12, m1.get(1, 1));
    }

    @Test
    public void testMatrixMultiplication() {
        Matrix m1 = new Matrix(2);
        Matrix m2 = new Matrix(2);

        m1.set(0, 0, 1);
        m1.set(0, 1, 2);
        m1.set(1, 0, 3);
        m1.set(1, 1, 4);

        m2.set(0, 0, 2);
        m2.set(0, 1, 0);
        m2.set(1, 0, 1);
        m2.set(1, 1, 2);

        m1.multiply(m2);

        assertEquals(4, m1.get(0, 0));
        assertEquals(4, m1.get(0, 1));
        assertEquals(10, m1.get(1, 0));
        assertEquals(8, m1.get(1, 1));
    }

    @Test
    public void testMatrixTranspose() {
        Matrix m = new Matrix(2);

        m.set(0, 0, 1);
        m.set(0, 1, 2);
        m.set(1, 0, 3);
        m.set(1, 1, 4);

        m.transpose();

        assertEquals(1, m.get(0, 0));
        assertEquals(3, m.get(0, 1));
        assertEquals(2, m.get(1, 0));
        assertEquals(4, m.get(1, 1));
    }
}
