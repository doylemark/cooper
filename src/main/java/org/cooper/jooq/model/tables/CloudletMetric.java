/*
 * This file is generated by jOOQ.
 */
package org.cooper.jooq.model.tables;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import org.cooper.jooq.model.Keys;
import org.cooper.jooq.model.Public;
import org.cooper.jooq.model.tables.Cloudlet.CloudletPath;
import org.cooper.jooq.model.tables.records.CloudletMetricRecord;
import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CloudletMetric extends TableImpl<CloudletMetricRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.cloudlet_metric</code>
     */
    public static final CloudletMetric CLOUDLET_METRIC = new CloudletMetric();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CloudletMetricRecord> getRecordType() {
        return CloudletMetricRecord.class;
    }

    /**
     * The column <code>public.cloudlet_metric.id</code>.
     */
    public final TableField<CloudletMetricRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false).defaultValue(DSL.field(DSL.raw("uuid_generate_v4()"), SQLDataType.UUID)), this, "");

    /**
     * The column <code>public.cloudlet_metric.cloudlet_id</code>.
     */
    public final TableField<CloudletMetricRecord, UUID> CLOUDLET_ID = createField(DSL.name("cloudlet_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.cloudlet_metric.simulation_time_seconds</code>.
     */
    public final TableField<CloudletMetricRecord, Double> SIMULATION_TIME_SECONDS = createField(DSL.name("simulation_time_seconds"), SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>public.cloudlet_metric.cpu_utilization</code>.
     */
    public final TableField<CloudletMetricRecord, Double> CPU_UTILIZATION = createField(DSL.name("cpu_utilization"), SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>public.cloudlet_metric.ram_utilization</code>.
     */
    public final TableField<CloudletMetricRecord, Double> RAM_UTILIZATION = createField(DSL.name("ram_utilization"), SQLDataType.DOUBLE.nullable(false), this, "");

    private CloudletMetric(Name alias, Table<CloudletMetricRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private CloudletMetric(Name alias, Table<CloudletMetricRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public.cloudlet_metric</code> table reference
     */
    public CloudletMetric(String alias) {
        this(DSL.name(alias), CLOUDLET_METRIC);
    }

    /**
     * Create an aliased <code>public.cloudlet_metric</code> table reference
     */
    public CloudletMetric(Name alias) {
        this(alias, CLOUDLET_METRIC);
    }

    /**
     * Create a <code>public.cloudlet_metric</code> table reference
     */
    public CloudletMetric() {
        this(DSL.name("cloudlet_metric"), null);
    }

    public <O extends Record> CloudletMetric(Table<O> path, ForeignKey<O, CloudletMetricRecord> childPath, InverseForeignKey<O, CloudletMetricRecord> parentPath) {
        super(path, childPath, parentPath, CLOUDLET_METRIC);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class CloudletMetricPath extends CloudletMetric implements Path<CloudletMetricRecord> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> CloudletMetricPath(Table<O> path, ForeignKey<O, CloudletMetricRecord> childPath, InverseForeignKey<O, CloudletMetricRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private CloudletMetricPath(Name alias, Table<CloudletMetricRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public CloudletMetricPath as(String alias) {
            return new CloudletMetricPath(DSL.name(alias), this);
        }

        @Override
        public CloudletMetricPath as(Name alias) {
            return new CloudletMetricPath(alias, this);
        }

        @Override
        public CloudletMetricPath as(Table<?> alias) {
            return new CloudletMetricPath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<CloudletMetricRecord> getPrimaryKey() {
        return Keys.CLOUDLET_METRIC_PKEY;
    }

    @Override
    public List<ForeignKey<CloudletMetricRecord, ?>> getReferences() {
        return Arrays.asList(Keys.CLOUDLET_METRIC__CLOUDLET_METRIC_CLOUDLET_ID_FKEY);
    }

    private transient CloudletPath _cloudlet;

    /**
     * Get the implicit join path to the <code>public.cloudlet</code> table.
     */
    public CloudletPath cloudlet() {
        if (_cloudlet == null)
            _cloudlet = new CloudletPath(this, Keys.CLOUDLET_METRIC__CLOUDLET_METRIC_CLOUDLET_ID_FKEY, null);

        return _cloudlet;
    }

    @Override
    public CloudletMetric as(String alias) {
        return new CloudletMetric(DSL.name(alias), this);
    }

    @Override
    public CloudletMetric as(Name alias) {
        return new CloudletMetric(alias, this);
    }

    @Override
    public CloudletMetric as(Table<?> alias) {
        return new CloudletMetric(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public CloudletMetric rename(String name) {
        return new CloudletMetric(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CloudletMetric rename(Name name) {
        return new CloudletMetric(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public CloudletMetric rename(Table<?> name) {
        return new CloudletMetric(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public CloudletMetric where(Condition condition) {
        return new CloudletMetric(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public CloudletMetric where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public CloudletMetric where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public CloudletMetric where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public CloudletMetric where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public CloudletMetric where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public CloudletMetric where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public CloudletMetric where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public CloudletMetric whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public CloudletMetric whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
