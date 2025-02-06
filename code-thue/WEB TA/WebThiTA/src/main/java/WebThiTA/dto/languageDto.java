package WebThiTA.dto;

import java.io.Serializable;

public class languageDto implements Serializable {

    private String langFR;
    private String langTO;
    private String text;
    public languageDto(String langFR, String langTo,  String text) {
        this.langFR = langFR;
        this.text = text;
        this.langTO=langTo;
    }

    public languageDto( String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getLangFR() {
        return langFR;
    }
    public void setLangFR(String langFR) {
        this.langFR = langFR;
    }
    public String getLangTO() {
        return langTO;
    }
    public void setLangTO(String langTO) {
        this.langTO = langTO;
    }
    
}
