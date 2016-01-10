package kata3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MailListReader dominios = new MailListReader("emailsfilev1.txt");
        ArrayList<String> domis = dominios.getDominiosArray();
        Histogram<String> histograma = DominiosHistogramBuilder.execute(domis);
        HistogramDisplay histo = new HistogramDisplay(histograma);
        histo.execute();
    }
}
