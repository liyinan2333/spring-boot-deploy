package leoli.deploy.service.data;

import leoli.deploy.service.bean.po.UserInfoPo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

/**
 * One Service Demo
 *
 * @author leoli
 * @date 2020/12/11
 */
@Repository
public interface UserInfoRepository extends CrudRepository<UserInfoPo, Long>, QueryByExampleExecutor<UserInfoPo> {
}
