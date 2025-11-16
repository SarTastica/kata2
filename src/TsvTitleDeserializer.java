import java.util.ArrayList;
import java.util.List;

public class TsvTitleDeserializer implements TitleDeserializer{
    @Override
    public List<Title> deserialize(List<String> lines) {
        List<Title> titles = new ArrayList<>();

        for(String line : lines){
            String[] fields ) line.split("\t");
            if(fields.length < 3) continue;
            titles.add(new Title(fields[0], fields[2]));
        }
        return titles;
    }
}
