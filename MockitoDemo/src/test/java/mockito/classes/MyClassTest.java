package mockito.classes;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.*;

public class MyClassTest {

    // Mockito use to test MyClass
    @Test
    public void test1() {
        MyClass mc = Mockito.mock(MyClass.class);

        when(mc.getStr()).thenReturn("Vinod");
        assertEquals("Vinod", mc.getStr());

        // Verify getStr() method is invoked atleast once
        verify(mc).getStr();
    }

    // Demonstrates the return of multiple values
    @SuppressWarnings("unchecked")
    @Test
    public void testMoreThanOneReturnValue() {
        Iterator<String> i = mock(Iterator.class);
        when(i.next()).thenReturn("Mockito").thenReturn("rocks");
        String result = i.next() + " " + i.next();
        // assert
        assertEquals("Mockito rocks", result);
    }

    // this test demonstrates how to return values based on the input
    @SuppressWarnings("unchecked")
    @Test
    public void testReturnValueDependentOnMethodParameter() {
        Comparable<String> c = mock(Comparable.class);
        when(c.compareTo("Mockito")).thenReturn(1);
        when(c.compareTo("Eclipse")).thenReturn(2);
        // assert
        assertEquals(1, c.compareTo("Mockito"));
    }

    // this test demonstrates how to return values independent of the input value

    @SuppressWarnings("unchecked")
    @Test
    public void testReturnValueInDependentOnMethodParameter() {

        Comparable<Integer> c = mock(Comparable.class);
        when(c.compareTo(anyInt())).thenReturn(-1);
        // assert
        assertEquals(-1, c.compareTo(9));
    }

    // return a value based on the type of the provide parameter

    @SuppressWarnings("unchecked")
    @Test
    public void testReturnValueInDependentOnMethodParameter_1() {
        Comparable<MyClass> c = mock(Comparable.class);
        when(c.compareTo(isA(MyClass.class))).thenReturn(0);
        // assert
        assertEquals(0, c.compareTo(new MyClass("whatever")));
    }

    // this test demonstrates how use doThrow

    @Test(expected = IOException.class)
    public void testForIOException() throws IOException {
        // create an configure mock
        OutputStream mockStream = mock(OutputStream.class);
        doThrow(new IOException()).when(mockStream).close();

        // use mock
        OutputStreamWriter streamWriter = new OutputStreamWriter(mockStream);
        streamWriter.close();
    }

}
