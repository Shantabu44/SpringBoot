package com.flexon.springbootdemo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface JavaAccountRepository extends JpaRepository<JavaAccount,Long> {

}
