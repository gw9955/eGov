<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<script type="text/javascript" src="/resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript" src="/resources/ckeditor/ckeditor.js"></script>

<!-- JSTL format을 이용하여 천단위 구분 기호를 적용할 수 있음 -->
<!-- JSTL format을 이용하여 날짜 포맷을 적용할 수 있음 -->
<div class="col-md-6">
<form name="frm" id="frm" method="post">
   <div class="card card-primary">
      <div class="card-header">
         <h3 class="card-title">Date picker</h3>
      </div>
      <div class="card-body">
      
         <input type="hidden" name="bookId" value="${bookVO.bookId}" />
         <div class="form-group">
            <label>제목:</label>
            <div class="input-group date" id="reservationdate"
               data-target-input="nearest">
               <input type="text" readonly name="title" class="form-control rounded-0"  value="${bookVO.title }"/>
            </div>
         </div>

         <div class="form-group">
            <label cursorshover="true">카테고리:</label>
            <div class="input-group date" id="reservationdatetime"
               data-target-input="nearest">
               <input type="text" name="category" readonly class="form-control rounded-0" value="${bookVO.category }"/>
            </div>
         </div>


         <div class="form-group">
            <label cursorshover="true">가격:</label>
            <div class="input-group">
               <input type="text" name="price" id="txtPrice" readonly class="form-control rounded-0"
                  value="<fmt:formatNumber value='${bookVO.price }' pattern='#,###' />" />
            </div>
         </div>


         <div class="form-group">
            <label cursorshover="true">입력일자:</label>
            <div class="input-group">
               <input type="text" readonly class="form-control" value="<fmt:formatDate value='${bookVO.insertDate }' 
      		pattern='yyyy.MM.dd' />"/>
            </div>
         </div>
         
         <div class="form-group">
            <label cursorshover="true">내용:</label>
            <div class="input-group">
            	<textarea name="content" class="form-control" readonly>${bookVO.content}</textarea>
            </div>
         </div>
         <!-- 일반모드 시작 -->
         <div id="spn1" class="card-footer">
         <div style="text-align:right">
            <button type="button" id="edit" class="btn bg-gradient-success btn-sm">수정</button>
            <a href="/book/list" class="btn bg-gradient-warning btn-sm">목록</a>
         </div>
         </div>
         <!-- 일반모드 끝 -->
         <!-- 수정모드 시작 -->
         <div id="spn2" class="card-footer" style="display:none;">
         <div style="text-align:right">
            <button type="submit" class="btn bg-gradient-primary btn-sm">확인</button>
            <a href="/book/detail?bookId=${bookVO.bookId }" class="btn bg-gradient-danger btn-sm">취소</a>
         </div>
         </div>
         <!-- 수정모드 끝 -->
<!--          <div style="float:right;"> -->
<!--             <a href="#" class="btn btn-block bg-gradient-success btn-sm">수정</a> -->
<!--          </div> -->
<!--          <div style="float:right;margin:0 10px 0 0;"> -->
<!--             <a href="/book/list" class="btn btn-block bg-gradient-warning btn-sm">목록</a> -->
<!--          </div> -->
      </div>
   </div>
   </form>
</div>
<script type="text/javascript">
$(function(){
   alert("jquery동작");
   //수정버튼 클릭-> 수정모드로 전환
   $("#edit").on("click", function(){
      //일반모드
      $("#spn1").css("display","none");   
      //수정모드
      $("#spn2").css("display","block");   
      //제목, 카테고리, 가격은 수정 가능 but, 입력일자는 readonly유지
      $(".rounded-0").removeAttr("readonly");
      //제목, 카테고리, 가격에 required 속성 추가
      $(".rounded-0").attr("required",true);
      //책 내용 처리
      CKEDITOR.instances['content'].setReadOnly(false);
      //form action 추가
      $("#frm").attr("action","/book/updatePost");
   });
   
   //숫자 입력 validate
   $("#txtPrice").on("keyup", function(){
      $(this).val($(this).val().replace(/[^0-9]/g," "));
   });
});
</script>
<script type="text/javascript">
CKEDITOR.replace("content");
</script>





