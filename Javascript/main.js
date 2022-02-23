let list = [];

function Todo() {
    event.preventDefault();
    let task = document.getElementById("add").value;
    list.push(task);
    console.log(list);
    const listInString = JSON.stringify(list);
    localStorage.setItem("taskList", listInString);
    renderList(); 
}
function renderList() {
      let String = localStorage.getItem("taskList");
      let Array = JSON.parse(String);
      list=Array;
      let notes="";
    for(let i=0; i<Array.length; i++) {
    
    let answer="<li class='list-group-item'>"+list[i]+"</li>";
      notes=notes+answer;

    }
   let li=document.getElementById("change");
    li.innerHTML = notes;

}
renderList();
