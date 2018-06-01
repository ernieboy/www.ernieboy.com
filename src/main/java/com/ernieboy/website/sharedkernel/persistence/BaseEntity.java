package com.ernieboy.website.sharedkernel.persistence;

import com.ernieboy.website.model.RecordStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public abstract class BaseEntity  implements Serializable {

    private static final long serialVersionUID = 1L;

    protected String guid;

    protected Date dateCreated;

    protected Date dateLastModified;

    protected RecordStatus recordStatus;

    public BaseEntity() {

       // setGuid(RandomGUID.generate(false));
        setDateCreated(new Date());
        setDateLastModified(new Date());
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false, columnDefinition = "BIGINT UNSIGNED")
    protected Long id;

    public Long getId() {
        return id;
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

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateLastModified() {
        return dateLastModified;
    }

    public void setDateLastModified(Date dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.getId() != null ? this.getId().hashCode() : 0);

        return hash;
    }

    @Override
    public String toString() {
        return getClass().getName() + ":" + guid;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;

        BaseEntity other = (BaseEntity) object;
        if (this.getId() != other.getId() && (this.getId() == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

}
