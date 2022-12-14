<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%> 
<script type="text/javascript" src="/resources/ckeditor/ckeditor.js"></script>

<div class="col-md-6" style="width: 900px;">
	<form name="frm" id="frm" method="post" action="/book/insertPost">
	<div class="card card-primary" style="width: 900px;">
		<div class="card-header">
			<h3 class="card-title">${bodyTitle}</h3>
		</div>
		<div class="card-body">
			<div class="form-group">
				<label>제목:</label>
				<div class="input-group date" id="reservationdate"
					data-target-input="nearest">
					<input type="text" name="title" class="form-control" value="${bookVO.title}" required />
				</div>
			</div>

			<div class="form-group">
				<label>카테고리:</label>
				<div class="input-group date" id="reservationdate"
					data-target-input="nearest">
					<input type="text" name="category" class="form-control" value="${bookVO.category}" required />
				</div>
			</div>
			
			<div class="form-group">
				<label>가격:</label>
				<div class="input-group date" id="reservationdate"
					data-target-input="nearest">
					<input type="text" name="price" class="form-control" value="${bookVO.price }" required />
				</div>
			</div>

			<div class="form-group">
				<label>내용:</label>
				<div class="input-group date" >
					<textarea id="content" name="content"
					class="form-control" rows="4" style="height: 124px;"></textarea>
				</div>
			</div>

			<div class="card-footer">
				<div style="float:right;margin:0 10px 0 0;">
					<button type="submit"
					 class="btn btn-block btn-primary btn-sm">확인</button>
				</div>
				<div style="float:right;">
					<a href="/book/list"
					 class="btn btn-block btn-success btn-sm">목록</a>
				</div> 
			</div>
		</div>
	</div>
	<sec:csrfInput/>
	</form>
</div>
<script type="text/javascript">
CKEDITOR.replace("content");
</script>