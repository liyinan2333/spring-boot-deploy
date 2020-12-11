package leoli.deploy.service.data;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.Optional;

/**
 * One Service Demo
 *
 * @author leoli
 * @date 2020/12/11
 */
public class UserInfoService implements JpaSpecificationExecutor {


    @Override
    public Optional findOne(Specification specification) {
        return Optional.empty();
    }

    @Override
    public List findAll(Specification specification) {
        return null;
    }

    @Override
    public Page findAll(Specification specification, Pageable pageable) {
        return null;
    }

    @Override
    public List findAll(Specification specification, Sort sort) {
        return null;
    }

    @Override
    public long count(Specification specification) {
        return 0;
    }
}
