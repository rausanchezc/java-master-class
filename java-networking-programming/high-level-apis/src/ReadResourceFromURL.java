import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadResourceFromURL {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.org");
            BufferedReader inputStreamReader = new BufferedReader( new InputStreamReader(url.openStream()));
            String line = "";
            while (line != null) {
                line = inputStreamReader.readLine();
                System.out.println(line);
            }
            inputStreamReader.close();

        } catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
