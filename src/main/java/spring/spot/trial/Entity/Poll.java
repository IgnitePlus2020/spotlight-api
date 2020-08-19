package spring.spot.trial.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Poll implements Serializable {
    @Generated()
    @PrimaryKeyColumn(name = "poll_id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private UUID pollId;

    @Column("poll_name")
    private String pollName;

    @Column
    private String description;
}