package study.jdbc.repository;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import study.jdbc.domain.Member;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class MemberRepositoryVOTest {

    MemberRepositoryVO repository = new MemberRepositoryVO();

    @Test
    public void crud() throws Exception {
        // save
        Member member = new Member("memberV2", 10000);
        repository.save(member);

        // findById
        Member findMember = repository.findById(member.getMemberId());
        log.info("findmember = {}", findMember);
        assertEquals(findMember, member);

        // update: money: 10000 -> 20000
        repository.update(member.getMemberId(), 20000);
        Member updateMember = repository.findById(member.getMemberId());
        log.info("updateMember = {}", updateMember);
        assertEquals(updateMember.getMoney(), 20000);

        // delete
        repository.delete(member.getMemberId());
        assertThrows(NoSuchElementException.class, () -> repository.findById(member.getMemberId()));
    }
}