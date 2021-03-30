<%@ page language="java" contentType="text/html; charset=UTF-8"
      pageEncoding="UTF-8"%>
  <!DOCTYPE html>
  <html>
  <head>
  <meta charset="utf-8">
  <title>Insert title here</title>
  </head>
  <body>
      <form action="/card/upload/images" enctype="multipart/form-data" method="post">
  	    <input type="file" name="file"><br><br>
  	    <input type="submit" value="上传">
      </form>
  </body>
  </html>