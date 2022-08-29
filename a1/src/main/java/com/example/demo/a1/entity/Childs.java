package com.example.demo.a1.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "CHILD")
public class Childs {
    @EmbeddedId
    private ChildPK childPK = new ChildPK();

    @ManyToOne(cascade = CascadeType.PERSIST)
    @MapsId("fatherId")
    private Fathers fathers;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @MapsId("motherId")
    private Mothers mothers;

    private String name;

    private String surname;
    
    @Lob
	private byte[] pic;

    public byte[] getPic() {
		return pic;
	}

	public void setPic(byte[] pic) {
		this.pic = pic;
	}

	public Childs() {
    }

    public Childs(Fathers fathers, Mothers mothers) {
        this.childPK = new ChildPK(fathers, mothers);
    }

    public ChildPK getChildPK() {
        return childPK;
    }

    public void setChildPK(ChildPK childPK) {
        this.childPK = childPK;
    }

    public Fathers getFather() {
        return fathers;
    }

    public void setFather(Fathers fathers) {
        this.fathers = fathers;
    }

    public Mothers getMother() {
        return mothers;
    }

    public void setMother(Mothers mothers) {
        this.mothers = mothers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Childs childs = (Childs) o;
        return Objects.equals(childPK, childs.childPK) &&
                Objects.equals(fathers, childs.fathers) &&
                Objects.equals(mothers, childs.mothers) &&
                Objects.equals(name, childs.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(childPK, fathers, mothers, name);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
