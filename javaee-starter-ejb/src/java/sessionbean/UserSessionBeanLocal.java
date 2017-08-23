package sessionbean;

import entity.UserEntity;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author victor
 */
@Local
public interface UserSessionBeanLocal {

    public UserEntity getUserByUsername(String username) throws Exception;

    public List<UserEntity> getAllUser() throws Exception;

    public void createUser(String username, String email) throws Exception;

    public void deleteUserByUsername(String username) throws Exception;
    
}