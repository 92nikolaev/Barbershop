<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="../../pagehelp/localization.jspf" %>
<!DOCTYPE html>
<html lang="ru">
	<head>
		<meta charset="utf-8">
		<title>Barber shop</title>
		<link rel="stylesheet" href="css/normalize.css">
		<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=PT+Sans+Narrow:400,700&amp;subset=cyrillic">
		<link rel="stylesheet" href="css/style.css">
	</head>
	<body class="inner-page">
		<header class="main-header"> 
				<div class="container clearfix">
					<nav class="main-navigation">
						<a class="logo-inner" href="index">
							<img src="img/loggo-inner.png" width="111" height="24" alt="Borodinski">
						</a>
						<ul>						
							<li>
								<a href="information">${navigation_Information}</a>
							</li>
							<li>
								<a href="controller?command=showAllNews">${navigation_news}</a>
							</li>
							<li>
								<a href="#">${navigation_price}</a>
							</li>
							<li>
								<a href="shop">${navigation_shop}</a>
							</li>
							<li>
								<a href="contact">${navigation_contacts}</a>
							</li>
						</ul>	
					</nav>
					
					<div class="user-block">
						<c:if test="${sessionScope.loggedAdmin == null}">
							<a class="login" href="#">${navigation_signIn}</a>
						</c:if>
						<c:if test="${sessionScope.loggedAdmin == true}">
						<form action="controller" method="post">
							<button class="btn exit" type="submit" name="command" value="signout">Выход</button>
						</form>
							<a class="login1" href="cabinet">
								<c:out value="${superUser.name}"></c:out>
							</a>
						</c:if>
					</div>
				</div>
		</header>
		
		<main class="container">
			<div class="title">
		  		<div>
		  			<h2>Register for a haircut</h2>
		  		</div>
<!-- 		  		<div class="col-md-4"> -->
<!-- 		  		<a href="administration"><button type="button" class="btn btn-default form-control">Balck to admin panel</button></a>  -->
<!-- 		  		</div> -->
			</div>
		 	<table class="admin_table">
		  		<thead>
		      		<tr class="admin_table">
		        		<th>Haircut_id</th>
		        		<th>Client_name</th>
		        		<th>Haircut Date</th>
		         		<th>Haircut Time</th>		  
		        		<th>Client Phone</th>
		        		<th>User .....</th>	
		        		<th>Booking confirmation .....</th>	
		        		<th>Check Booking confirmation</th>	
		      		</tr>
		    	</thead>
		    	
				<c:forEach items="${sessionScope.record_list}" var = "record" >   
		  			<tbody>
		   				<tr class="admin_table">
				        	<td>${record.id}</td>
				        	<td>${record.name}</td>
				        	<td>${record.data}</td>
				      		<td>${record.time}</td>
				        	<td>${record.phone}</td>
				        	<c:choose>
					        	<c:when test="${record.userId == null}">
					        		<td>Not registered</td>
					        	</c:when>
					        	<c:when test="${record.userId != null}">
					        		<td>${record.userId}</td>
					        	</c:when>
				        	</c:choose>
				        	<td>Temporarily unavailable</td>
				        	<td>
				        		<form action="Controller" method="get"> 
				        			<input type="hidden" name="command" value="booking_confirmation" />
					        		<button  class ="btn" type="submit" name="record_id" value="${record.id}">Booking confirmation</button> 
					    		</form>
					    	</td>
		      			</tr>
		    		</tbody>
				</c:forEach>
		  	</table>
		</main>
		
		<footer class="main-footer">
			<div class="container clearfix">
				<section class="footer-contacts">
					${footer_contacts_first} <br>
					${footer_contacts_second}<br>
					<a href="#">${footer_contacts_thrid}</a><br>
					${footer_contacts_forsth}
				</section>
				<section class="footer-social">
					<p>
						${footer_social}
					</p>
					<a class="social-btn social-btn-vk" href="#">Вконтакте</a>
					<a class="social-btn social-btn-fb" href="#">Фейсбук</a>
					<a class="social-btn social-btn-inst" href="#">Инстаграм</a>
					
				</section>
				<section class="footer-copyright">
					<p>${footer_copyright}</p>
					<a class="btn" href="#">Николаев Илья</a>
				</section>
			</div>
		</footer>
		<!-- POP UP логинация -->
		<div class="modal-content">
			<button class="modal-content-close" type="button" title="Закрыть">Закрыть</button>
			<h2 class="modal-content-title">Личный кабинет</h2>
			<p>Введите свой логин и пароль</p>
			<form class="login-form" action="controller" method="post">
				<input class="icon-user" type="text" name="user_login" placeholder="Логин" required="required">
				<input class="icon-password" type="password" name="user_password" placeholder="Пароль" required="required">
				<label class="login-checkbox">
					<input type="checkbox" name="remember">
					<span class="checbox-indicator"></span>
					Запомнить меня
					</label>
					<a class="restore" href="#">Я забыл пароль</a>
					<a class="restore" href="registration">Регистрация</a>
				
				<button class="btn" type="submit" name="command" value="signin">Войти</button>
			</form>
		</div>
		<!-- КАРТА С POP-UP -->
		<div class="modal-content-map">
			 <button class="modal-content-close" type="button" title="Закрыть">Закрыть</button>
			 <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2346.8370973253445!2d27.664170516205665!3d53.97016048011455!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x46dbc8de62279abb%3A0x2a802aca07fcef6a!2z0YPQuy4g0JLQsNC70LXRgNGM0Y_QvdC-0LLQviAxNiwg0JLQsNC70LXRgNGM0Y_QvdC-0LLQviAyMjMwNTMsINCR0LXQu9Cw0YDRg9GB0Yw!5e0!3m2!1sru!2sru!4v1484740519890" width="766" height="561" frameborder="0" style="border:0" allowfullscreen></iframe>
			 <div class="yandex-map"></div>
		</div>
		<div class="modal-overlay"></div>
		
		<script src="js/javascript.js"></script>
	</body>
</html>