package nghia.codegym.service;

import nghia.codegym.repository.LanguageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class LanguageServiceImpl implements LanguageService{
    @Autowired
    private LanguageRepo languageRepo;

    @Override
    public Map<String, String> showLanguageMap() {
        return languageRepo.showLanguageMap();
    }

    @Override
    public String translate(String english) {
        return languageRepo.translate(english);
    }
}
