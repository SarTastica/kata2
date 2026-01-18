package software.ulpgc.kata2.io;
import software.ulpgc.kata2.model.Title;
import java.util.List;

public interface TitleDeserializer {
    List<Title> deserialize(List<String> lines);
}
