package com.sds.back_end.repository;

import com.sds.back_end.repository.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long>{
    
}
