import java.util.List;

public class HistogramStatsDisplayer {
    public static void displayStats(List<HistogramElement> histogram){
        System.out.println("Total unique entries: " + histogram.size());
    }
}
