import lombok.Data;

import java.util.List;

@Data
@Getter
public class ChatResponseBlaBla {
    private List<?> choices;
    private String nothing;

    @Data
    public static class Choice {
        private Message message;
    }
}
