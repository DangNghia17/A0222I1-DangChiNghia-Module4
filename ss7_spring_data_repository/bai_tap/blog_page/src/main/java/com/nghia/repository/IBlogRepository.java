package com.nghia.repository;

import com.nghia.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface IBlogRepository extends JpaRepository<Blog,Integer> {
    @Query(value = "select * from blog where name like :name " , nativeQuery = true)
    Page<Blog> searchByName(@Param("name") String name , Pageable pageable );

}
