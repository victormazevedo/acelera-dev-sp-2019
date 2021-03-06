package org.acelera.saopaulo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "times", path = "times")
public interface TimeRepository extends CrudRepository<Time, Long> {
}
