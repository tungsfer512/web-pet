package WebThiTA.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@Table(name="Accounts")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
	@Column(nullable = false)
	private String Fullname;
	@Column(nullable = false)
	private String username;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private int role;
	@Column(nullable = false)
	private double diemTB;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	@JsonManagedReference
	private Set<Diem> diem;

    public User() {
    }
    public User(String email, String password, String fullname) {
        this.Fullname=fullname;
        this.username=email;
        this.password=password;
        this.diemTB=0.0;
        this.role=1;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String fullname) {
        Fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public Set<Diem> getDiem() {
        return diem;
    }

    public void setDiem(Set<Diem> diem) {
        this.diem = diem;
    }
	
}