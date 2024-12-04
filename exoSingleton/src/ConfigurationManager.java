import java.util.Map;

public class ConfigurationManager {
    String hostname;
    String port;
    String nom;


    private static ConfigurationManager instance;


    private ConfigurationManager(String hostname, String port, String nom) {
        this.hostname = hostname;
        this.port = port;
        this.nom = nom;
    }

    public static synchronized ConfigurationManager getInstance(Map<String,String> map) {
        String hostname = map.get("db.host");
        String port = map.get("db.port");
        String nom = map.get("app.name");

        if (instance == null) {
            instance = new ConfigurationManager(hostname, port, nom);
        }
        return instance;
    }
}
