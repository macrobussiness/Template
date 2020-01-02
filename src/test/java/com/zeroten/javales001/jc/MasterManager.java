package com.zeroten.javales001.jc;

import java.util.Date;

public class MasterManager extends Manager {

    @Override
    public String getName() {
        return "【" + name + "】";
    }

    public MasterManager(String name, Date hireDay, Integer salary, Integer bonus) {
        super(name, hireDay, salary, bonus);
        System.out.println("执行 MasterManager 的有参数构造方法");
    }
}
