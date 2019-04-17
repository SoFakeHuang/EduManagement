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

                    <li class="nav-item nav-dropdown open">
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
                                <a href="elcourse.jsp" class="nav-link active">
                                    <i class="icon icon-target"></i> 自主选课
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
                                <a href="grade.jsp" class="nav-link">
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
                            <div class="card-body">
                                <div class="row">
                                    <div class="col-md-3"></div>
                                    <div class="col-md-6">
                                        <label for="input-group-2"></label>
                                        <div class="input-group">
                                            <input type="text" id="input-group-2" name="input1-group2"
                                                   class="form-control" placeholder="课程名称">
                                            <span class="input-group-btn">
                                                    <button type="button" class="btn btn-primary"><i
                                                            class="fa fa-search"></i>查找</button>
                                            </span>
                                        </div>
                                    </div>
                                    <div class="col-md-3">
                                        <div class="input-group">
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>


                    <div class="col-md-12">
                        <div class="card">
                                <div class="card-header bg-light">
                                    课程信息
                                </div>


                                <div class="table-responsive">
                                    <table class="table table-hover">
                                        <thead>
                                        <tr>
                                            <th>课程名称</th>
                                            <th>课程信息</th>
                                            <th>选课</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <td>美学原理</td>
                                            <td>网课</td>
                                            <td>
                                                <button class="btn btn-outline-primary" data-toggle="modal"
                                                        data-target="#modal-1">选课
                                                </button>
                                            </td>
                                        </tr>

                                        </tbody>
                                    </table>
                                </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>

<div class="modal fade" id="modal-1" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">信息</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>

            <div class="modal-body">
                选课成功！
            </div>

            <div class="modal-footer">
                <button type="button" class="btn btn-primary" data-dismiss="modal">确定</button>
                <button type="button" class="btn btn-primary" data-dismiss="modal">关闭</button>
            </div>
        </div>
    </div>
</div>

<%@include file="JSResource.jsp" %>
</body>
</html>
