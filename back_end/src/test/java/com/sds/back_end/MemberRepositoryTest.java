package com.sds.back_end;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sds.back_end.repository.MemberRepository;
import com.sds.back_end.repository.entity.Member;

@SpringBootTest
public class MemberRepositoryTest {

    @Autowired 
    private MemberRepository memberRepository;

    @Test
    public void crudTest(){
        Member  member = Member.builder()
            .id("111")
            .name("dddd")
            .phoneNumber("000")
            .build();

        //create test
        //memberRepository.save(member);

        //get test
        //Member foundMember = memberRepository.findById(1L).get();
    }
}
