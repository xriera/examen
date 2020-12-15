/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.Vehiculo;
import java.sql.Connection;
import java.sql.SQLException;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author xavier
 */
@Stateless
public class VehiculoDAO {
    @Inject
    private EntityManager em;
    
    @Inject
    private Connection con;
    
    public boolean insert(Vehiculo entity) throws SQLException {
        em.persist(entity);
        return true;
    }
    public Vehiculo read(String id) throws SQLException {
        return em.find(Vehiculo.class, id);
    }
    
    public boolean update(Vehiculo entity) throws SQLException {
		em.merge(entity);
		return true;
	}
    
}
