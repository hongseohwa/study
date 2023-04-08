/**
 * Ex02.html 파일과 연동된 자바스크립트 파일
 */

const title = document.querySelector("#title");
const userName = document.querySelectorAll(".user")[0];
const userImage = document.querySelector("#profile img");

/* 가져온 요소에 변경 작업 진행 */
// title.onclick = () => title.innerText = "프로필";
title.onclick = function() {
	title.innerText = "프로필";
	title.style.backgroundColor = "black";
	title.style.color = "white";
}

userName.onclick = () => userName.innerHTML = `이름 : <b>민들레</b>`;
userImage.onclick = () => userImage.src = "../images/pf2.png";