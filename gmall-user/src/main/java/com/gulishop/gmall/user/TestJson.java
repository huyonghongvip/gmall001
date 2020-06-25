package com.gulishop.gmall.user;


import com.alibaba.fastjson.JSONObject;

public class TestJson {
    public static void main(String[] args) {

        String gson="{\"phone\":123,\"name\":\"李四\",\"cname\":{\"dname\":{\"ename\":\"kkkk\"}}}";
        JSONObject parse =JSONObject.parseObject(gson);//JsonObject基于HashMap<String,Object>实现
        Object parse6 = JSONObject.parse(gson);//字符串转对象
        String s = parse6.toString();//对象转字符串
        System.out.println("-----------------------------"+s+"--------------------------------------");

        /**第一层 共有属性赋值
         * */
        Rootcls rootcls = new Rootcls();
        rootcls.setPhone((int)parse.get("phone"));
        rootcls.setName(String.valueOf(parse.get("name")));


//        System.out.println(parse.get("cname"));
//        System.out.println(parse2.get("dname"));
//        System.out.println(parse3.get("ename"));
        JSONObject parse2 =JSONObject.parseObject(String.valueOf(parse.get("cname")));
        JSONObject parse3=JSONObject.parseObject(String.valueOf(parse2.get("dname")));;



        /**第三层对象
         * */
        Dname dname = new Dname();
        dname.setEname(String.valueOf(parse3.get("ename")));//赋值属性

        /**第二层对象
         * */
        Cname cname = new Cname();
        cname.setDname(dname);//赋对象

        /**第一层对象
         * */
        rootcls.setCname(cname);//赋对象

        System.out.println("存入对象--->值为："+rootcls);


    }



}
