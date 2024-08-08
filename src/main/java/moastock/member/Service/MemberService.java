package moastock.member.Service;

import lombok.RequiredArgsConstructor;
import moastock.member.domain.Member;
import moastock.member.domain.MemberJpaRepository;
import moastock.member.dto.MemberRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {

    private final MemberJpaRepository memberJpaRepository;

    public void join(MemberRequest member) {
        memberJpaRepository.save(member.toMember());
    }
}
