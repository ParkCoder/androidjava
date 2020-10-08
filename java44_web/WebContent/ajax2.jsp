<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.5.1.js"></script>
<script type="text/javascript">
/* 	콜백함수(call-back 함수)
	:특정한 이벤트를 기다렸다가 그 이벤트가 발생하면 함수가 정의되어있는 곳으로 돌아가 자동으로 호출되는 함수
	함수가 정의 되어있는 곳으로 돌아가 자동 호출되는 함수
	body의 하위 엘리먼트(태그)를 먼저 브라우저가 dom-tree를 구성한 후 콜백함수를 정의하게 되어있음.
	브라우저가 스크립트를 먼저 실행하고 인식하는 것이 아니라 body부분을 먼저 읽어서 dom-tree를 만들도록 해야함 */
	
	
	$(function() {
		//헬스
		$('#b1').click(function() {
			$('#d1').empty();
			
			$.ajax({
				url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fhealth.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=n8jjr4pqpqag58xtrivh7ozbohfbq3fvqm8yfllg",
				data:{
					url:'http://health.chosun.com/site/data/rss/rss.xml',
					api_key:'n8jjr4pqpqag58xtrivh7ozbohfbq3fvqm8yfllg',
					count:20
				},
				success: function(result) {
					console.log('성공!!'+ result)
					list = result.items
					console.log(list.length)
					if (list.length > 0) {
						$(list).each(function(index, news) {
							title = news.title
							pubDate = news.pubDate
							link = news.link
							console.log(title)
							console.log(pubDate)
							console.log(link)
							total="<b><a href=" +link + ">" + title + "</a></b> : " + pubDate + "<br>" /* + link */
							
							$('#d1').append(total+"<hr>")
						})
					}
				}
			})
		})
		//트레블
			$('#b2').click(function() {
				$('#d1').empty();
				
				$.ajax({
				url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Ftravel.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=n8jjr4pqpqag58xtrivh7ozbohfbq3fvqm8yfllg",
				data:{
					url:'http://travel.chosun.com/site/data/rss/rss.xml',
					api_key:'n8jjr4pqpqag58xtrivh7ozbohfbq3fvqm8yfllg',
					count:20
				},
				success: function(result) {
					console.log('성공!!'+ result)
					list = result.items
					console.log(list.length)
					if (list.length > 0) {
						$(list).each(function(index, news) {
							title = news.title
							pubDate = news.pubDate
							link = news.link
							console.log(title)
							console.log(pubDate)
							console.log(link)
							total="<b><a href=" + link + ">" + title + "</a></b> : " + pubDate + "<br>" /* + link */
							
							$('#d1').append(total+"<hr>")
						})
					}
				}
			})
		})
		
		//영문
		$('#b3').click(function() {
			$('#d1').empty();
			$.ajax({
				url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fenglish.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=n8jjr4pqpqag58xtrivh7ozbohfbq3fvqm8yfllg",
				data:{
					url:'http://english.chosun.com/site/data/rss/rss.xml',
					api_key:'n8jjr4pqpqag58xtrivh7ozbohfbq3fvqm8yfllg',
					count:20
				},
				success: function(result) {
					console.log('성공!!'+ result)
					list = result.items
					console.log(list.length)
					if (list.length > 0) {
						$(list).each(function(index, news) {
							title = news.title
							pubDate = news.pubDate
							link = news.link
							console.log(title)
							console.log(pubDate)
							console.log(link)
							total="<b><a href=" +link + ">" + title + "</a></b> : " + pubDate + "<br>"/*  + link */
							
							$('#d1').append(total+"<hr>")
						})
					}
				}
			})
		})
		//연예 한국경제
		$('#b4').click(function() {
			$('#d1').empty();
			$.ajax({
				url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Ftravel.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=n8jjr4pqpqag58xtrivh7ozbohfbq3fvqm8yfllg",
				data:{
					url:'http://travel.chosun.com/site/data/rss/rss.xml',
					api_key:'n8jjr4pqpqag58xtrivh7ozbohfbq3fvqm8yfllg',
					count:5
				},
				success: function(result) {
					console.log('성공!!'+ result)
					list = result.items
					console.log(list.length)
					if (list.length > 0) {
						$(list).each(function(index, news) {
							image = news.thumbnail
						/* 	total = "<img src='"+image+"'>" + link  */
							total = "<a href="+ link +">"+ "<img src='" + image + "'></a>"

							$('#d1').append(total+"<hr>")
						})
					}
				}
			})
		})
		
	})
	
</script>
</head>
<body>
<button id="b1" style="background: red; color: white;">헬스 조선</button>
<button id="b2" style="background: red; color: white;">트래블 조선</button>
<button id="b3" style="background: red; color: white;">영문 조선</button>
<button id="b4" style="background: steelblue; color: white;">연예 한경</button>
<button id="b5" style="background: steelblue; color: white;">포토 한경</button>
<hr style="border-color: red;">
<div id="d1"></div>

</body>
</html>