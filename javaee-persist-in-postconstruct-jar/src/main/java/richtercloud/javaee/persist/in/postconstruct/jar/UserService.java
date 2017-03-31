/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package richtercloud.javaee.persist.in.postconstruct.jar;

import java.io.Serializable;
import javax.ejb.Local;
import richtercloud.javaee.persist.in.postconstruct.jar.entities.AUser;

/**
 *
 * @author richter
 */
@Local
public interface UserService extends Serializable {

    public void saveUser(AUser user);
}
