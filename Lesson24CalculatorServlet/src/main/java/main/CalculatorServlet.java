package main;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import static model.Calculator.*;
@WebServlet(name = "CalculatorServlet", value = "/my-calculator")
public class CalculatorServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        try {
            Double value1 = getResultFromCalculation(request, "value1");
            Double value2 = getResultFromCalculation(request, "value2");
            String calculator = request.getParameter("calculator");
            Double result = calculate(value1, value2, calculator);
            println(response, "Result is: " + calculator + " " + result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage() + "null");
        } catch (NumberFormatException exception) {
            println(response, "Not compatible type");
        } catch (IllegalStateException exception2) {
            println(response, "Not correct operation");
        } catch (Exception exception) {
            println(response, exception.getMessage());
        }
    }

    private Double calculate(Double value1, Double value2, String calculation) {
        return switch (calculation) {
            case "SUM" -> sum(value1, value2);
            case "SUBTRACTION" -> subtraction(value1, value2);
            case "MULTIPLY" -> multiply(value1, value2);
            case "DIVISION" -> division(value1, value2);
            default -> throw new IllegalStateException("Unexpected value: " + calculation);
        };
    }

    public Double getResultFromCalculation(HttpServletRequest servletRequest, String calculationName) {
        String calculatorValue = servletRequest.getParameter(calculationName);
        if (calculatorValue == null) {
            throw new IllegalArgumentException(calculationName + " is not set up");
        } else {
            return Double.valueOf(calculatorValue);
        }
    }

    private void println(HttpServletResponse response, String message) throws IOException {
        PrintWriter out = response.getWriter();
        out.println(message);
    }
}