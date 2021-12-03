package com.ams.data.repositories;

//import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ams.data.entities.Provider;

@Repository
public interface ProviderRepository extends CrudRepository<Provider, Long> {
}
