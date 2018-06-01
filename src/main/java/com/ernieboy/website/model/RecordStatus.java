package com.ernieboy.website.model;

import com.ernieboy.website.sharedkernel.persistence.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class RecordStatus  extends BaseEntity {

    private String _name;
    private String _description;


    public String getName()
    {
        return _name;
    }

    public String getDescription()
    {
        return _description;
    }



}
