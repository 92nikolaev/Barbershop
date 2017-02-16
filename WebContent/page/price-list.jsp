<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
								<a href="#">Информация</a>
							</li>
							<li>
								<a href="#">Новости</a>
							</li>
							<li class="active">
								<span>Прайс-лист</span>
							</li>
							<li>
								<a href="shop.html">Магазин</a>
							</li>
							<li>
								<a href="#">Контакты</a>
							</li>
						</ul>	
					</nav>
					<div class="user-block">
						<a class="login" href="registration">Вход</a>
					</div>
				
				</div>
		</header>
		<main class="container">
		<div class="inner-page-title">
			<h1>Прайс-лист</h1>
			<ul class="breadcrumbs">
				<li>
					<a href="index">Главная</a>
				</li>
				<li class="current">
					Прайс-лист
				</li>			
			</ul>
		</div>
		<div class="inner-content">
			<div class="big-heading">
				<h2>Истинно мужская классика</h2>
			</div>
			<div class="inner-columns clearfix">
				<div class="inner-column-left">
					<ul class="custom-list-1">
					<h2>Мы используем только лучшие средства</h2>
						<li>Baxter of California</li>
						<li>Mr Natty</li>
						<li>Suavecito</li>
						<li>Malin+Goetz</li>				
					</ul>
				</div>
				<div class="inner-column-right">	
					<h2>Цены на услуги наших мастеров:</h2>
					<table class="price-table">
						<tr>
							<td>Стрижка</td>
							<td>50 р.</td>
						</tr>
						<tr>
							<td>Стрижка бороды</td>
							<td>20 р.</td>
						</tr>
						<tr>
							<td>Накрутка усов</td>
							<td>15 р.</td>
						</tr>
					</table>
				</div>	
			</div>
			<div class="inner-columns clearfix">
				<h2>Несколько слов о нас:</h2>
				<div class="inner-column-left">
					<p>	
						Наша парикмахерская заниается исключительно мужскими стрижками.
						Стрижка каждого клиента для нас - это уникальная и продуманая до мелочей работа.
						Мы не работаем на качество, мы делаем качество.
					</p>
				</div>
				<div class="inner-column-right">
					<p>
						Наша мастерская расположена в центре города, поэтому стильную стрижку можно сделать в любое время, даже в обеденный перерыв.
						Здесь вы можете погрузиться в удобную для вас атмосферу, чувствовать себя комфортно и свободно!
					</p>
				</div>
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
					<a class="btn" href="https://htmlacademy.ru">Николаев Илья</a>
				</section>
				
			</div>
		</footer>
		<div class="modal-content">
			<button class="modal-content-close" type="button" title="Закрыть">Закрыть</button>
			<h2 class="modal-content-title">Личтный кабинет</h2>
			<p>Введите свой логин и пароль</p>
			<form class="login-form" action="pa" method="post">
				<input class="icon-user" type="text" name="login" placeholder="Логин">
				<input class="icon-password" type="password" name="password" placeholder="Пароль">
				<label class="login-checkbox">
					<input type="checkbox" name="remember">
					<span class="checbox-indicator"></span>
					Запомнить меня
					</label>
					<a class="restore" href="#">Я забыл пароль</a>
					<a class="restore" href="registration">Регистрация</a>
				
				<button class="btn" type="submit">Войти</button>
			</form>
		</div>
		<div class="modal-overlay"></div>
		<script src="js/javascript.js"></script>
	</body>
</html>