<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>untitled1</title>
    </head>
    <body>hello
        <div>
            &nbsp;
        </div>
    </body>
    <bean:write name="user" property="name">
</bean:write>

</html>