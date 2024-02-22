import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CheckBoxWithFilterButton extends JFrame {

    public CheckBoxWithFilterButton() {
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
        panel.add(button, BorderLayout.EAST);

        // Add the panel to the frame
        add(panel);

        // Set the frame's size and visibility
        setSize(300, 300);
        setVisible(true);

        // Add an action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = null;
                if (source instanceof JButton) {
                    JButton button = (JButton) source;
                    if (button.isSelected()) {
                        // Get the text of the button.
                        String text = button.getText();

                // TODO: Implement the filter logic here
            }
        };
    }

    public void main(String[] args) {
        new CheckBoxWithFilterButton();
    }
}
)
        ;
    }
}