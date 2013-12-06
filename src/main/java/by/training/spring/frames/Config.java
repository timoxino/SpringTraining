package by.training.spring.frames;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.awt.*;
import java.util.Random;

@Configuration
@ComponentScan(basePackages = {"colors"})
public class Config {

    @Bean
    public ColoredFrame frame() {
        ColoredFrame coloredFrame = new ColoredFrame()
        {
            @Override
            Color getColor()
            {
                return randomColor();
            }
        };
        coloredFrame.setColor(randomColor());
        return coloredFrame;
    }

    @Bean
    @Scope("prototype")
    public Color randomColor() {
        Random random = new Random();
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }
}
