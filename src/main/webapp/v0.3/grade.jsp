<!doctype html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <%@ include file="Resource.jsp" %>
    <title>教务管理系统</title>
</head>
<body class="sidebar-fixed header-fixed">
<div class="page-wrapper">
    <%@include file="Head.jsp" %>
    <div class="main-container">
        <div class="sidebar">
            <nav class="sidebar-nav">
                <ul class="nav">
                    <li class="nav-title">导航</li>

                    <li class="nav-item">
                        <a href="index.jsp" class="nav-link">
                            <i class="icon icon-speedometer"></i> 主页
                        </a>
                    </li>

                    <li class="nav-item nav-dropdown">
                        <a href="#" class="nav-link nav-dropdown-toggle">
                            <i class="icon icon-target"></i> 选课 <i class="fa fa-caret-left"></i>
                        </a>

                        <ul class="nav-dropdown-items">
                            <li class="nav-item">
                                <a href="course.jsp" class="nav-link">
                                    <i class="icon icon-target"></i> 学生课表查询
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="elcourse.jsp" class="nav-link">
                                    <i class="icon icon-target"></i> 自主选课
                                </a>
                            </li>
                        </ul>
                    </li>

                    <li class="nav-item nav-dropdown open">
                        <a href="#" class="nav-link nav-dropdown-toggle">
                            <i class="icon icon-energy"></i> 信息查询 <i class="fa fa-caret-left"></i>
                        </a>

                        <ul class="nav-dropdown-items">
                            <li class="nav-item">
                                <a href="grade.jsp" class="nav-link active">
                                    <i class="icon icon-energy"></i> 查询成绩
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="info.jsp" class="nav-link">
                                    <i class="icon icon-energy"></i> 查询学籍信息
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
                            <div class="card-header bg-light">
                                成绩查询
                            </div>
                            <div class="card-body">
                                <div class="row">

                                    <div class="col-md-1"></div>

                                    <div class="col-md-4">
                                        <div class="form-group">
                                            <label for="single-select">学年</label>
                                            <select id="single-select" class="form-control">
                                                <option>1</option>
                                                <option>2</option>
                                                <option>3</option>
                                                <option>4</option>
                                                <option>5</option>
                                            </select>
                                        </div>
                                    </div>

                                    <div class="col-md-4">
                                        <div class="form-group">
                                            <label for="single-select">学期</label>
                                            <select id="single-select" class="form-control">
                                                <option>1</option>
                                                <option>2</option>
                                            </select>
                                        </div>
                                    </div>

                                    <div class="col-md-1"></div>

                                    <div class="my-4">
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
                                                <td>美学原理</td>
                                                <td>网课</td>
                                                <td>90</td>
                                            </tr>
                                            </tbody>
                                        </table>
                                    </div
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<%@include file="JSResource.jsp" %>
</body>
</html>
