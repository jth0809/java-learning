package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import jakarta.transaction.Transactional;




@SpringBootTest
class RepoTest {

    @Autowired MemberRepo memberRepository;

    @Test
    @Transactional
    void testMember() throws Exception{
        //given
        Member member = new Member();
        member.setUsername("memberA");

        //when
        Long saveId = memberRepository.save(member);
        Member findMember = memberRepository.find(saveId);

        //then
        //assertThat(findMember.getId()).isEqualTo(member.getId());
        //assertThat(findMember.getUsername()).isEqualTo(member.getUsername());
        //assertThat(findMember).isEqualTo(member);
        System.out.println("findMember == member: " + (findMember == member));
    }

}
