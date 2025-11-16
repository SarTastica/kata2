import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FromMapHistogramElementBuilder {
    public List<HistogramElement> buildHistogram(List<Title> titles){
        Map<String, Integer> map = new HashMap<>();

        for(Title title : titles){
            map.put(title.getName(), map.getOrDefault(title.getName(), 0) + 1);
        }

        List<HistogramElement> histogram = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            histogram.add(new HistogramElement(entry.getKey(), entry.getValue()));
        }
        return histogram;
    }
}
