/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojo;

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
@Table(name="Items",catalog="tenis")

public class Items {
    
    
 @Id @GeneratedValue
 @Column(name="idItems")
 private int idItems;
 
 

 @Column(name="descripcion")
 private String Descripcion;
 
  
   @ManyToOne
     @JoinColumn(name="Items")
    private int SuperItem;
   
      @ManyToOne
     @JoinColumn(name="idSeccion")
    private int idSeccion;
 
 
    
}
