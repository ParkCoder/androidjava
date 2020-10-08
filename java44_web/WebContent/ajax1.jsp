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
		$('#b1').click(function() {  // 버튼1 클릭시 작동
			$.ajax({
				url:"data/member.xml", // member.xml로 연결
				success: function(doc) { // 성공시
					console.log('XML 요청 성공!!')
					console.log('XML결과: ' + doc)
					list = $(doc).find('record') // record 값을 찾아 list에 넣음
					console.log('레코드의 개수: '+ list.length) // 찾은 record 값의 length(길이, 갯수) 콘솔에 프린트
					console.log(list[0]) // list의 첫번째 값 콘솔에 프린트
					
					// list수가 0보다 많으면 반복
					if (list.length > 0) {
						$(list).each(function(index, item) {
							 // 각 변수에 record에서 text를 넣음
							id = $(item).find('id').text()
							first_name = $(item).find('first_name').text()
							last_name = $(item).find('last_name').text()
							email = $(item).find('email').text()
							gender = $(item).find('gender').text()
							ip_address = $(item).find('ip_address').text()
							// 가져온 값들을 total에 넣음
							total = 'id: '+id +', first_name: '+first_name+', last_name: '+last_name+', email: '+email+
							',  gender: '+gender+', ip_address: '+ip_address
							// 반복한 값을 콘솔 & div 출력
							console.log(total+'<br>')
							$('#d1').append(total+'<br>')
							
							// 데이터 전송 ajax
							$.ajax({
								url: "db1.jsp", //db1.jsp로 연결
								data: { 	
									id : id,
									first_name: first_name,
									last_name: last_name,
									email: email,
									gender: gender,
									ip_address: ip_address
								},
								// 성공시
								success: function(result) {
								
								}
							})
						})
					}
				}
			})
		})
		$('#b2').click(function() {
			$.ajax({
				url:"data/member.json",
				success: function(doc) {
					//alert('JSON 요청 성공!!')
					console.log(doc)
					$(doc).each(function(index, item) {
						id = item.id,
						first_name = item.first_name,
						last_name = item.last_name,
						email = item.email,
						gender = item.gender,
						ip_address = item.ip_address
						
						total = 'id: '+id +', first_name: '+first_name+', last_name: '+last_name+', email: '+email+
						',  gender: '+gender+', ip_address: '+ip_address
						// 반복한 값을 콘솔 & div 출력
						console.log(total+'<br>')
						$('#d1').append(total+'<br>')
					})
					
				}
			})
		})
		$('#b3').click(function() {
			
		})
	})
	
</script>
</head>
<body>
<button id="b1">XML 읽어오기</button>
<button id="b2">JSON 읽어오기</button>
<button id="b3">DB에 넣기</button>
<hr style="border-color: red;">
<div id="d1"></div>
</body>
</html>