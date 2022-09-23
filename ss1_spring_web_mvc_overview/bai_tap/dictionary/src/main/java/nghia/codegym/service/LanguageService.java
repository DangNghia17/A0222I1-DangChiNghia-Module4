package nghia.codegym.service;

import java.util.Map;

public interface LanguageService {
    Map<String,String> showLanguageMap();
    String translate(String english);
}
