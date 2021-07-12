package br.com.ifs.web1springboot.repository;

import br.com.ifs.web1springboot.model.Price;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends CrudRepository<Price,String> {
}
