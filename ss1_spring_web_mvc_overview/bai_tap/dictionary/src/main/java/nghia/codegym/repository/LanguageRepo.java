package nghia.codegym.repository;

import java.util.Map;

public interface LanguageRepo {
    Map<String, String> showLanguageMap();
    String translate(String english);

}
