/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package richtercloud;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import richtercloud.javaee.persist.in.postconstruct.jar.entities.AUser;
import richtercloud.javaee.persist.in.postconstruct.jar.UserService;

/**
 *
 * @author richter
 */
@Stateless
public class DefaultUserService implements UserService {
    private static final long serialVersionUID = 1L;
    @PersistenceContext
    private EntityManager entityManager;

    public DefaultUserService() {
    }

    @PostConstruct
    private void init() {
        AUser user = new AUser("initUser");
        saveUser(user);
    }

    @Override
    public void saveUser(AUser user) {
        entityManager.persist(user);
    }
}
