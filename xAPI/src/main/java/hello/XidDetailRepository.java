package hello;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface XidDetailRepository extends CrudRepository<XidDetail, Long> {
    List<XidDetail> findBySubsetXidId(Integer subset_xid_id);
}
