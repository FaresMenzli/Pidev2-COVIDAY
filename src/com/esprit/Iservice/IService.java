/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.Iservice;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author MKadmin
 */
public interface IService<T> {
    boolean ajouter(T t) throws SQLException ;
    
    List<T> readAll() throws SQLException ;
    //T findbyID
}
