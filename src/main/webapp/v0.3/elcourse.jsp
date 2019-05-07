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
                <li class="nav-title">导航</li>

                <li class="nav-item">
                    <a href="/EduManagement/user/indexInfo" class="nav-link ">
                        <i class="icon icon-speedometer"></i> 主页
                    </a>
                </li>
                <li class="nav-item">
                    <a href="/EduManagement/v0.3/elcourse.jsp" class="nav-link active">
                        <i class="icon icon-target"></i> 自主选课
                    </a>
                </li>
                </li>
                <ul class="nav">
                    <li class="nav-item">
                        <a href="/EduManagement/v0.3/grade.jsp" class="nav-link">
                            <i class="icon icon-energy"></i> 查询成绩
                        </a>
                    </li>

                    <li class="nav-item">
                        <a href="/EduManagement/v0.3/info.jsp" class="nav-link">
                            <i class="icon icon-energy"></i> 查询学籍信息
                        </a>
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
                                            <td>${courseList.get(0).course.name}</td>
                                            <td>网课</td>
                                            <td>
                                                <button id="confirm" class="btn btn-outline-primary" data-toggle="modal"
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


<script>
    $('#confirm').click(function () {
            // 获取课程名称
            var className =$("input[id='className']").val().replace(/(^\s*)|(\s*$)/g, "");
            //包装成JSON
            var obj={
                'name':className
            }
            // ajax处理接收课程表
            $.ajax({
                    url: "${pageContext.request.contextPath}/mm/m3",
                    data:JSON.stringify(obj),
                    dataType:"json",
                    type: "post",
                    contentType: "application/json;charset=utf-8",
                    success: function (data) {
                        alert(data)
                        alert("成功")
                    }
                }
            )
        }
    )
</script>

<%@include file="JSResource.jsp" %>
</body>
</html>
