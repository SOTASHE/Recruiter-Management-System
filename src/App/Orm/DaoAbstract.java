/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package App.Orm;

import App.Services.Hibernate.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Ilias Naamane
 */
abstract public class DaoAbstract {

    static final Session session = HibernateUtil.getSessionFactory().openSession();
    private Class<?> Class;
    
    protected DaoAbstract(Class <?> Class){
    this.Class = Class;
    }
    
    protected List getAll() {
        List resultList = null;
        try {
            session.beginTransaction();
            resultList = session.createCriteria(Class).list();
            session.getTransaction().commit();
        } catch (HibernateException he) {
            he.printStackTrace();
        }
        return resultList;
    }   
    
    public void create(Object o) {
        try {
            session.beginTransaction();
            session.save(o);
            session.getTransaction().commit();
        } catch (HibernateException he) {
            he.printStackTrace();
        }
    }

    public void update(Object oldObj, Object newObj) {
              
    }

    public void delete(Object obj) {

    }
    
    public List getSqlQuery(String SqlQuery) {
     List resultList = null;
        try {
            session.beginTransaction();
            resultList = session.createSQLQuery(SqlQuery).list();
            session.getTransaction().commit();

        } catch (HibernateException he) {
            he.printStackTrace();
        }
        return resultList;   
    }
    
    public int UpdateQuery(String query) {
        int r = 0 ;
        try {
            session.beginTransaction();
            Query q = session.createSQLQuery(query) ;
            r = q.executeUpdate() ;
            session.getTransaction().commit();

        } catch (HibernateException he) {
            he.printStackTrace();
        }
        return r;
    } 
    
    public List getHqlQuery(String query){
        List resultList = null;
        try {
            session.beginTransaction();
            resultList = session.createQuery(query).list();
            session.getTransaction().commit();

        } catch (HibernateException he) {
            he.printStackTrace();
        }
        return resultList;
    }
    
    protected List getHqlPreparedQuery(String query, String... argc) {
        List resultList = null;
        try {
            session.beginTransaction();
            Query q = session.createQuery(query);
            for (int i = 0; i < argc.length - 1; i += 2) {
                q.setParameter(argc[i], argc[i + 1]);
            }
            resultList = q.list();
            session.getTransaction().commit();
        } catch (HibernateException he) {
            System.err.println(he.getMessage());
        }
        return resultList;
    }
    
}
