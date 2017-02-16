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
	<body>
		<header class="main-header">
				<div class="container clearfix">
					<nav class="main-navigation">
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
					<div class="user-block">
						<a class="login" href="#">Вход</a>
					</div>
				
				</div>
		</header>
		<main class="container">
			<div class="index-logo">
				<img src="img/index-logo.png" width="368" height="204" alt="Барбершоп <<Borodinski>>">	
			</div>
			<section class="features clearfix">
				<div class="features-item">
					<b class="features-name">Быстро</b>
					<p>
						Мы делаем свою работу быстро! Два часа пролетят незаметно
						и вы - счастливый обладатель стильной стрижки-минутки!
					</p>
				</div>
				<div class="features-item">
					<b class="features-name">Круто</b>
					<p>
						Забудьте, как вы стриглись раньше. Мы сделаем из вас звезду футбола или кино!
						Во всяком случае внешнею
					</p>
				</div>
				<div class="features-item">
					<b class="features-name">Дорого</b>
					<p>
						Наши мастера - профессионалы своего дела и не могут стоить дешево.
						К тому же, разве цена не дает определенный статус?
					</p>
				</div>
			</section>	
				<div class="index-content clearfix">
					<div class="index-content-left">
						<h2 class="index-content-title">Новости</h2>
						<ul class="news-preview">
							<li>
								<p>
									Нам наконец завезли Ягермайстер! Теперь вы можете
									пропустить стаканьчик во время стрижки
								</p>
								<time datetime="2017-01-11">11 Января</time>
							</li>
							<li>
								<p>
									В нашей команде пополнение, Борис "Бритва" Стригунец, обладатель
									множества титулов и наград пополнил наши стройные ряды
								</p>
								<time datetime="2017-01-05">5 Января</time>
							</li>
						</ul>
						<a class="btn" href="#">Все новости</a>
					</div>
					<div class="index-content-right">
						<h2 class="index-content-title">Фотогалерея</h2>
						<div class="gallery">
							<figure class="gallery-content">
								<img src="img/photo-1.jpg" width="286" height="164" alt="">
							</figure>
							<button class="btn gallery-prev" type="button">Назад</button>
							<button class="btn gallery-next" type="button">Вперед</button>						
						</div>
					</div>
				</div>
				<div class="index-content clearfix">
					<div class="index-content-left">
						<h2 class="index-content-title">Контактная информация</h2>
						<p>
							Барбершоп Borodinski <br>
							Адрес: г.Минск, Валерьяново д. 18<br>
							Телефон: +375(29)555-55-22
						</p>	
						<p>
							Время работы:<br>
							пн - пт: c 10:00 до 22:00<br>
							сб - вс: с 10:00 до 19:00
						</p>
						<a class="btn js-open-map" href="#">Как проехать</a>
						<a class="btn" href="#">Обратная связь</a>
					</div>	
					<div class="index-content-right">
						<h2 class="index-content-title">Записаться</h2>
						<p>
						Укажите желаемую дату и время
						и мы свяжемся с вами для подтверждения брони
						</p>
						<form class="appointment-form" action="do.do" method="post">
							<input type="text" name="date" value="" placeholder="Дата">
							<input type="text" name="time" value="" placeholder="Время">
							<input type="text" name="name" value="" placeholder="Имя">
							<input type="tel" name="tel" value="" placeholder="Телефон">
							<button class="btn" type="submit">Отправка</button>
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
		<!-- POP UP логинация -->
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