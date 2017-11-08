/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

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
@Table(name = "Items", catalog = "mydb")

public class Items {

    @Id
    @GeneratedValue
    @Column(name = "idItems")
    private int idItems;

    @Column(name = "descripcion")
    private String Descripcion;

    @ManyToOne
    @JoinColumn(name = "Items")
    private Items SuperItem;

    @ManyToOne
    @JoinColumn(name = "idSeccion")
    private Seccion idSeccion;

    /**
     * @return the idItems
     */
    public int getIdItems() {
        return idItems;
    }

    /**
     * @param idItems the idItems to set
     */
    public void setIdItems(int idItems) {
        this.idItems = idItems;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    /**
     * @return the SuperItem
     */
    public Items getSuperItem() {
        return SuperItem;
    }

    /**
     * @param SuperItem the SuperItem to set
     */
    public void setSuperItem(Items SuperItem) {
        this.SuperItem = SuperItem;
    }

    /**
     * @return the idSeccion
     */
    public Seccion getIdSeccion() {
        return idSeccion;
    }

    /**
     * @param idSeccion the idSeccion to set
     */
    public void setIdSeccion(Seccion idSeccion) {
        this.idSeccion = idSeccion;
    }
}
