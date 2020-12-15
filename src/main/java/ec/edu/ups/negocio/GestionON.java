/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.negocio;

import ec.edu.ups.dao.TicketDAO;
import ec.edu.ups.dao.VehiculoDAO;
import ec.edu.ups.modelo.Ticket;
import ec.edu.ups.modelo.Vehiculo;
import java.sql.SQLException;
import java.util.Date;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author xavier
 */
@Stateless
public class GestionON implements GestionONRemote{
    
    @Inject
    private TicketDAO daoTicket;
    
    @Inject
    private VehiculoDAO daoVehiculo;
    
    public boolean registrarTicket(Ticket ticket) throws Exception{
        try{
            Vehiculo aux = daoVehiculo.read(ticket.getVehiculo().getPlaca());
        if(aux!=null){
            daoVehiculo.update(ticket.getVehiculo());
        }else{
            daoVehiculo.insert(ticket.getVehiculo());
        }
        ticket.setFechaIngreso(new Date());
        daoTicket.insert(ticket);
        return true;
        
        }catch (Exception e){
            throw new Exception("Erroro al registar"+e.getMessage());
        }   
    }
    
}
