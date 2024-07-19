import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame implements ActionListener 
{
    private TextField textField;
    private Button[] numberButtons;
    private Button[] operationButtons;
    private Button equalsButton;
    private Button clearButton;
    private double num1, num2, result;
    private char operation;

    public SimpleCalculator() 
    {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setLayout(new BorderLayout());

        textField = new TextField();
        textField.setEditable(false);
        add(textField, BorderLayout.NORTH);

        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        numberButtons = new Button[10];
        for (int i = 0; i < 10; i++) 
        {
            numberButtons[i] = new Button(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            buttonPanel.add(numberButtons[i]);
        }

        operationButtons = new Button[4];
        operationButtons[0] = new Button("+");
        operationButtons[1] = new Button("-");
        operationButtons[2] = new Button("*");
        operationButtons[3] = new Button("/");
        for (int i = 0; i < 4; i++) 
        {
            operationButtons[i].addActionListener(this);
            buttonPanel.add(operationButtons[i]);
        }

        equalsButton = new Button("=");
        equalsButton.addActionListener(this);
        buttonPanel.add(equalsButton);

        clearButton = new Button("C");
        clearButton.addActionListener(this);
        buttonPanel.add(clearButton);

        add(buttonPanel, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent windowEvent) 
            {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) 
    {
        String command = ae.getActionCommand();
        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') 
            textField.setText(textField.getText() + command);
        else if (command.charAt(0) == 'C') 
            textField.setText("");
         else if (command.charAt(0) == '=') 
        {
            num2 = Double.parseDouble(textField.getText());
            switch (operation) 
            {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0)
                        result = num1 / num2;
                    else
                        textField.setText("Cannot divide by zero");
                    break;
            }
            textField.setText(String.valueOf(result));
        } 
        else 
        {
            num1 = Double.parseDouble(textField.getText());
            operation = command.charAt(0);
            textField.setText("");
        }
    }

    public static void main(String[] args)
    {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setVisible(true);
    }
}
