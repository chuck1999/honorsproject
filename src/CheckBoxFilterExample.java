import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class CheckBoxFilterExample extends JFrame {

    public CheckBoxFilterExample() {
        super("Checkbox with Filter Button");

        // Create a new JPanel to hold the checkbox and button
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Create a new JCheckBox
        JCheckBox checkBox = new JCheckBox("Filter");

        // Create a new JButton
        JButton button = new JButton("Apply Filter");

        // Add the checkbox and button to the panel
        panel.add(checkBox, BorderLayout.CENTER);
        panel.add(button, BorderLayout.SOUTH);

        // Add the panel to the frame
        add(panel);

        // Set the frame's size and visibility
        setSize(300, 300);
        setVisible(true);

        // Add an action listener to the button
        button.addActionListener(CheckBoxFilterExample::actionPerformed);
    }

    public static void main(String[] args) {
        new CheckBoxFilterExample();
    }

    private static void actionPerformed(ActionEvent e) {
        // TODO: Implement the filter logic here
    }
}