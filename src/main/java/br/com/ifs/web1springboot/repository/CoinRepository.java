package br.com.ifs.web1springboot.repository;

import br.com.ifs.web1springboot.model.Coin;
import org.springframework.data.repository.CrudRepository;

public interface CoinRepository extends CrudRepository<Coin,String> {
}
