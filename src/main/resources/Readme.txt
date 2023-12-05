说明：
    a：本章主要目的学习springmvc如何从页面传参数
        1：简单数据绑定, POJO绑定
            传一个java类到后端，了解springmvc如何解析java对象，学会页面传中文乱码的解决办法
        2：自定义数据类型转换

    b: 代码说明
        1：本代码和ch11的代码基本一致，可以copy过来，保留并修改web.xml和spring-config.xml

    c：实训步骤
        1：表单提交数据（username, passwd)，和Controller中的User对象绑定
            1.1：编写页面regiester(在WEB-INF/pages，需要修改完善页面）
            1.2：编写user对象和userController
            1.3：启动程序，在页面输入username, password, 在controller中能正确接收
        2：基于Spring的Converter，开发自定义，将不同时间字符串转换成java中的Date类型
            2.1：编写DateConverter工具类
            2.2：配置类型转换器工场（这样在controller中透明进行类型转换）
            2.3：编写controller,通过前端数据string类型的日期参数，在controller中能正确解析（学习用postman测试）
