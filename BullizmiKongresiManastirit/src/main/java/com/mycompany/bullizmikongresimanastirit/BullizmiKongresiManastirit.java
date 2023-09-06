/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bullizmikongresimanastirit;

/**
 *
 * @author lenovo
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BullizmiKongresiManastirit extends JFrame {
    private JTextField textField;
    private JButton checkButton;

    public BullizmiKongresiManastirit() {
        // Set up the JFrame
        setTitle("Bullizmi Kongresi Manastirit");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        // Create a label
        JLabel label = new JLabel("Shkruani nje tekst per te kontrolluar nese eshte bullizues ose jo:");
        add(label);

        // Create a text field
        textField = new JTextField(30);
        add(textField);

        // Create a button
        checkButton = new JButton("Kontrollo");
        add(checkButton);

        // Add an action listener to the button
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String teksti = textField.getText();
                if (containsBullying(teksti)) {
                    JOptionPane.showMessageDialog(null, "Teksti permban fjale bullizuese !");
                } else {
                    JOptionPane.showMessageDialog(null, "Teksti nuk permban fjale bullizuese !");
                }
            }
        });
    }

    public static boolean containsBullying(String text) {
        String[] bullyingKeywords = {"budall", "idiot", "debil", "cmendur", "shemtuar"};

        text = text.toLowerCase();

        for (String keyword : bullyingKeywords) {
            if (text.contains(keyword)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BullizmiKongresiManastirit().setVisible(true);
            }
        });
    }
}

