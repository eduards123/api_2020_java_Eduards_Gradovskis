package helpers;

import domain.Space;
import clients.ClickupClient;

public class SpaceHelper {
    private static final ClickupClient CLICKUP_CLIENT = new ClickupClient();

    public static Space fetchFolder()
    {
        return CLICKUP_CLIENT.fetchFolder()
                .extract()
                .response()
                .as(Space.class);
    }

    public static Space createClickupFolder()
    {
        return CLICKUP_CLIENT.createClickupFolder()
                .extract()
                .response()
                .as(Space.class);
    }
}