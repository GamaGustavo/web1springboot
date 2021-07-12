package br.com.ifs.web1springboot.repository.binance;

import br.com.ifs.web1springboot.model.binance.Binance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BinanceRepository extends CrudRepository<Binance,String> {
}
