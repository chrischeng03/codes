<%-- 
    Document   : result
    Created on : 2013-9-24, 21:38:19
    Author     : chris
--%>

<%@page contentType="text/html" pageEncoding="GBK"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Auto Preview</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Bootstrap -->
        <link href="<s:url value="/resources/libs/bootstrap/css/bootstrap.min.css" />" rel="stylesheet" media="screen">
        <link href="<s:url value="/resources/css/main.css" />" rel="stylesheet" media="screen">

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.6.2/html5shiv.js"></script>
          <script src="<s:url value="/resources/libs/bootstrap/js/respond.min.js" />"></script>
        <![endif]-->
        <script src="<s:url value="/resources/js/jquery.1.9.1.min.js" />" type="text/javascript"></script>
        <script src="<s:url value="/resources/libs/bootstrap/js/bootstrap.min.js" />"></script>
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
                                html +='<div class="row item">';
                            }
                            html +='<div class="col-md-3">';
                            html +='<img class="img-thumbnail" src="<s:url value="/resources/uploads/" />'+result[i].img+'" />';
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
    </head>
    <body>
    <center><h3>Picture</h3></center><hr/>
    <div class="container">
        <div id="sliderFrame">
            <div id="slider">
                <!--                <div class="row item">
                                    <div class="col-md-3">
                                        <img  class="img-thumbnail" src="<s:url value="/resources/uploads/2.jpg" />" />
                                        <center>1.jpg</center>
                                    </div>
                                    <div class="col-md-3">
                                        <img  class="img-thumbnail" src="<s:url value="/resources/uploads/3.jpg" />" />
                                        <div>1.jpg</div>
                                    </div>
                                    <div class="col-md-3">
                                        <img  class="img-thumbnail" src="<s:url value="/resources/uploads/4.jpg" />" />
                                        <div>1.jpg</div>
                                    </div>
                                    <div class="col-md-3">
                                        <img  class="img-thumbnail" src="<s:url value="/resources/uploads/5.jpg" />" />
                                    </div>
                                  </div>
                                    <div class="row item">
                                    <div class="col-md-3">
                                        <img  class="img-thumbnail" src="<s:url value="/resources/uploads/2.jpg" />" />
                                    </div>
                                    <div class="col-md-3">
                                        <img  class="img-thumbnail" src="<s:url value="/resources/uploads/3.jpg" />" />
                                    </div>
                                    <div class="col-md-3">
                                        <img  class="img-thumbnail" src="<s:url value="/resources/uploads/4.jpg" />" />
                                    </div>
                                    <div class="col-md-3">
                                        <img  class="img-thumbnail" src="<s:url value="/resources/uploads/5.jpg" />" />
                                    </div>
                                  </div>-->
            </div>
        </div>
    </div>
</body>
</html>