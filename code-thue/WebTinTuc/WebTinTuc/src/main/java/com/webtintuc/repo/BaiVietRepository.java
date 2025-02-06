package com.webtintuc.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.webtintuc.model.Account;
import com.webtintuc.model.BaiViet;




@Repository
public interface BaiVietRepository extends JpaRepository<BaiViet,Long>{
	@Query("select p from BaiViet p where p.title like %?1%")
	List<BaiViet> findByNameContaining(String name);
	@Query("select p from BaiViet p where p.account.id = ?1")
	List<BaiViet> findByNameAccount(Long id);
}

