import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class ArrayFilterExample extends JFrame {

    private final JTextField textField;
    private final JTable table;

    public ArrayFilterExample() {
        super("Array Filter");

        JPanel panel = new JPanel();
        textField = new JTextField(20);
        JButton button = new JButton("Filter");
        table = new JTable();

        panel.add(textField);
        panel.add(button);
        panel.add(table);

        add(panel);

        button.addActionListener(e -> {
            String filter = textField.getText();
            Object[][] data = new Object[][]{{1, "a"}, {2, "b"}, {3, "c"}};
            String[] columnNames = {"Number", "Letter"};
            table.setModel(new DefaultTableModel(data, columnNames));

            // Filter the table data
            for (int i = 0; i < table.getRowCount(); i++) {
                for (int j = 0; j < table.getColumnCount(); j++) {
                    if (!table.getValueAt(i, j).toString().contains(filter)) {
                        table.setValueAt("", i, j);
                    }
                }
            }
        });

        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ArrayFilterExample();
    }
}