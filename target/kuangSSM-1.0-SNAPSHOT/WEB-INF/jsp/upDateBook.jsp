
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <title>Title</title>
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>

    </div>

   <form action="${pageContext.request.contextPath}/book/upDateBook" method="post">
       <input type="hidden" name="bookId" value="${QBooks.bookId}">
       <div class="from-group">
           <label>书籍名称:</label>
           <input type="text" class="form-control" name="bookName" required value="${QBooks.bookName}">
       </div>
       <div class="from-group">
           <label>书籍数量:</label>
           <input type="text" class="form-control" name="bookCounts" required value="${QBooks.bookCounts}">
       </div>
       <div class="from-group">
           <label>书籍描述:</label>
           <input type="text" class="form-control" name="detail" required value="${QBooks.detail}">
       </div>
       <div class="from-group">
           <input type="submit" class="form-control" value="修改">
       </div>

   </form>

</div>
</body>
</html>
