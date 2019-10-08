package org.springframework.samples.petclinic.visit;

import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;
import org.springframework.samples.petclinic.model.BaseEntity;

import java.util.List;

/**
 * Repository class for <code>Visit</code> domain objects All method names are compliant with Spring
 * Data naming conventions so this interface can easily be extended for Spring Data. See:
 * https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods.query-creation
 */
public interface VisitRepository extends Repository<Visit, Integer> {
  /**
   * Save a <code>Visit</code> to the data store, either inserting or updating it.
   *
   * @param visit the <code>Visit</code> to save
   * @see BaseEntity#isNew
   */
  void save(Visit visit) throws DataAccessException;

  List<Visit> findByPetId(Integer petId);
}
