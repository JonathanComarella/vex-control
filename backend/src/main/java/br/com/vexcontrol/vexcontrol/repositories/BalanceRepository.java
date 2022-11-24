package br.com.vexcontrol.vexcontrol.repositories;

import br.com.vexcontrol.vexcontrol.entities.Balance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BalanceRepository extends JpaRepository<Balance, Long> {

}
