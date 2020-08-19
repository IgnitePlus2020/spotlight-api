package spring.spot.trial.Repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;
import spring.spot.trial.Entity.Nominations;
import java.util.List;
import java.util.UUID;

@EnableCassandraRepositories
public interface NominationsRepository extends CassandraRepository<Nominations,String> {
    List<Nominations> findByPollId(UUID pollId);
    Nominations findByPollIdAndNominationId(UUID pollId,UUID nominationId);
    Nominations save(Nominations nominations);

}