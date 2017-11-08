
package DAO;

import POJO.Click;
import POJO.Items;
import POJO.Seccion;
import hbm.HibernateUtil;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ClickDAO {
    Session session;
    
    public ClickDAO(){
        session=HibernateUtil.getLocalSession();
    }
    
   public boolean saveaClick(int Idseccion,int IdItems)
    {
        Items item=null;
        Seccion seccion=null;
        Click click = new Click();
        if(Idseccion>0){
             seccion=(Seccion)session.load(Seccion.class, Idseccion);
        }
        
        if(IdItems>0){
            item=(Items)session.load(Items.class, IdItems);
        }
        
        click.setFecha(new Date());
        click.setItem(item);
        click.setSeccion(seccion);
        
        try{
            Transaction transaccion=session.beginTransaction();
            session.save(click);
            transaccion.commit();
            return true;
        }catch(Exception e)
        {
        }finally{   
        }
        return true;
    }
}
