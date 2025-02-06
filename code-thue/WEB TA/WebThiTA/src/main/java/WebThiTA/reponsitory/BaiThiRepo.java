package WebThiTA.reponsitory;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import WebThiTA.model.BaiThi;

@Repository
public interface BaiThiRepo extends JpaRepository<BaiThi,Long>{
    
}