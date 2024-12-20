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
import org.cooper.jooq.model.tables.Simulation.SimulationPath;
import org.cooper.jooq.model.tables.records.TimeRecord;
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
public class Time extends TableImpl<TimeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.time</code>
     */
    public static final Time TIME = new Time();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TimeRecord> getRecordType() {
        return TimeRecord.class;
    }

    /**
     * The column <code>public.time.id</code>.
     */
    public final TableField<TimeRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false).defaultValue(DSL.field(DSL.raw("uuid_generate_v4()"), SQLDataType.UUID)), this, "");

    /**
     * The column <code>public.time.simulation_id</code>.
     */
    public final TableField<TimeRecord, UUID> SIMULATION_ID = createField(DSL.name("simulation_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.time.simulation_time_seconds</code>.
     */
    public final TableField<TimeRecord, Double> SIMULATION_TIME_SECONDS = createField(DSL.name("simulation_time_seconds"), SQLDataType.DOUBLE.nullable(false), this, "");

    private Time(Name alias, Table<TimeRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Time(Name alias, Table<TimeRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public.time</code> table reference
     */
    public Time(String alias) {
        this(DSL.name(alias), TIME);
    }

    /**
     * Create an aliased <code>public.time</code> table reference
     */
    public Time(Name alias) {
        this(alias, TIME);
    }

    /**
     * Create a <code>public.time</code> table reference
     */
    public Time() {
        this(DSL.name("time"), null);
    }

    public <O extends Record> Time(Table<O> path, ForeignKey<O, TimeRecord> childPath, InverseForeignKey<O, TimeRecord> parentPath) {
        super(path, childPath, parentPath, TIME);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class TimePath extends Time implements Path<TimeRecord> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> TimePath(Table<O> path, ForeignKey<O, TimeRecord> childPath, InverseForeignKey<O, TimeRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private TimePath(Name alias, Table<TimeRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public TimePath as(String alias) {
            return new TimePath(DSL.name(alias), this);
        }

        @Override
        public TimePath as(Name alias) {
            return new TimePath(alias, this);
        }

        @Override
        public TimePath as(Table<?> alias) {
            return new TimePath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<TimeRecord> getPrimaryKey() {
        return Keys.TIME_PKEY;
    }

    @Override
    public List<ForeignKey<TimeRecord, ?>> getReferences() {
        return Arrays.asList(Keys.TIME__TIME_SIMULATION_ID_FKEY);
    }

    private transient SimulationPath _simulation;

    /**
     * Get the implicit join path to the <code>public.simulation</code> table.
     */
    public SimulationPath simulation() {
        if (_simulation == null)
            _simulation = new SimulationPath(this, Keys.TIME__TIME_SIMULATION_ID_FKEY, null);

        return _simulation;
    }

    @Override
    public Time as(String alias) {
        return new Time(DSL.name(alias), this);
    }

    @Override
    public Time as(Name alias) {
        return new Time(alias, this);
    }

    @Override
    public Time as(Table<?> alias) {
        return new Time(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Time rename(String name) {
        return new Time(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Time rename(Name name) {
        return new Time(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Time rename(Table<?> name) {
        return new Time(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Time where(Condition condition) {
        return new Time(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Time where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Time where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Time where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Time where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Time where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Time where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Time where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Time whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Time whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
