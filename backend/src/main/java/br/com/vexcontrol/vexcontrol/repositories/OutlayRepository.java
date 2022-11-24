package br.com.vexcontrol.vexcontrol.repositories;

import br.com.vexcontrol.vexcontrol.entities.Outlay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutlayRepository extends JpaRepository<Outlay, Long> {

}
