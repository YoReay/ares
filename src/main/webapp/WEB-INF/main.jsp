<%--
  Created by IntelliJ IDEA.
  User: sanze
  Date: 2016/7/28
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Complex Layout - jQuery EasyUI Demo</title>
    <%--<link rel="stylesheet" type="text/css" href="assets/easyui/themes/metro-blue/easyui.css">--%>
    <%--<link rel="stylesheet" type="text/css" href="assets/easyui/themes/icon.css">--%>
    <%--<link rel="stylesheet" type="text/css" href="assets/easyui/themes/color.css">--%>
    <script type="text/javascript" src="assets/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="assets/easyui/easyloader.js"></script>
    <%--<script type="text/javascript" src="assets/easyui/jquery.easyui.min.js"></script>--%>
    <%--<script type="text/javascript" src="assets/easyui/locale/easyui-lang-zh_CN.js"></script>--%>
    <style>
        #home_tabs > .tabs-panels > .panel > div {
            padding: 10px 0;
        }
    </style>
</head>
<body class="easyui-layout">
<div data-options="region:'north'" style="height:50px;border: 0;"><h3>Netopstec-CRM</h3></div>
<div data-options="region:'center'">
    <div style="position: absolute;right: 10px;z-index: 999;">
        <select class="easyui-combobox" name="state" style="width:100px;">
            <option value="AL">Alabama</option>
            <option value="AK">Alaska</option>
            <option value="AZ">Arizona</option>
        </select>
        <select class="easyui-combobox" name="state" style="width:100px;">
            <option value="AL">Alabama</option>
            <option value="AK">Alaska</option>
            <option value="AZ">Arizona</option>
        </select>
    </div>
    <div id="home_tabs" class="easyui-tabs">
        <div title="CRM" style="padding:10px">
        </div>
        <div title="系统" style="padding:10px">
        </div>
        <div title="客服绩效" style="padding:10px">
        </div>
        <div title="附加功能" style="padding:10px">
            <input type="button" id="btnAlert" value="click">
        </div>
    </div>
</div>
<script type="text/javascript" src="js/main.js"></script>
</body>
</html>
