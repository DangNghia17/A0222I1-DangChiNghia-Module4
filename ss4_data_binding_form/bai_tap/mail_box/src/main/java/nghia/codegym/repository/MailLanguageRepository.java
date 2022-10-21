package nghia.codegym.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class MailLanguageRepository implements IMailLanguageRepository{
   static List<String> listAllLanguage = new ArrayList<>();
   static {
       listAllLanguage.add("English");
       listAllLanguage.add("Vietnamese");
       listAllLanguage.add("Japanese");
       listAllLanguage.add("Chinese");
   }
    @Override
    public List<String> listAllLanguage() {
        return listAllLanguage;
    }
}
