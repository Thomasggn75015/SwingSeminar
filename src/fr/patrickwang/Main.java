package fr.patrickwang;

import fr.patrickwang.widgets.District;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("Ceci est le titre de ma fenêtre");
        frame.setSize(new Dimension(1024, 768));

        JPanel leftPanel = new JPanel();
        leftPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        leftPanel.setPreferredSize(new Dimension(500, 750));
        leftPanel.add(new JLabel("<html>Panneau de gauche, <br/>peut-être pour les cartes Alibis?</html>"));
        frame.add(leftPanel, BorderLayout.LINE_START);

        JPanel centerPanel = new JPanel();
        centerPanel.setBorder(BorderFactory.createLineBorder(Color.RED));
        centerPanel.setPreferredSize(new Dimension(750, 750));
        centerPanel.setLayout(new GridLayout(5, 5));
        for (int i = 0; i < 25; i++) {
            BufferedImage buttonIcon = ImageIO.read(new File(i % 8 + ".png"));
            District district = new District(new ImageIcon(buttonIcon));
            centerPanel.add(district);
        }
        frame.add(centerPanel, BorderLayout.CENTER);

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

