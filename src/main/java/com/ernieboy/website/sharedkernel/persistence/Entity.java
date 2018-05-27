package com.ernieboy.website.sharedkernel.persistence;

import com.ernieboy.website.model.RecordStatus;

import java.io.Serializable;
import java.util.Calendar;

public abstract class Entity implements Serializable {

    private static final long serialVersionUID = 1841134098743082829L;

    protected Long id;

    protected String guid;

    protected Calendar dateCreated;

    protected Calendar dateLastModified;

    protected RecordStatus recordStatus;

    public Entity() {
        setId(0l);
       // setGuid(RandomGUID.generate(false));
        Calendar cal = Calendar.getInstance();
        setDateCreated(cal);
        setDateLastModified(cal);
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id
     *            the id to set
     */
    final public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the guid
     */
    public String getGuid() {
        return guid;
    }

    /**
     * @param guid
     *            the guid to set
     */
    public void setGuid(String guid) {
        this.guid = guid;
    }

    public RecordStatus getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
    }

    public Calendar getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Calendar dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Calendar getDateLastModified() {
        return dateLastModified;
    }

    public void setDateLastModified(Calendar dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    public int hashCode() {
        return guid.hashCode();
    }

    public String toString() {
        return getClass().getName() + ":" + guid;
    }

    public boolean equals(Object anObject) {

        if (null == anObject)
            return false;

        return (toString().equals(anObject.toString())) ? true : false;

    }

}
