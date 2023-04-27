package io.lombocska.postmanautomatedtestwithgithubactionexample.web;

import io.lombocska.postmanautomatedtestwithgithubactionexample.domain.Country;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "countries", path = "countries")
public interface CountryResource extends PagingAndSortingRepository<Country, Long> {
    List<Country> findByName(@Param("name") String name);
}
