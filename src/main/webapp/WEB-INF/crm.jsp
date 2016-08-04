<%--
  Created by IntelliJ IDEA.
  User: sanze
  Date: 2016/8/3
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="easyui-layout" data-options="fit:true">
    <div data-options="region:'west',split:true" title="West" style="width:20%;">
        <div class="easyui-accordion" data-options="fit:true,border:false">
            <div title="Title1" data-options="selected:true" style="padding:10px;">
                content1
            </div>
            <div title="Title2" style="padding:10px;">
                content2
            </div>
            <div title="Title3" style="padding:10px">
                content3
            </div>
        </div>
    </div>
    <div data-options="region:'center',title:'Main Title',iconCls:'icon-ok'">

    </div>
</div>
