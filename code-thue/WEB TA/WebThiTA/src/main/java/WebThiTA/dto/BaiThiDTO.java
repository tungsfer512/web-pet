package WebThiTA.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

public class BaiThiDTO {
    private Long examId;
	private String examName;
	private int numberOfQuestions;
	private String content;
	private ArrayList<CauHoiDTO> listCauHoi;

    public BaiThiDTO() {
        super();
    }

    public Long getExamId() {
        return examId;
    }

    public void setExamId(Long examId) {
        this.examId = examId;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public int getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setNumberOfQuestions(int numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }

    public ArrayList<CauHoiDTO> getListCauHoi() {
        return listCauHoi;
    }

    public void setListCauHoi(ArrayList<CauHoiDTO> listCauHoi) {
        this.listCauHoi = listCauHoi;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    

    

    

    
	
}