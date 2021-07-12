package br.com.ifs.web1springboot.repository;

import br.com.ifs.web1springboot.model.Binance;
import org.springframework.data.repository.CrudRepository;

public interface BinanceRepository extends CrudRepository<Binance,String> {
}
