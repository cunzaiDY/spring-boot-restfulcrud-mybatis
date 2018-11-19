​	本例是使用springboot+mybatis做的一个CRUD小模型，其中加入了微小的登录验证（以匹配密码和验证登录名是否存在的方式验证的），配置了拦截器，使用了Druid数据源，sql有两张表employee员工表，department部门表，其中以employee中的depId来匹配部门表中的id，从而确定每个员工所属的部门，（还有国际化效果，高亮效果，登录时在数据库验证，登出，注册，列表分页，这些还未实现，望一起进步，互相交流，分享记录讨论知识才会得到更多的知识）

![登录页面](C:\Users\Administrator\Desktop\登录页面.PNG)



![主页面](C:\Users\Administrator\Desktop\主页面.PNG)





![员工管理页面](C:\Users\Administrator\Desktop\员工管理页面.PNG)