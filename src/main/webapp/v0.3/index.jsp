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
                        <a href="/EduManagement/user/indexInfo" class="nav-link active">
                            <i class="icon icon-speedometer"></i> 主页
                        </a>
                    </li>
                    <li class="nav-item">
                        <a href="/EduManagement/teachersCourse/electiveList" class="nav-link">
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
                            <a href="/EduManagement/studentsInfo/quireInfo" class="nav-link">
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
                    <div class="col-md-3">
                        <div class="card p-4">
                            <div class="card-body d-flex justify-content-between align-items-center">
                                <div>
                                    <span class="h4 d-block font-weight-normal mb-2">${studentClassDepartmentPo.name}</span>
                                    <span class="font-weight-light">${studentClassDepartmentPo.aClass.name}</span>
                                </div>

                                <div class="h2 text-muted">
                                    <i class="icon icon-people"></i>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-9 mb-4">
                        <ul class="nav nav-tabs" role="tablist">
                            <li class="nav-item">
                                <a class="nav-link active" data-toggle="tab" href="#home" role="tab"
                                   aria-controls="home">标题1</a>
                            </li>

                            <li class="nav-item">
                                <a class="nav-link" data-toggle="tab" href="#profile" role="tab"
                                   aria-controls="profile">标题2</a>
                            </li>

                            <li class="nav-item">
                                <a class="nav-link" data-toggle="tab" href="#messages" role="tab"
                                   aria-controls="messages">标题3</a>
                            </li>
                        </ul>

                        <div class="tab-content">
                            <div class="tab-pane active" id="home" role="tabpanel">
                                正文1
                            </div>

                            <div class="tab-pane" id="profile" role="tabpanel">
                                2. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
                                incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
                                exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure
                                dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
                                Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt
                                mollit anim id est laborum.
                            </div>

                            <div class="tab-pane" id="messages" role="tabpanel">
                                3. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
                                incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
                                exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure
                                dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
                                Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt
                                mollit anim id est laborum.
                            </div>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-12">
                        <div class="card">
                            <div class="card-header bg-light">
                                <div class="row">
                                    <div class="col-md-3">
                                        课表信息
                                    </div>
                                    <div class="col-md-6">
                                        <div class="input-group">
                                            <input type="text" id="className" name="name"
                                                   class="form-control" placeholder="班级">
                                            <span class="input-group-btn">
                                                    <button id="selectCourse" type="button" class="btn btn-primary"><i
                                                            class="fa fa-search"></i>查找</button>
                                                </span>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="card-body">
                                <div class="table-responsive">
                                    <table class="table table-hover">
                                        <thead>
                                        <tr>
                                            <th></th>
                                            <th>星期一</th>
                                            <th>星期二</th>
                                            <th>星期三</th>
                                            <th>星期四</th>
                                            <th>星期五</th>
                                        </tr>
                                        </thead>
                                        <tbody id="tbody">
                                        <tr>
                                            <th scope="row">1-2节</th>
                                            <td id="table_1_1"></td>
                                            <td id="table_2_1"></td>
                                            <td id="table_3_1"></td>
                                            <td id="table_4_1"></td>
                                            <td id="table_5_1"></td>
                                        </tr>
                                        <tr>
                                            <th scope="row">3-4节</th>
                                            <td id="table_1_2"></td>
                                            <td id="table_2_2"></td>
                                            <td id="table_3_2"></td>
                                            <td id="table_4_2"></td>
                                            <td id="table_5_2"></td>
                                        </tr>
                                        <tr>
                                            <th scope="row">5-6节</th>
                                            <td id="table_1_3"></td>
                                            <td id="table_2_3"></td>
                                            <td id="table_3_3"></td>
                                            <td id="table_4_3"></td>
                                            <td id="table_5_3"></td>
                                        </tr>
                                        <tr>
                                            <th scope="row">7-8节</th>
                                            <td id="table_1_4"></td>
                                            <td id="table_2_4"></td>
                                            <td id="table_3_4"></td>
                                            <td id="table_4_4"></td>
                                            <td id="table_5_4"></td>
                                        </tr>
                                        <tr>
                                            <th scope="row">9-10节</th>
                                            <td id="table_1_5"></td>
                                            <td id="table_2_5"></td>
                                            <td id="table_3_5"></td>
                                            <td id="table_4_5"></td>
                                            <td id="table_5_5"></td>
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
</div>
<%@include file="JSResource.jsp" %>

<script>
    $('#selectCourse').click(function () {
            // 获取班级名称
            var className = $("input[id='className']").val().replace(/(^\s*)|(\s*$)/g, "");
            //包装成JSON
            var obj = {
                'className': className
            }
            // ajax处理接收课程表
            $.ajax({
                    url: "${pageContext.request.contextPath}/teachersCourse/list",
                    data: className,
                    dataType: "text",
                    type: "post",
                    contentType: "application/json;charset=utf-8",
                    success: function (result) {
                        var json = eval("(" + result + ")");
                        alert(json.data[0].aClass.name);
                        alert(json.code)
                        //清空课程表
                        for (var i = 1; i < 6; i++) {
                            for (var j = 1; j < 6; j++) {
                                $("#table_" + j + "_" + i).html("");
                            }
                        }
                        //遍历课程表
                        for (var i = 0; i < json.data.length; i++) {
                            $("#table_" + json.data[i].week + "_" + json.data[i].class_time).html(json.data[i].aClass.name + "<br>" + json.data[i].course.name + "<br>" + json.data[i].classroom);
                        }
                    },
                    error: function (){
                        alert("输入信息有误")
                    }
                }
            )
        }
    )
</script>
</body>
</html>
