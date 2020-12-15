/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.negocio;

import ec.edu.ups.modelo.Ticket;
import javax.ejb.Remote;

/**
 *
 * @author xavier
 */
@Remote 
public interface GestionONRemote{
    public boolean registrarTicket(Ticket ticket) throws Exception;
}
