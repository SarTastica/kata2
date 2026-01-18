package software.ulpgc.kata2;

import software.ulpgc.kata2.HistogramElement;

import java.util.List;

public class HistogramStatsDisplayer {
    public static void displayStats(List<HistogramElement> histogram){
        System.out.println("Total unique entries: " + histogram.size());
    }
}
