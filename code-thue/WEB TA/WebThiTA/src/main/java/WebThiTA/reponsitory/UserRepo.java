package WebThiTA.reponsitory;



import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import WebThiTA.model.BaiHoc;
import WebThiTA.model.User;

@Repository
public interface UserRepo extends JpaRepository<User,Long>{
    @Query("select u from User u where u.username = ?1")
    Optional<User> findByUsername(String username);
}
