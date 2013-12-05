package by.training.spring.color;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

/**
 * @author Tsimafei_Shchytkavets
 */
public class ColorFrame extends JFrame
{
    private Color color;

    public void setColor(Color color)
    {
        this.color = color;
    }

    @PostConstruct
    public void init()
    {
        setSize(400,400);
        getContentPane().setBackground(color);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
