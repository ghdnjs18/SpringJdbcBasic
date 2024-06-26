package study.jdbc.repository;

import study.jdbc.domain.Member;

public interface MemberRepositoryEx {
    Member save(Member member);

    Member findById(String memberId);

    void update(String memberId, int money);

    void delete(String memberId);
}
