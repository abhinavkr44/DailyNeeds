/**
* The UserDAO interface contains 
* methods to maintain user information.
* @author  Abhinav Kumar
* @version 1.0
* @since   2016-01-19 
*/
package com.daily.dao;

import java.util.List;

import com.daily.dto.UserDTO;

public interface UserDAO {
	
	public List<UserDTO> getAllUserList();

}
