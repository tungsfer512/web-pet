package WebThiTA.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Diem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pointId;
	@Column(nullable = false)
	private String testDay;
    @Column(nullable = false)
    private Double point;
	
	

	@ManyToOne
	@JoinColumn(name="examId", nullable = false, referencedColumnName = "examId")
	@JsonBackReference
	private BaiThi exam;
	@ManyToOne
    @JoinColumn(name="userId", nullable = false, referencedColumnName = "userId")
    @JsonBackReference
    private User user;

    public Diem() {
        super();
    }


    


    





    


    public Double getPoint() {
        return point;
    }














    public Long getPointId() {
        return pointId;
    }





    public void setPoint(Double point) {
        this.point = point;
    }





    public void setPointId(Long pointId) {
        this.pointId = pointId;
    }


    public String getTestDay() {
        return testDay;
    }


    public void setTestDay(String testDay) {
        this.testDay = testDay;
    }


    public User getUser() {
        return user;
    }


    public void setUser(User user) {
        this.user = user;
    }


    public BaiThi getExam() {
        return exam;
    }


    public void setExam(BaiThi exam) {
        this.exam = exam;
    }
	
}
