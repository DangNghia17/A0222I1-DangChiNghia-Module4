package nghia.codegym.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class LanguageRepoImpl implements LanguageRepo {
    private static Map<String, String> languageMap = new HashMap<>();

    static {
        languageMap.put("one", "so mot");
        languageMap.put("two", "so hai");
        languageMap.put("three", "so ba");
        languageMap.put("four", "so bon");
        languageMap.put("five", "so nam");
        languageMap.put("six", "so sau");
        languageMap.put("seven", "so bay");
        languageMap.put("eight", "so tam");
        languageMap.put("nine", "so chin");
        languageMap.put("ten", "so muoi");
    }

    @Override
    public Map<String, String> showLanguageMap() {
        return languageMap;
    }

    @Override
    public String translate(String english) {
        if (languageMap.containsKey(english)) {
            return languageMap.get(english);
        } else {
            return "Not found the word in dictionary !!";
        }
    }
}
