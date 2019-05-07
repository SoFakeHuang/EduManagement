<!doctype html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <%@ include file ="Resource.jsp"%>
    <title>教务管理系统</title>
</head>
<body class="sidebar-fixed header-fixed">
<div class="page-wrapper">
    <%@include file="Head.jsp"%>

    <div class="main-container">
        <div class="sidebar">
            <nav class="sidebar-nav">
                <ul class="nav">
                    <li class="nav-title">导航</li>

                    <li class="nav-item">
                        <a href="/EduManagement/v0.3/index_teacher.jsp" class="nav-link">
                            <i class="icon icon-speedometer"></i> 主页
                        </a>
                    </li>

                    <li class="nav-item nav-dropdown ">
                        <a href="#" class="nav-link nav-dropdown-toggle">
                            <i class="icon icon-target open"></i> 成绩管理 <i class="fa fa-caret-left"></i>
                        </a>

                        <ul class="nav-dropdown-items">
                            <li class="nav-item">   
                                <a href="/EduManagement/v0.3/grade_teacher.jsp" class="nav-link">
                                    <i class="icon icon-target"></i> 学生成绩操作
                                </a>
                            </li>                 
                        </ul>

                        <ul class="nav-dropdown-items">
                            <li class="nav-item">   
                                <a href="/EduManagement/v0.3/gradeadd_teacher.jsp" class="nav-link active">
                                    <i class="icon icon-target"></i> 学生成绩录入
                                </a>
                            </li>                 
                        </ul>

                    </li>

                    <li class="nav-item nav-dropdown">
                        <a href="#" class="nav-link nav-dropdown-toggle">
                            <i class="icon icon-energy"></i> 信息查询 <i class="fa fa-caret-left"></i>
                        </a>

                        <ul class="nav-dropdown-items">
                            <li class="nav-item">
                                <a href="/EduManagement/v0.3/info_teacher.jsp" class="nav-link">
                                    <i class="icon icon-energy"></i> 教师信息
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="/EduManagement/v0.3/info_teaQurey.jsp" class="nav-link">
                                    <i class="icon icon-energy"></i> 学生和班级信息
                                </a>
                            </li>
                        </ul>
                    </li>

                    <li class="nav-title">更多</li>

                    <li class="nav-item nav-dropdown">
                        <a href="#" class="nav-link nav-dropdown-toggle">
                            <i class="icon icon-umbrella"></i> 其他 <i class="fa fa-caret-left"></i>
                        </a>

                    </li>
                </ul>
            </nav>
        </div>

        <div class="content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-12">
                        <div class="card">
                            <div class="card-body">
                                <div class="row">
                                    <div class="col-md-4"></div>
                                    <div class="col-md-4">
                                        <div class="form-group">
                                            <label for="single-select">课程名称</label>
                                            <select id="single-select" class="form-control">
                                                <option>1</option>
                                                <option>2</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="col-md-1"></div>
                                    <div class="my-4 col-md-1">
                                        <button class="btn btn-primary">查询</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-12">
                        <div class="card">
                            <div class="card-header bg-light">
                                查询结果
                            </div>
                            <div class="card-body">
                                <div class="row">

                                    <div class="table-responsive">
                                        <table class="table table-hover">
                                            <thead>
                                            <tr>
                                                <th>课程名</th>
                                                <th>任课老师</th>
                                                <th>成绩</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <tr>
                                                <td class="col-md-4">美学原理</td>
                                                <td class="col-md-4">网课</td>
                                                <td class="col-md-4">
                                                    <input id="normal-input" class="form-control col-md-3">
                                                </td>
                                            </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                    <div class="col-md-9"></div>
                                    <div class="col-md-3">
                                        <button class="btn btn-primary">提交</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<%@include file="JSResource.jsp"%>
</body>
</html>
