package by.training.spring.color;

import org.springframework.beans.factory.annotation.Autowired;

import java.awt.*;

import javax.annotation.PostConstruct;
import javax.swing.*;

/**
 * @author Tsimafei_Shchytkavets
 */
@org.springframework.stereotype.Component
public class ColorFrameNew extends JFrame
{
    @Autowired
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
