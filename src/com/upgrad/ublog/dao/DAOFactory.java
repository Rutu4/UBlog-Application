package com.upgrad.ublog.dao;

/**
 * TODO: 3.8. Provide a factory method which returns PostDAOImpl object. (Hint: Return type
 *  of this method should be PostDAO)
 * TODO: 3.9. Provide a factory method which returns UserDAOImpl object. (Hint: Return type
 *  of this method should be UserDAO)
 */

public class DAOFactory {
  public static PostDAO getPostDAO(){
      return PostDAOImpl.getInstance();
  }
public static UserDAO getUserDAO(){
      return UserDAOImpl.getInstance();
}

}
