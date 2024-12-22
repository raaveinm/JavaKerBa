import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class BasicServer {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(1111)) {
            System.out.println("Server started localhost:1111");
            while (true) {
                try (Socket socket = serverSocket.accept();
                     BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                     PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

                    System.out.println("Client connected");
                    String requestLine = in.readLine();
                    System.out.println("Client: " + requestLine);
                    String path = new URL("http://localhost" + requestLine.split(" ")[1]).getPath();


                    switch (path) {
                        case "/main": {
                            out.println("HTTP/1.1 200 OK");
                            out.println("Content-Type: text/html");
                            out.println();
                            out.println("<a href=\"https://gemini.google.com/app\">Gemini</a>");
                            out.println("\n<a href=\"https://itsraaveinm.netlify.app/\">Raaveinm official website</a>");
                            break;
                        }
                        case "/calculate": {
                            try {
                                Map<String, String> params = parseParameters(requestLine.split(" ")[1]);
                                double a = Double.parseDouble(params.get("a"));
                                double b = Double.parseDouble(params.get("b"));
                                String op = params.get("op");
                                double result = calculate(a, b, op);
                                out.println("HTTP/1.1 200 OK");
                                out.println("Content-Type: text/plain");
                                out.println();
                                out.println(result);
                            } catch (NumberFormatException | NullPointerException | ArithmeticException e) {
                                System.err.println("Error handling /calculate request: " + e.getMessage());
                                out.println("HTTP/1.1 500 Internal Server Error");
                                out.println("Content-Type: text/plain");
                                out.println("Error processing request.");
                            }

                            }
                            break;
                        default: {
                            out.println("HTTP/1.1 302 Found");
                            out.println("Location: https://youtu.be/dQw4w9WgXcQ?si=ljjA_z81kHS3FmS8&t=43");
                            break;
                        }
                    }
                    System.out.println("Client disconnected");
                } catch (IOException e) {
                    System.err.println("Error handling client connection: " + e.getMessage());
                }
            }
        }
    }

    private static Map<String, String> parseParameters(String request) {
        if (!request.contains("?")) {
            return new HashMap<>();
        }
        Map<String, String> params = new HashMap<>();
        String[] parts = request.split("\\?")[1].split("&");
        for (String part : parts) {
            String[] keyValue = part.split("=");
            params.put(keyValue[0], keyValue[1]);
        }
        return params;
    }

    private static double calculate(double a, double b, String op) throws ArithmeticException {
        return switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            case "^" -> Math.pow(a, b);
            default -> throw new ArithmeticException("Unsupported operation");
        };
    }
}

//http://localhost:1111/calculate?a=10&b=5&op=+
//http://localhost:1111/main
//other be rickroll