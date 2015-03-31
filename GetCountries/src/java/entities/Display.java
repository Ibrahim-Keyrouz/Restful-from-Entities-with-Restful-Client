/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.ws.rs.core.Response;
import ws.NewJerseyClient;

/**
 *
 * @author oracle
 */
public class Display {
    
    public static void main (String[] args) {
        Jobs a = new Jobs();
        NewJerseyClient c = new NewJerseyClient();
        a.setJobId("BobK");
        a.setJobTitle("bobk");
     //   a.setTrsdate(Date.valueOf("03/03/2015"));
        
        
        Response b = c.bob_JSON(a);
        System.out.println(b.toString());
        
        
        
    }
    
    
    
}
