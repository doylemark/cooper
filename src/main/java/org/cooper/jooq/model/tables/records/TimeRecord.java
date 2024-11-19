/*
 * This file is generated by jOOQ.
 */
package org.cooper.jooq.model.tables.records;


import java.util.UUID;

import org.cooper.jooq.model.tables.Time;
import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimeRecord extends UpdatableRecordImpl<TimeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.time.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.time.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.time.simulation_id</code>.
     */
    public void setSimulationId(UUID value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.time.simulation_id</code>.
     */
    public UUID getSimulationId() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>public.time.simulation_time_seconds</code>.
     */
    public void setSimulationTimeSeconds(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.time.simulation_time_seconds</code>.
     */
    public Double getSimulationTimeSeconds() {
        return (Double) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TimeRecord
     */
    public TimeRecord() {
        super(Time.TIME);
    }

    /**
     * Create a detached, initialised TimeRecord
     */
    public TimeRecord(UUID id, UUID simulationId, Double simulationTimeSeconds) {
        super(Time.TIME);

        setId(id);
        setSimulationId(simulationId);
        setSimulationTimeSeconds(simulationTimeSeconds);
        resetChangedOnNotNull();
    }
}
