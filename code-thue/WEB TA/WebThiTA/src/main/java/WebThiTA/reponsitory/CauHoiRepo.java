package WebThiTA.reponsitory;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import WebThiTA.model.CauHoi;

@Repository
public interface CauHoiRepo extends JpaRepository<CauHoi,Long>{
    
    @Query("select ch from CauHoi ch where ch.exam.examId = ?1")
    List<CauHoi> findByExam(Long examId);
    
}
