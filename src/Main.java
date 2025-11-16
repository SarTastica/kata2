import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "./title.basics.tsv";
        TitleLoader loader = new FileTitleLoader(filePath, new TsvTitleDeserializer());
        List<Title> titles = loader.loadTitle();

        FromMapHistogramElementBuilder builder = new FromMapHistogramElementBuilder();
        List<HistogramElement> histogram = builder.buildHistogram(titles);

        HistogramStatsDisplayer.displayStats(histogram);
        for(HistogramElement he : histogram){
            System.out.println(he.getKey() + " -> " + he.getValue());
        }
    }
}
