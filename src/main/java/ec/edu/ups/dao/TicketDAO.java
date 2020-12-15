/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.Ticket;
import java.sql.Connection;
import java.sql.SQLException;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author xavier
 */
public class TicketDAO {
    @Inject
    private EntityManager em;
    
    @Inject
    private Connection con;
    
    public boolean insert(Ticket entity) throws SQLException {
        em.persist(entity);
        return true;
    }
    
}
