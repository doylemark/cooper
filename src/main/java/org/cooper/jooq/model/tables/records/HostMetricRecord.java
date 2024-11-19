/*
 * This file is generated by jOOQ.
 */
package org.cooper.jooq.model.tables.records;


import java.util.UUID;

import org.cooper.jooq.model.tables.HostMetric;
import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HostMetricRecord extends UpdatableRecordImpl<HostMetricRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.host_metric.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.host_metric.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.host_metric.host_id</code>.
     */
    public void setHostId(UUID value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.host_metric.host_id</code>.
     */
    public UUID getHostId() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>public.host_metric.simulation_time_seconds</code>.
     */
    public void setSimulationTimeSeconds(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.host_metric.simulation_time_seconds</code>.
     */
    public Double getSimulationTimeSeconds() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>public.host_metric.cpu_utilization</code>.
     */
    public void setCpuUtilization(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.host_metric.cpu_utilization</code>.
     */
    public Double getCpuUtilization() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>public.host_metric.ram_usage_mb</code>.
     */
    public void setRamUsageMb(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.host_metric.ram_usage_mb</code>.
     */
    public Long getRamUsageMb() {
        return (Long) get(4);
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
     * Create a detached HostMetricRecord
     */
    public HostMetricRecord() {
        super(HostMetric.HOST_METRIC);
    }

    /**
     * Create a detached, initialised HostMetricRecord
     */
    public HostMetricRecord(UUID id, UUID hostId, Double simulationTimeSeconds, Double cpuUtilization, Long ramUsageMb) {
        super(HostMetric.HOST_METRIC);

        setId(id);
        setHostId(hostId);
        setSimulationTimeSeconds(simulationTimeSeconds);
        setCpuUtilization(cpuUtilization);
        setRamUsageMb(ramUsageMb);
        resetChangedOnNotNull();
    }
}
