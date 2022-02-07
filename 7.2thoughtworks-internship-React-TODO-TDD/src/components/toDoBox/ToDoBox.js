import React, { useState } from "react";
// import './toDoBox.css';
// import ToDoItem from './ToDoItem';
import ToDoItem from "../toDoItem/ToDoItem";

const ToDoBox = () => {
  const [doList, setDoList] = useState([]);
  const [value, setValue] = useState("");

  const handleChange = (Event) => {
    setValue(Event.target.value);
  };
  const handleEnter = (Event) => {
    if (Event.key === "Enter" && value !== "") {
      setDoList([value, ...doList]);
      setValue("");
    }
  };
  const handleClick = () => {
    if (value !== "") setDoList([value, ...doList]);
    setValue("");
  };
  function handleRemoveItem(id) {
    setDoList(doList.filter((toDo, index) => id !== index));
    console.log(id);
    // setDoList(doList.filter((item, index) => id !== index));
  }
  return (
    <div className="to-do-box">
      <h2>
        <strong>Add Tasks to your todo list</strong>
      </h2>
      <div className="to-do-input">
        <label for="name"> </label>
        <input
          data-testid="to-do-input"
          className="do-item"
          type="text"
          value={value}
          placeholder="Add Your To Do"
          onChange={handleChange}
          onKeyPress={handleEnter}
        ></input>
        <button data-testid="add-btn" className="btn" onClick={handleClick}>
          {" "}
          +{" "}
        </button>
      </div>

      <div data-testid="to-do-list">
        {doList.map((toDo, index) => (
          <ToDoItem
            key={index}
            id={index}
            text={toDo}
            onChecked={handleRemoveItem}
          />
        ))}
      </div>
    </div>
  );
};

export default ToDoBox;
