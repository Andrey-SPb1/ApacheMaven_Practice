package maven.servlet;

import jakarta.servlet.http.HttpServlet;

import java.util.function.Supplier;

public class FirstServlet extends HttpServlet {
    public static void main(String[] args) {
        Supplier<String> str = () -> "Hello World";
        System.out.println(str.get());
    }
}
