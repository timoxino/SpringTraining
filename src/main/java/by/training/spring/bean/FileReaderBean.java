package by.training.spring.bean;

import java.io.File;
import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * @author Tsimafei_Shchytkavets
 */
@Component
@DependsOn("fileWriterBean")
public class FileReaderBean
{
    @Value("${fileLocation}")
    private String fileLocation;

    @PostConstruct
    public void readFile() throws IOException
    {
        final File file = new File(fileLocation);
        System.out.println("File length is " + file.length());
    }
}
