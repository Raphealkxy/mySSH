package com.timmy.action;

import com.opensymphony.xwork2.ActionSupport;
import com.timmy.domain.User;
import com.timmy.service.MyService;

public class MyAction extends ActionSupport {

    private MyService myService;

    public MyService getMyService() {
        return myService;
    }

    public void setMyService(MyService myService) {
        this.myService = myService;
    }

    public String save()
    {
        User user=new User();
        user.setUid(1);
        user.setPassword("1223");
        user.setUsername("kxy");
        myService.save(user);
        System.out.println(1);

        return NONE;
    }

    private String update()
    {

        System.out.println("1");
        return NONE;
    }

}
