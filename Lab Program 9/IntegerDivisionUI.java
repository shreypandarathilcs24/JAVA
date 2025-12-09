import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IntegerDivisionUI extends JFrame {

    private JTextField num1Field, num2Field, resultField;
    private JButton divideButton;

    public IntegerDivisionUI() {
        setTitle("Integer Division");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Layout
        setLayout(new GridLayout(4, 2, 5, 5));

        add(new JLabel("Num1:"));
        num1Field = new JTextField();
        add(num1Field);

        add(new JLabel("Num2:"));
        num2Field = new JTextField();
        add(num2Field);

        add(new JLabel("Result:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);

        divideButton = new JButton("Divide");
        add(divideButton);

        // Action listener
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Parse integers (may throw NumberFormatException)
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());

                    // Perform division (may throw ArithmeticException)
                    int result = num1 / num2;

                    // Display result
                    resultField.setText(Integer.toString(result));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Please enter valid integers!",
                            "Number Format Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Division by zero is not allowed!",
                            "Arithmetic Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new IntegerDivisionUI().setVisible(true);
        });
    }
}
