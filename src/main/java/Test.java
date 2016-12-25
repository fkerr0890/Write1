import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Test {
    public static void main(String[] args){
        new Test();
    }

    private Test(){
        test();
        //gBooks();
    }

    private void test(){
        Elements elements=new Elements();
        try {
            Document doc = Jsoup.connect("https://en.m.wikipedia.org/wiki/Andrew_Sledd").get();
            elements = doc.select("#mf-section-0 > p:nth-child(2)");
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(elements.first().text());


    }
}
