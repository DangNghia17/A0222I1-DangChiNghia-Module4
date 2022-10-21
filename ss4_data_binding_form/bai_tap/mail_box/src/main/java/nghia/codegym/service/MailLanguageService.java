package nghia.codegym.service;

import nghia.codegym.repository.IMailLanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MailLanguageService implements IMailLanguageService {
    @Autowired
    IMailLanguageRepository mailLanguageRepository;

    @Override
    public List<String> listAllLaguage() {
        return mailLanguageRepository.listAllLanguage();
    }
}
