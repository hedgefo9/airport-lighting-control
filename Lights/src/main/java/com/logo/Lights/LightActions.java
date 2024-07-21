package com.logo.Lights;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.Date;

@Entity
public class LightActions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long aid;
    private int eid;
    private boolean state;
    @JsonFormat(shape=Shape.STRING, pattern="yyyy-MM-dd HH:mm", timezone="Europe/Moscow")
    private Date created;

    public long getAid() {
        return aid;
    }

    public void setAid(long aid) {
        this.aid = aid;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}

