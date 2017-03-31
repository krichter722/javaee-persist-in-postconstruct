/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package richtercloud;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import richtercloud.javaee.persist.in.postconstruct.jar.UserService;
import richtercloud.javaee.persist.in.postconstruct.jar.entities.AUser;

/**
 *
 * @author richter
 */
@ManagedBean
public class Register {
    private String username = "user1";
    @EJB
    private UserService userService;

    public Register() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void save() {
        userService.saveUser(new AUser(username));
    }
}
