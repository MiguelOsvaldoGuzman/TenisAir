/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author zexiontsuki
 */
@Entity
@Table(name = "Click", catalog = "mydb")

public class Click {

    @Id
    @GeneratedValue
    @Column(name = "idClick")
    private int idClick;

    @Column(name = "fecha")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "idSeccion")
    private Seccion seccion;

    @ManyToOne
    @JoinColumn(name = "idItems")
    private Items item;
    

    
    

    /**
     * @return the idClick
     */
    public int getIdClick() {
        return idClick;
    }

    /**
     * @param idClick the idClick to set
     */
    public void setIdClick(int idClick) {
        this.idClick = idClick;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the seccion
     */
    public Seccion getSeccion() {
        return seccion;
    }

    /**
     * @param seccion the seccion to set
     */
    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    /**
     * @return the item
     */
    public Items getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(Items item) {
        this.item = item;
    }
}
