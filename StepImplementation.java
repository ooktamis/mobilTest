import com.thoughtworks.gauge.Step;

import java.net.MalformedURLException;
import java.net.URL;

public class StepImplementation extends base {


    @Step("Android url <url> ekle")
    public void androidUrl(String url) {
        try {
            urlBase(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Step("<sayi1> ile <sayi2> topla")
    public void toplama(String sayi1, String sayi2) throws InterruptedException {

        calculator(sayi1,sayi2);
    }
}
