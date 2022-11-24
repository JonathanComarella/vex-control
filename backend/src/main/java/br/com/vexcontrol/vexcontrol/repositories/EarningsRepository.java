package br.com.vexcontrol.vexcontrol.repositories;

import br.com.vexcontrol.vexcontrol.entities.Earnings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EarningsRepository extends JpaRepository<Earnings, Long> {

}
