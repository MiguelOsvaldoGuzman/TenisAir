/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojo;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author zexiontsuki
 */
@Entity
@Table(name="Click",catalog="tenis")

public class Click {

 @Id @GeneratedValue
 @Column(name="idClick")
 private int idClick;
 
  @Column(name="fecha")
 private String fecha;
 
   @ManyToOne
     @JoinColumn(name="idSeccion")
    private int Idseccion;
   
    
   @ManyToOne
     @JoinColumn(name="idItems")
    private int IdItems;

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
     * @return the Idseccion
     */
    public int getIdseccion() {
        return Idseccion;
    }

    /**
     * @param Idseccion the Idseccion to set
     */
    public void setIdseccion(int Idseccion) {
        this.Idseccion = Idseccion;
    }

    /**
     * @return the IdItems
     */
    public int getIdItems() {
        return IdItems;
    }

    /**
     * @param IdItems the IdItems to set
     */
    public void setIdItems(int IdItems) {
        this.IdItems = IdItems;
    }
   
}
