package models;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;

public abstract class BaseModel implements Serializable {

    private UUID id;

    private Long version;

    private OffsetDateTime lastChangeDate;

    public BaseModel() {
        id = UUID.randomUUID();
        version = 0L;
        lastChangeDate = OffsetDateTime.now();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public OffsetDateTime getLastChangeDate() {
        return lastChangeDate;
    }

    public void setLastChangeDate(OffsetDateTime lastChangeDate) {
        this.lastChangeDate = lastChangeDate;
    }
}
