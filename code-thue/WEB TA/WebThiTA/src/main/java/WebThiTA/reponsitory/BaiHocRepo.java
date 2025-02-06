package WebThiTA.reponsitory;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import WebThiTA.model.BaiHoc;

@Repository
public interface BaiHocRepo extends JpaRepository<BaiHoc,Long>{
    
    
    
}
