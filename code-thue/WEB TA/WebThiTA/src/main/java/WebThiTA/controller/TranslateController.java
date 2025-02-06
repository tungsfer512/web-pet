package WebThiTA.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import WebThiTA.dto.languageDto;
import WebThiTA.constant.*;

@RestController
@RequestMapping("/translate")
@CrossOrigin(origins="*")
public class TranslateController {
    @PostMapping("/")
    public static languageDto Translate(@RequestBody languageDto lang) {
        System.out.println("json: "+" "+ lang.getText());
        String tranT=null;
        try {
            tranT = Translate.translate("en", "vi", lang.getText());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        lang.setText(tranT);
        return lang;
    }
    
//    @PostMapping("/")
//    public static languageDto Translate(S) {
//        System.out.println("json: "+" "+ lang.getText());
//        String tranT=null;
//        try {
//            tranT = Translate.translate("en", "vi", lang.getText());
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        lang.setText(tranT);
//        return lang;
//    }
    
}
