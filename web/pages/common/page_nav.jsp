<%--
  Created by IntelliJ IDEA.
  User: Rewrite
  Date: 2022/5/21
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="page_nav">
    <c:if test="${requestScope.page.pageNo > 1}">
        <a href="${requestScope.page.url}&pageNo=1">首页</a>
        <a href="${requestScope.page.url}&pageNo=${requestScope.page.pageNo-1}">上一页</a>
    </c:if>

    <c:choose>
        <%--情况1：如果总页码小于等于5的情况，页码的范围是：总页码--%>
        <c:when test="${requestScope.page.pageTotal<=5}">
            <c:set var="begin" value="1"/>
            <c:set var="end" value="5"/>
        </c:when>

        <%--情况2：如果总页码大于5的情况，页码的范围是：5--%>
        <c:when test="${requestScope.page.pageTotal>5}">
            <c:choose>
                <c:when test="${requestScope.page.pageNo<=3}">
                    <c:set var="begin" value="1"/>
                    <c:set var="end" value="5"/>
                </c:when>

                <c:otherwise>
                    <c:set var="begin" value="${requestScope.page.pageNo-2}"/>
                    <c:set var="end" value="${requestScope.page.pageNo+2}"/>
                </c:otherwise>

                <c:when test="${requestScope.page.pageNo>=requestScope.page.page.Total-2}">
                    <c:set var="begin" value="${requestScope.page.page-4}"/>
                    <c:set var="end" value="${requestScope.page.page.total}"/>
                </c:when>
            </c:choose>
        </c:when>
    </c:choose>

    <c:forEach begin="${begin}" end="${end}" var="i">
        <c:if test="${i == requestScope.page.pageNo}">
            【${i}】
        </c:if>
        <c:if test="${i != requestScope.page.pageNo}">
            <a href="${requestScope.page.url}&pageNo=${i}">${i}</a>
        </c:if>
    </c:forEach>

    <a href="${requestScope.page.url}&pageNo=${requestScope.page.pageNo-1}">
        ${requestScope.page.pageNo}</a>
    【${requestScope.page.pageNo}】
    <a href="#">
        ${requestScope.page.pageNo}
    </a>

    <c:if test="${requestScope.page.pageNo < requestScope.page.pageTotal}">
        <a href="${requestScope.page.url}&pageNo=${requestScope.page.pageNo+1}">下一页</a>
        <a href="${requestScope.page.url}&pageNo=${requestScope.page.pageTotal}">末页</a>
    </c:if>
    共${requestScope.page.pageTotal}页，${requestScope.page.pageTotalCount}条记录

    到第<input value="${param.pageNo}" name="pn" id="pn_input"/>页
    <input id="search" type="button" value="确定">

    <script type="text/javascript">
        $(function () {

            $("#search").click(function () {
                var pageNo = $("#pn_input").val();
                if (pageNo >= 1 && pageNo <= ${requestScope.page.pageTotal} && pageNo % 1 == 0) {
                    location.href = "${pageScope.basePath}${requestScope.page.url}&pageNo=" + pageNo
                } else {
                    alert("输入页码错误")
                }
            })
        })
    </script>
</div>
