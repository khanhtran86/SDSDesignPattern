package com.samsung.firstspringboot.Models.Repository;

import com.samsung.firstspringboot.Models.DataModels.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
Repository - Là class tương tác với db, thông qua Entity.
- Sử dụng @Repository để tạo repository bean.
 */

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
