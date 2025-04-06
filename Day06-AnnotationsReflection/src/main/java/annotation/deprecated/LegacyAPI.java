package annotation.deprecated;

public class LegacyAPI {
    @Deprecated
    public void oldFeature(){
        System.out.println("This is a old feature");
    }
    public void newFeature(){
        System.out.println("This is a new featurea");
    }
}
