package moastock.member.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String Name;
    private String password;
    private String nickName;
    private String email;

    @Builder
    public Member(String Name, String password, String nickName, String email) {
        this.Name = Name;
        this.password = password;
        this.nickName = nickName;
        this.email = email;
    }


}
