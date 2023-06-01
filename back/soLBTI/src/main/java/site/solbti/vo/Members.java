package site.solbti.vo;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="members")
@SequenceGenerator(
        name="MEMBERS_SEQ_GEN",
        sequenceName="MEMBERS_SEQ",
        initialValue=1,
        allocationSize=1
)
public class Members {
    @Id
    @GeneratedValue(
            strategy=GenerationType.SEQUENCE,
            generator="MEMBERS_SEQ_GEN"
    )
    private long memCode;
    @Column(nullable=false)
    private String memId;
    @Column(nullable=false)
    private String memPwd;
    @Column(nullable=false)
    private String memName;
    @Column(nullable=false)
    private String memEmail;
    @Column(nullable=false)
    private String memAddr;
    @Column(nullable=false)
    private String memPhone;
    @Column(nullable=false)
    @ColumnDefault("0.0")
    private double memPoint;
    @CreationTimestamp
    private Timestamp created;
}
