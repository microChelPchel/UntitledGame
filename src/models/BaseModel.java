package models;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;

public abstract class BaseModel implements Serializable {

    private UUID id;

    private Long version;

    private OffsetDateTime lastChangeDate;

}
