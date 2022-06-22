package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ValueProvider {

    private final Properties properties;

    public ValueProvider() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/main/resources/application.properties");
        properties = new Properties();
        properties.load(fileInputStream);
    }

       public String getUrlFromProperties(){
       return properties.getProperty("url");
}



}
