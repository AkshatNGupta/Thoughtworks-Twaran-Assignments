import React, { useState } from "react";
import "./toDoBox.css";
import ToDoItem from "./ToDoItem";

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
        <strong>Add your To Do's!!</strong>
      </h2>
      <div className="to-do-input">
        <label for="name"> </label>
        <input
          className="do-item"
          type="text"
          value={value}
          placeholder="Add Task"
          onChange={handleChange}
          onKeyPress={handleEnter}
        ></input>
        <button className="btn" onClick={handleClick}>
          {" "}
          +{" "}
        </button>
      </div>

      <div className="to-do-list">
        {doList.map((toDo, index) => (
          <ToDoItem
            key={index}
            id={index}
            text={toDo}
            onChecked={handleRemoveItem}
          />
        ))}
        {/* <ToDoItem text="One to do item" /> */}
      </div>
    </div>
  );
};

export default ToDoBox;
