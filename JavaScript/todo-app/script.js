const form = document.getElementById("form");
const input = document.getElementById("input");
const todosUL = document.getElementById("todos");

const todos = JSON.parse(localStorage.getItem("todos"));

if (todos) {
  todos.forEach((todo) => {
    addToDo(todo);
  });
}

form.addEventListener("submit", (e) => {
  e.preventDefault();

  addToDo();
});

function addToDo(todo) {
  let todoText = input.value;

  if (todo) {
    todoText = todo.text;
  }

  if (todoText) {
    const todoEl = document.createElement("li");
    const icon = document.createElement("i");

    if(todo && todo.completed){
      todoEl.classList.add("completed");
      icon.classList.add("completed");
    }

    todoEl.innerText = todoText;
    todosUL.appendChild(todoEl);
    input.value = "";

    icon.classList.add("fa", "fa-trash", "icon");
    todoEl.appendChild(icon);

    todoEl.addEventListener("click", () => {
      todoEl.classList.toggle("completed");
      icon.classList.toggle("completed");

      updateLS();
    });

    icon.addEventListener("click", (e) => {
      e.preventDefault();

      todoEl.remove();
      updateLS();
    });

    updateLS();
  }
}

function updateLS() {
  const todosEl = document.querySelectorAll("li");

  const todos = [];

  todosEl.forEach((todoEl) => {
    todos.push({
      text: todoEl.innerText,
      completed: todoEl.classList.contains("completed"),
    });
  });

  localStorage.setItem("todos", JSON.stringify(todos));
}
