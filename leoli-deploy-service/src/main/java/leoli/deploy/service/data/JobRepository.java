package leoli.deploy.service.data;

import leoli.deploy.service.bean.po.JobPo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

/**
 * Job dynamic load repository
 *
 * @author leoli
 * @date 2020/12/11
 */
@Repository
public interface JobRepository extends CrudRepository<JobPo, Long>, QueryByExampleExecutor<JobPo> {
}
