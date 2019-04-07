<%-- 
    Document   : newjsf
    Created on : Apr 2, 2019, 11:56:24 PM
    Author     : Trong
--%>
<html>
   <head>
      <meta charset="UTF-8" />
      <title>Welcome</title>
     
   </head>
   <body>
      <h1>Welcome</h1>
      <div class="brands_products"><!--brands_products-->
     <h2>Brands</h2>
     <div class="brands-name">
           <ul class="nav nav-pills nav-stacked">
                <c:forEach var="item" items="${listCategory}">
                    <li><a href="#"> ${item.employeeName}</a></li>
                </c:forEach>
           </ul>
     </div>
</div
     
       
   </body>
   
</html>


