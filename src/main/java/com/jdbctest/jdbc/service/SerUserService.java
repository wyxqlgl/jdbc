package com.jdbctest.jdbc.service;

import com.jdbctest.jdbc.serchdata.userdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SerUserService {
    @Autowired
     userdao userdao;

//    public boolean entry(String  username,String password){
//       Integer i=  userdao.totalUserInDepartment(username,password);
//       if(i!=null){
//           return true;
//       }else{
//           return false;
//       }}


}
