import javax.swing.*;
import java.awt.*;
public class TextFilterButtonExample extends JFrame {

    public TextFilterButtonExample() {
        super("Filter Button Example");

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JTextField textField = new JTextField();
        panel.add(textField, BorderLayout.NORTH);

        JButton filterButton = new JButton("Filter");
        filterButton.addActionListener(e -> {
            // Filter the data based on the text in the text field
        });
        panel.add(filterButton, BorderLayout.SOUTH);

        add(panel);

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextFilterButtonExample();
    }
}
