package leoli.deploy.service.bean.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

/**
 * User info persistence object
 *
 * @author leoli
 * @date 2020/12/11
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USER_INFO")
public class UserInfoPo {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private @Column(name = "USR_ID") Long usrId;

    private @Column(name = "USR_NM") String usrNm;

    private @Column(name = "USR_AGE") Integer usrAge;

    private @Column(name = "USR_SEX") Integer usrSex;

    private @Column(name = "USR_PHONE") String usrPhone;

    private @Column(name = "USR_LOCAL") String usrLocation;

}
