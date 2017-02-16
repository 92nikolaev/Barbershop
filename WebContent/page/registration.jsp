<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ru">
	<head>
		<meta charset="utf-8">
		<title>Barber shop Registration</title>
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
								<a href="#">Информация</a>
							</li>
							<li>
								<a href="#">Новости</a>
							</li>
							<li>
								<a href="price-list">Прайс-лист</a>
							</li>
							<li>
								<a href="shop.html">Магазин</a>
							</li>
							<li>
								<a href="#">Контакты</a>
							</li>
						</ul>	
					</nav>
				
				</div>
		</header>
		<main class="container">
		<div class="inner-page-title">
			<h1>Регистрация</h1>
			<ul class="breadcrumbs">
				<li>
					<a href="index">Главная</a>
				</li>
				<li class="current">
					Регистрация
				</li>			
			</ul>
		</div>
		<div class="inner-content">
			<div class="big-heading">
				<h2>Регистрация</h2>
			</div>
			</div>
			<div class="inner-columns clearfix">
				<div class="registration-content">
						<h3>
						Заполните поля для регистрации!
						</h3>
						<form class="registration-form" action="controller" method="post">
							<input type="text" name="user_name"  required placeholder="Имя">
							<input type="text" name="user_surname" required placeholder="Фамилия">
							<input type="text" name="user_email"  required placeholder="Емаил">
							<input type="text" name="user_login"  required placeholder="Логин">
							<input type="password" name="user_password"  required placeholder="Пароль">
							<input type="password" name="user_regist_password" required placeholder="Повтарите Пароль">
							
							<button class="btn" type="submit" name="command" value="registration">Отправка</button>
						</form>
				</div>	
				
		</div>
		</main>
		<footer class="main-footer">
			<div class="container clearfix">
				<section class="footer-contacts">
					Барбершоп Borodinski <br>
					Адрес: г.Минск, Валерьяново д. 18<br>
					<a href="#">Как нас найти?</a><br>
					Телефон: +375(29)555-55-22
				</section>
				<section class="footer-social">
					<p>
						Давайте дружить!
					</p>
					<a class="social-btn social-btn-vk" href="#">Вконтакте</a>
					<a class="social-btn social-btn-fb" href="#">Фейсбук</a>
					<a class="social-btn social-btn-inst" href="#">Инстаграм</a>
					
				</section>
				<section class="footer-copyright">
					<p>Разработано:</p>
					<a class="btn" href="#">Николаев Илья</a>
				</section>
				
			</div>
		</footer>
		
	</body>
	
</html>