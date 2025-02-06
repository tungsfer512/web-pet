package WebThiTA.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
public class BaiThi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long examId;
	@Column(nullable = false)
	private String examName;
	@Column(columnDefinition="varchar2(1000)")
    private String content;
	

	@OneToMany(mappedBy = "exam", cascade = CascadeType.ALL)
	@JsonManagedReference
	private Set<Diem> listDiem;

	@OneToMany(mappedBy = "exam", cascade = CascadeType.ALL)
	@JsonManagedReference
	private Set<CauHoi> listQuestion;

    public BaiThi() {
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

    
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Set<Diem> getListDiem() {
        return listDiem;
    }

    public void setListDiem(Set<Diem> listDiem) {
        this.listDiem = listDiem;
    }

    public Set<CauHoi> getListQuestion() {
        return listQuestion;
    }

    public void setListQuestion(Set<CauHoi> listQuestion) {
        this.listQuestion = listQuestion;
    }

    
	
}