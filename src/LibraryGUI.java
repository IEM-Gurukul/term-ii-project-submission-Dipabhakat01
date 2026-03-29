package src;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class LibraryGUI extends JFrame {
    private ArrayList<LibraryItem> inventory = new ArrayList<>();
    private DefaultTableModel tableModel;
    private JTextField idField, titleField, authorField;

    public LibraryGUI() {
        setTitle("OOP Library Management System");
        setSize(700, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(15, 15));

        JPanel inputPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        inputPanel.add(new JLabel("Item ID:")); idField = new JTextField(); inputPanel.add(idField);
        inputPanel.add(new JLabel("Book Title:")); titleField = new JTextField(); inputPanel.add(titleField);
        inputPanel.add(new JLabel("Author:")); authorField = new JTextField(); inputPanel.add(authorField);

        JButton addButton = new JButton("Add Item");
        addButton.setBackground(new Color(46, 204, 113)); // Green button
        addButton.setForeground(Color.WHITE);
        inputPanel.add(addButton);
        
        add(inputPanel, BorderLayout.NORTH);

        String[] columns = {"ID", "Title", "Details/Type"};
        tableModel = new DefaultTableModel(columns, 0);
        JTable table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        addButton.addActionListener(e -> {
            String id = idField.getText();
            String title = titleField.getText();
            String author = authorField.getText();

            if (id.isEmpty() || title.isEmpty()) {
                JOptionPane.showMessageDialog(this, "ID and Title are required!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Book newBook = new Book(id, title, author);
            inventory.add(newBook);
            tableModel.addRow(new Object[]{newBook.getId(), newBook.getTitle(), newBook.getType()});

            idField.setText(""); titleField.setText(""); authorField.setText("");
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LibraryGUI().setVisible(true));
    }
}
