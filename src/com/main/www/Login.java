package com.main.www;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    private JLabel titleLabel;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField = new JPasswordField();

    private JButton loginButton;


    public Login() {
        // Définir les propriétés de la fenêtre
        this.setTitle("Connexion");
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.getContentPane().setBackground(new Color(25, 118, 210));
        this.setResizable(false);

        // Créer le titre de la fenêtre
        titleLabel = new JLabel("Connexion", JLabel.CENTER);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        titleLabel.setForeground(Color.WHITE);
        this.add(titleLabel, BorderLayout.NORTH);

        // Créer les champs de saisie pour le nom d'utilisateur et le mot de passe
        JPanel inputPanel = new JPanel(new GridLayout(2, 1, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        usernameLabel = new JLabel("Nom d'utilisateur");
        usernameLabel.setForeground(Color.BLACK);
        usernameLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        usernameField = new JTextField();
        usernameField.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        usernameField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
        passwordLabel = new JLabel("Mot de passe");
        passwordLabel.setForeground(Color.BLACK);
        usernameField.setPreferredSize(new Dimension(200, 30));
        passwordField.setPreferredSize(new Dimension(200, 30));

        passwordLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        passwordField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
        inputPanel.add(usernameLabel);
        inputPanel.add(usernameField);
        inputPanel.add(passwordLabel);
        inputPanel.add(passwordField);
        this.add(inputPanel, BorderLayout.CENTER);

        // Créer le bouton de connexion
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        loginButton = new JButton("Connexion");
        loginButton.setPreferredSize(new Dimension(120, 40));
        loginButton.setFont(new Font("Segoe UI", Font.BOLD, 16));
        loginButton.setBackground(new Color(0, 150, 136));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        loginButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
        loginButton.setOpaque(true);
        loginButton.setBorderPainted(false);
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButton.setBackground(new Color(0, 120, 116));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButton.setBackground(new Color(0, 150, 136));
            }
        });
        buttonPanel.add(loginButton);
        this.add(buttonPanel, BorderLayout.SOUTH);

        // Afficher la fenêtre
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }

}
