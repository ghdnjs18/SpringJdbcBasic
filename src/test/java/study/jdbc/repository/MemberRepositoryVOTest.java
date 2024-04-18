package study.jdbc.repository;

import org.junit.jupiter.api.Test;
import study.jdbc.domain.Member;

import static org.junit.jupiter.api.Assertions.*;

class MemberRepositoryVOTest {

    MemberRepositoryVO repository = new MemberRepositoryVO();

    @Test
    public void crud() throws Exception {
        // save
        Member member = new Member("memberVO", 10000);
        repository.save(member);

    }
}