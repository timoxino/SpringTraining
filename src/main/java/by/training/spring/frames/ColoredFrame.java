package by.training.spring.frames;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public abstract class ColoredFrame extends JFrame {

    private Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    @PostConstruct
    public void init() {
        setSize(400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void showOnRandomPlace() {
        Random random = new Random();
        setLocation(random.nextInt(800), random.nextInt(500));
        getContentPane().setBackground(getColor());
        this.repaint();
        this.validate();
    }

    abstract Color getColor();
}
