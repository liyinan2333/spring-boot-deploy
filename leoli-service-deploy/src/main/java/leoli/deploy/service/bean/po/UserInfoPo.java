package leoli.deploy.service.bean.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

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

    private @Id @GeneratedValue @Column(name = "USR_CD") long userCode;

    private @Column(name = "USR_NM") String userName;

    private @Column(name = "USR_AGE") int userAge;

    private @Column(name = "USR_SEX") int userSex;

    private @Column(name = "USR_PHONE") int userPhone;

    private @Column(name = "USR_LOCAL") int userLocation;

}
