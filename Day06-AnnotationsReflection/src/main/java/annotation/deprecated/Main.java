package annotation.deprecated;

public class Main {
    public static void main(String[] args) {
        LegacyAPI legacyAPI = new LegacyAPI();
        legacyAPI.oldFeature();
        legacyAPI.newFeature();

    }
}
