package com.jdbctest.jdbc.collter;

import com.jdbctest.jdbc.entity.User;
import com.jdbctest.jdbc.serchdata.userdao;
import org.beetl.sql.core.SQLManager;
import org.beetl.sql.core.engine.PageQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Controller
public class serchUser {
    @Autowired
    userdao userdao;
    @Autowired
    SQLManager sqlManager;

    public ModelAndView goToFrist(){
        ModelAndView view=new ModelAndView("/entersys.btl");
        PageQuery query = new PageQuery();
        sqlManager.pageQuery("user.selectuser",User.class,query);
        view.addObject("list",query.getList());
        EntityManager entityManager;


        return  view;
    }
//    @RequestMapping("/gotofrist")
//    public ModelAndView EnterFrist(){
//        ModelAndView view=new ModelAndView("");
//        return  view;
//    }
}
