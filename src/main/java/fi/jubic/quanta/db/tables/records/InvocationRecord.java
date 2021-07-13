/*
 * This file is generated by jOOQ.
 */
package fi.jubic.quanta.db.tables.records;


import fi.jubic.quanta.db.tables.Invocation;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InvocationRecord extends UpdatableRecordImpl<InvocationRecord> implements Record8<Long, Long, String, Long, Long, LocalDateTime, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>invocation.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>invocation.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>invocation.invocation_number</code>.
     */
    public void setInvocationNumber(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>invocation.invocation_number</code>.
     */
    public Long getInvocationNumber() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>invocation.status</code>.
     */
    public void setStatus(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>invocation.status</code>.
     */
    public String getStatus() {
        return (String) get(2);
    }

    /**
     * Setter for <code>invocation.task_id</code>.
     */
    public void setTaskId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>invocation.task_id</code>.
     */
    public Long getTaskId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>invocation.worker_id</code>.
     */
    public void setWorkerId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>invocation.worker_id</code>.
     */
    public Long getWorkerId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>invocation.starting_time</code>.
     */
    public void setStartingTime(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>invocation.starting_time</code>.
     */
    public LocalDateTime getStartingTime() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>invocation.ending_time</code>.
     */
    public void setEndingTime(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>invocation.ending_time</code>.
     */
    public LocalDateTime getEndingTime() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>invocation.deleted_at</code>.
     */
    public void setDeletedAt(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>invocation.deleted_at</code>.
     */
    public LocalDateTime getDeletedAt() {
        return (LocalDateTime) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, Long, String, Long, Long, LocalDateTime, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Long, Long, String, Long, Long, LocalDateTime, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Invocation.INVOCATION.ID;
    }

    @Override
    public Field<Long> field2() {
        return Invocation.INVOCATION.INVOCATION_NUMBER;
    }

    @Override
    public Field<String> field3() {
        return Invocation.INVOCATION.STATUS;
    }

    @Override
    public Field<Long> field4() {
        return Invocation.INVOCATION.TASK_ID;
    }

    @Override
    public Field<Long> field5() {
        return Invocation.INVOCATION.WORKER_ID;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return Invocation.INVOCATION.STARTING_TIME;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return Invocation.INVOCATION.ENDING_TIME;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return Invocation.INVOCATION.DELETED_AT;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getInvocationNumber();
    }

    @Override
    public String component3() {
        return getStatus();
    }

    @Override
    public Long component4() {
        return getTaskId();
    }

    @Override
    public Long component5() {
        return getWorkerId();
    }

    @Override
    public LocalDateTime component6() {
        return getStartingTime();
    }

    @Override
    public LocalDateTime component7() {
        return getEndingTime();
    }

    @Override
    public LocalDateTime component8() {
        return getDeletedAt();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getInvocationNumber();
    }

    @Override
    public String value3() {
        return getStatus();
    }

    @Override
    public Long value4() {
        return getTaskId();
    }

    @Override
    public Long value5() {
        return getWorkerId();
    }

    @Override
    public LocalDateTime value6() {
        return getStartingTime();
    }

    @Override
    public LocalDateTime value7() {
        return getEndingTime();
    }

    @Override
    public LocalDateTime value8() {
        return getDeletedAt();
    }

    @Override
    public InvocationRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public InvocationRecord value2(Long value) {
        setInvocationNumber(value);
        return this;
    }

    @Override
    public InvocationRecord value3(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public InvocationRecord value4(Long value) {
        setTaskId(value);
        return this;
    }

    @Override
    public InvocationRecord value5(Long value) {
        setWorkerId(value);
        return this;
    }

    @Override
    public InvocationRecord value6(LocalDateTime value) {
        setStartingTime(value);
        return this;
    }

    @Override
    public InvocationRecord value7(LocalDateTime value) {
        setEndingTime(value);
        return this;
    }

    @Override
    public InvocationRecord value8(LocalDateTime value) {
        setDeletedAt(value);
        return this;
    }

    @Override
    public InvocationRecord values(Long value1, Long value2, String value3, Long value4, Long value5, LocalDateTime value6, LocalDateTime value7, LocalDateTime value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InvocationRecord
     */
    public InvocationRecord() {
        super(Invocation.INVOCATION);
    }

    /**
     * Create a detached, initialised InvocationRecord
     */
    public InvocationRecord(Long id, Long invocationNumber, String status, Long taskId, Long workerId, LocalDateTime startingTime, LocalDateTime endingTime, LocalDateTime deletedAt) {
        super(Invocation.INVOCATION);

        setId(id);
        setInvocationNumber(invocationNumber);
        setStatus(status);
        setTaskId(taskId);
        setWorkerId(workerId);
        setStartingTime(startingTime);
        setEndingTime(endingTime);
        setDeletedAt(deletedAt);
    }
}
