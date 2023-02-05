package main;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.Calculator;
import model.Calculator.*;
@WebServlet("/calculator")
public class CalculatorServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        try {
            Double value1 = getResultFromCalculation(request, Calculation.valueOf("value1"));
            Double value2 = getResultFromCalculation(request, Calculation.valueOf("value2"));
            String calculator = request.getParameter("calculation");
            Double result = calculate(value1, value2, Calculation.valueOf(calculator));
            println(response, "Result is: " + calculator + " " + result);
        } catch (NumberFormatException exception) {
            println(response, "Not compatible type");
        } catch (IllegalStateException exception2) {
            println(response, "Not correct operation");
        } catch (Exception exception) {
            println(response, exception.getMessage());
        }
    }


    private Double calculate(Double value1, Double value2, Calculation calculation) {
        return switch (calculation) {
            case SUM -> value1 + value2;
            case SUBTRACTION -> value1 - value2;
            case MULTIPLY -> value1 * value2;
            case DIVISION -> value1 / value2;
        };
    }

    public Double getResultFromCalculation(HttpServletRequest servletRequest, Calculator.Calculation calculation) {
        Calculator.Calculation calculate = Calculator.Calculation.valueOf(servletRequest.getParameter(calculation.name()));
        return Double.valueOf(calculate.name());
    }

    private void println(HttpServletResponse response, String message) throws IOException {
        PrintWriter out = response.getWriter();
        out.println(message);
    }
}