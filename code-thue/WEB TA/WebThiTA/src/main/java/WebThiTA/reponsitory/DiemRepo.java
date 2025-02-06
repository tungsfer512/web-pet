package WebThiTA.reponsitory;




import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import WebThiTA.model.Diem;
import WebThiTA.model.User;

@Repository
public interface DiemRepo extends JpaRepository<Diem,Long>{
    @Query("select d from Diem d where d.user.username = ?1 and d.exam.examId= ?2")
    Optional<Diem> find2(String username, Long examId);
    @Query("select d from Diem d where d.user.username = ?1")
    List<Diem> findByUsername(String username);
}
