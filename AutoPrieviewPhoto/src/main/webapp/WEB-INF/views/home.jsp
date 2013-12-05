<%-- 
    Document   : login
    Created on : 2013-10-19, 11:12:32
    Author     : Chris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Sony Mobile Play Memeries</title>
        <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <link rel="stylesheet" type="text/css" href="<s:url value="/resources/lib/bootstrap/css/bootstrap.css" />">
        <link rel="stylesheet" type="text/css" href="<s:url value="/resources/lib/bootstrap/css/bootstrap-responsive.css" />">
        <link rel="stylesheet" type="text/css" href="<s:url value="/resources/stylesheets/theme.css" />">
        <link rel="stylesheet" href="<s:url value="/resources/lib/font-awesome/css/font-awesome.css" />">
        <link href="<s:url value="/resources/css/main.css" />" rel="stylesheet" media="screen">
        <script src="<s:url value="/resources/lib/jquery-1.8.1.min.js" />" type="text/javascript"></script>
        <script type="text/javascript">
            function load() {
                $.get("<s:url value="/getimgs" />", function(result) {
                    var len = $('#slider img').length;
                    if (result.length != len) {
                        $('#slider').empty();
                        var html ='';
                        for (var i = 0; i < result.length; i++) {
                            if (i % 4 == 0) {
                                if(i>0){
                                    html +='</div>';
                                }
                                html +='<div class="row">';
                            }
                            html +='<div class="span3"><div class="item">';
                            html +='<img class="img-thumbnail" src="<s:url value="/resources/uploads/" />'+result[i].img+'" /></div>';
                            html +='<center>'+result[i].img+'</center>';
                            html +='</div>';
//                             var img = '<img class="img-thumbnail" src="<s:url value="/resources/uploads/" />'+result[i].img+'" />';
//                             $('#slider').append(img);
                        }
                        html +='</div>';
                        $('#slider').append(html);
                        // imageSlider.reload();
                    }
                });
            }
            $(function() {
                load();
                setInterval('load()', 1000);
            });
            
        </script>
        <!-- Demo page code -->

        <style type="text/css">
            #line-chart {
                height:300px;
                width:800px;
                margin: 0px auto;
                margin-top: 1em;
            }
            .brand { font-family: georgia, serif; }
            .brand .first {
                color: #ccc;
                font-style: italic;
            }
            .brand .second {
                color: #fff;
                font-weight: bold;
            }
        </style>

        <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
          <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->

        <!-- Le fav and touch icons -->
        <link rel="shortcut icon" href="../assets/ico/favicon.ico">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../assets/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../assets/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="../assets/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="../assets/ico/apple-touch-icon-57-precomposed.png">
    </head>

    <!--[if lt IE 7 ]> <body class="ie ie6"> <![endif]-->
    <!--[if IE 7 ]> <body class="ie ie7"> <![endif]-->
    <!--[if IE 8 ]> <body class="ie ie8"> <![endif]-->
    <!--[if IE 9 ]> <body class="ie ie9"> <![endif]-->
    <!--[if (gt IE 9)|!(IE)]><!--> 
    <body> 
        <!--<![endif]-->

        <div class="navbar">
            <div class="navbar-inner">
                <div class="container-fluid">
                    <ul class="nav pull-right">

                    </ul>
                    <a class="brand" href="index.html"><span class="first">Play</span> <span class="second">Memeries</span></a>
                </div>
            </div>
        </div>


        <div class="container">

             <div id="sliderFrame">
            <div id="slider">
<!--                               <div class="row item">
                                    <div class="span3">
                                        <img  class="img-thumbnail" src="<s:url value="/resources/uploads/11-131011114S4.jpg" />" />
                                        <center>1.jpg</center>
                                    </div>
                                    <div class="span3">
                                        <img  class="img-thumbnail" src="<s:url value="/resources/uploads/11-131011114S4.jpg" />" />
                                        <div>1.jpg</div>
                                    </div>
                                    <div class="span3">
                                        <img  class="img-thumbnail" src="<s:url value="/resources/uploads/11-131011114S4.jpg" />" />
                                        <div>1.jpg</div>
                                    </div>
                                    <div class="span3">
                                        <img  class="img-thumbnail" src="<s:url value="/resources/uploads/11-131011114S4.jpg" />" />
                                    </div>
                                  </div>
                                    <div class="row item">
                                    <div class="span3">
                                        <img  class="img-thumbnail" src="<s:url value="/resources/uploads/11-131011114S4.jpg" />" />
                                    </div>
                                    <div class="span3">
                                        <img  class="img-thumbnail" src="<s:url value="/resources/uploads/11-131011114S4.jpg" />" />
                                    </div>
                                    <div class="span3">
                                        <img  class="img-thumbnail" src="<s:url value="/resources/uploads/11-131011114S4.jpg" />" />
                                    </div>
                                    <div class="span3">
                                        <img  class="img-thumbnail" src="<s:url value="/resources/uploads/11-131011114S4.jpg" />" />
                                    </div>-->
                                  </div>
            </div>








            <!-- Le javascript
            ================================================== -->
            <!-- Placed at the end of the document so the pages load faster -->
            <script src="<s:url value="/resources/lib/bootstrap/js/bootstrap.js" />"></script>













    </body>
</html>



