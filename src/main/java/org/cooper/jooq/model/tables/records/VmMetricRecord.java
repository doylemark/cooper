/*
 * This file is generated by jOOQ.
 */
package org.cooper.jooq.model.tables.records;


import java.util.UUID;

import org.cooper.jooq.model.tables.VmMetric;
import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VmMetricRecord extends UpdatableRecordImpl<VmMetricRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.vm_metric.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.vm_metric.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.vm_metric.vm_id</code>.
     */
    public void setVmId(UUID value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.vm_metric.vm_id</code>.
     */
    public UUID getVmId() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>public.vm_metric.simulation_time_seconds</code>.
     */
    public void setSimulationTimeSeconds(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.vm_metric.simulation_time_seconds</code>.
     */
    public Double getSimulationTimeSeconds() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>public.vm_metric.ram_allocated_mb</code>.
     */
    public void setRamAllocatedMb(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.vm_metric.ram_allocated_mb</code>.
     */
    public Long getRamAllocatedMb() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>public.vm_metric.ram_available_mb</code>.
     */
    public void setRamAvailableMb(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.vm_metric.ram_available_mb</code>.
     */
    public Long getRamAvailableMb() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.vm_metric.cpu_utilization</code>.
     */
    public void setCpuUtilization(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.vm_metric.cpu_utilization</code>.
     */
    public Double getCpuUtilization() {
        return (Double) get(5);
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
     * Create a detached VmMetricRecord
     */
    public VmMetricRecord() {
        super(VmMetric.VM_METRIC);
    }

    /**
     * Create a detached, initialised VmMetricRecord
     */
    public VmMetricRecord(UUID id, UUID vmId, Double simulationTimeSeconds, Long ramAllocatedMb, Long ramAvailableMb, Double cpuUtilization) {
        super(VmMetric.VM_METRIC);

        setId(id);
        setVmId(vmId);
        setSimulationTimeSeconds(simulationTimeSeconds);
        setRamAllocatedMb(ramAllocatedMb);
        setRamAvailableMb(ramAvailableMb);
        setCpuUtilization(cpuUtilization);
        resetChangedOnNotNull();
    }
}
