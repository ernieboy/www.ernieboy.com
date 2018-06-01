package com.ernieboy.website.model;

import com.ernieboy.website.sharedkernel.persistence.BaseEntity;

import javax.persistence.Entity;


@Entity
public class Article  extends BaseEntity {

    private String _title;
    private String _body;
    private String _summary;
    private RecordStatus _recordStatus;



}