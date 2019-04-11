<!doctype html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport"
        content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>教务管理系统</title>
    <link rel="stylesheet" href="./vendor/simple-line-icons/css/simple-line-icons.css">
    <link rel="stylesheet" href="./vendor/font-awesome/css/fontawesome-all.min.css">
    <link rel="stylesheet" href="./css/styles.css">
</head>

<body class="sidebar-fixed header-fixed">
    <div class="page-wrapper">
        <nav class="navbar page-header">
            <a href="#" class="btn btn-link sidebar-mobile-toggle d-md-none mr-auto">
                <i class="fa fa-bars"></i>
            </a>

            <a class="navbar-brand" href="#">
                <img src="./imgs/logo.png" alt="logo">
            </a>

            <a href="#" class="btn btn-link sidebar-toggle d-md-down-none">
                <i class="fa fa-bars"></i>
            </a>

            <ul class="navbar-nav ml-auto">

                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-toggle="dropdown"
                        aria-haspopup="true" aria-expanded="false">
                        <img src="./imgs/avatar-1.png" class="avatar avatar-sm" alt="logo">
                        <span class="small ml-1 d-md-down-none">用户</span>
                    </a>

                    <div class="dropdown-menu dropdown-menu-right">
                        <div class="dropdown-header">账户信息</div>

                        <a href="#" class="dropdown-item">
                            <i class="fa fa-user"></i> 个人信息
                        </a>

                        <a href="#" class="dropdown-item">
                            <i class="fa fa-envelope"></i> 消息
                        </a>

                        <div class="dropdown-header">设置</div>

                        <a href="#" class="dropdown-item">
                            <i class="fa fa-bell"></i> 通知
                        </a>

                        <a href="#" class="dropdown-item">
                            <i class="fa fa-wrench"></i> 设置
                        </a>

                        <a href="#" class="dropdown-item">
                            <i class="fa fa-lock"></i> 注销
                        </a>
                    </div>
                </li>
            </ul>
        </nav>

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
                                    <a href="course.jsp" class="nav-link active">
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

                                    <div class="row mt-4">
                                        <div class="col-md-3">                                    
                                        </div>
                                        <div class="col-md-6">
                                            <label for="input-group-2"></label>
                                            <div class="input-group">
                                                <input type="text" id="input-group-2" name="input1-group2"
                                                    class="form-control" placeholder="班级">
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
                                    课表信息
                                </div>

                                <div class="card-body">
                                    <div class="table-responsive">
                                        <table class="table table-hover">
                                            <thead>
                                                <tr>
                                                    <th>星期一</th>
                                                    <th>星期二</th>
                                                    <th>星期三</th>
                                                    <th>星期四</th>
                                                    <th>星期五</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr>
                                                    <td>第一节</td>
                                                    <td>语文</td>
                                                    <td></td>
                                                    <td>数学</td>
                                                    <td>英语</td>
                                                </tr>
                                                <tr>
                                                    <td>2</td>
                                                    <td>Google Pixel XL</td>
                                                    <td>99,542</td>
                                                    <td>$750</td>
                                                    <td>3%</td>
                                                </tr>
                                                <tr>
                                                    <td>3</td>
                                                    <td>iPhone X</td>
                                                    <td>62,220</td>
                                                    <td>$1,200</td>
                                                    <td>0%</td>
                                                </tr>
                                                <tr>
                                                    <td>4</td>
                                                    <td>OnePlus 5T</td>
                                                    <td>50,000</td>
                                                    <td>$650</td>
                                                    <td>5%</td>
                                                </tr>
                                                <tr>
                                                    <td>5</td>
                                                    <td>Google Nexus 6</td>
                                                    <td>400</td>
                                                    <td>$400</td>
                                                    <td>7%</td>
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
    <script src="./vendor/jquery/jquery.min.js"></script>
    <script src="./vendor/popper.js/popper.min.js"></script>
    <script src="./vendor/bootstrap/js/bootstrap.min.js"></script>
    <script src="./vendor/chart.js/chart.min.js"></script>
    <script src="./js/carbon.js"></script>
    <script src="./js/demo.js"></script>
</body>

</html>