package by.training.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Tsimafei_Shchytkavets
 */
@Component
public class FileWriterBean
{
    @Value("${fileLocation}")
    private String fileLocation;

    @PostConstruct
    public void createFile() throws IOException
    {
        System.out.println("File is creating...");
        final File file = new File(fileLocation);
        final FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("TEST");
        fileWriter.flush();
        System.out.println("File was created.");
    }
}
