<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div class="col-md-6" style="width: 900px;">
	<div class="card card-primary" style="width: 900px;">
		<div class="card-header">
			<h3 class="card-title">Date picker</h3>
		</div>
		<div class="card-body">

			<div class="form-group">
				<label>제목:</label>
				<div class="input-group date" id="reservationdate"
					data-target-input="nearest">
					<input type="text" class="form-control" value="${bookVO.title}" readonly />
				</div>
			</div>

			<div class="form-group">
				<label>카테고리:</label>
				<div class="input-group date" id="reservationdate"
					data-target-input="nearest">
					<input type="text" class="form-control" value="${bookVO.category}" readonly />
				</div>
			</div>
			
			<div class="form-group">
				<label>가격:</label>
				<div class="input-group date" id="reservationdate"
					data-target-input="nearest">
					<input type="text" class="form-control" value="<fmt:formatNumber value="${bookVO.price }" pattern="#,###" />" readonly />
				</div>
			</div>

			<div class="form-group">
				<label>입력일자:</label>
				<div class="input-group date" id="reservationdate"
					data-target-input="nearest">
					<input type="text" class="form-control" value="<fmt:formatDate value="${bookVO.insertDate}" pattern="yyyy.MM.dd HH:mm:ss" />" readonly />
				</div>
			</div>
			
			<div class="form-group">
				<label>내용:</label>
				<div class="input-group date" id="reservationdate"
					data-target-input="nearest">
					<input type="text" class="form-control" value="${bookVO.content}" readonly />
				</div>
			</div>
			
			<div class="card-footer">
				<div style="float:right;margin:0 10px 0 0;">
					<button type="button"
					 class="btn btn-block btn-warning btn-sm">확인</button>
				</div>
				<div style="float:right;">
					<a href="/book/list"
					 class="btn btn-block btn-success btn-sm">취소</a>
				</div> 
			</div>
		</div>
	</div>
</div>