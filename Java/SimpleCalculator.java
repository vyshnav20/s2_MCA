import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame implements ActionListener {
    TextField tf;
    String operator;
    double num1, num2;

    SimpleCalculator() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setLayout(new BorderLayout());

        tf = new TextField();
        tf.setEditable(false);
        add(tf, BorderLayout.NORTH);

        Panel panel = new Panel();
        panel.setLayout(new GridLayout(4, 4));

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            Button button = new Button(label);
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        if (command.equals("=")) {
            num2 = Double.parseDouble(tf.getText());
            double result = calculate(num1, num2, operator);
            tf.setText(String.valueOf(result));
        } else if (Character.isDigit(command.charAt(0)) || command.equals(".")) {
            tf.setText(tf.getText() + command);
        } else {
            operator = command;
            num1 = Double.parseDouble(tf.getText());
            tf.setText("");
        }
    }

    private double calculate(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0)
                    return num1 / num2;
                else
                    return Double.NaN;
            default:
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
