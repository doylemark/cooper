/*
 * This file is generated by jOOQ.
 */
package org.cooper.jooq.model.tables.records;


import java.util.UUID;

import org.cooper.jooq.model.tables.CloudletMetric;
import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CloudletMetricRecord extends UpdatableRecordImpl<CloudletMetricRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.cloudlet_metric.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.cloudlet_metric.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.cloudlet_metric.cloudlet_id</code>.
     */
    public void setCloudletId(UUID value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.cloudlet_metric.cloudlet_id</code>.
     */
    public UUID getCloudletId() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>public.cloudlet_metric.simulation_time_seconds</code>.
     */
    public void setSimulationTimeSeconds(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.cloudlet_metric.simulation_time_seconds</code>.
     */
    public Double getSimulationTimeSeconds() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>public.cloudlet_metric.cpu_utilization</code>.
     */
    public void setCpuUtilization(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.cloudlet_metric.cpu_utilization</code>.
     */
    public Double getCpuUtilization() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>public.cloudlet_metric.ram_utilization</code>.
     */
    public void setRamUtilization(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.cloudlet_metric.ram_utilization</code>.
     */
    public Double getRamUtilization() {
        return (Double) get(4);
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
     * Create a detached CloudletMetricRecord
     */
    public CloudletMetricRecord() {
        super(CloudletMetric.CLOUDLET_METRIC);
    }

    /**
     * Create a detached, initialised CloudletMetricRecord
     */
    public CloudletMetricRecord(UUID id, UUID cloudletId, Double simulationTimeSeconds, Double cpuUtilization, Double ramUtilization) {
        super(CloudletMetric.CLOUDLET_METRIC);

        setId(id);
        setCloudletId(cloudletId);
        setSimulationTimeSeconds(simulationTimeSeconds);
        setCpuUtilization(cpuUtilization);
        setRamUtilization(ramUtilization);
        resetChangedOnNotNull();
    }
}
