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
@Table(name="Seccion",catalog="mydb")
   
public class Seccion {
    
 @Id @GeneratedValue
 @Column(name="idSeccion")
 private int idSeccion;
 
 @Column(name="descripcion")
 private String descripcion; 

    /**
     * @return the idSeccion
     */
    public int getIdSeccion() {
        return idSeccion;
    }

    /**
     * @param idSeccion the idSeccion to set
     */
    public void setIdSeccion(int idSeccion) {
        this.idSeccion = idSeccion;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
 
 
}
