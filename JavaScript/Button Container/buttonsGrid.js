document.getElementById("btn5").onclick = function () {
    const btns = [];
    for (let i = 1; i <= 9; i++) {
      btns[i] = document.getElementById("btn" + i);
    }
  
    const temp = btns[1].innerHTML;
  
    btns[1].innerHTML = btns[4].innerHTML;
    btns[4].innerHTML = btns[7].innerHTML;
    btns[7].innerHTML = btns[8].innerHTML;
    btns[8].innerHTML = btns[9].innerHTML;
    btns[9].innerHTML = btns[6].innerHTML;
    btns[6].innerHTML = btns[3].innerHTML;
    btns[3].innerHTML = btns[2].innerHTML;
    btns[2].innerHTML = temp;
  };
  