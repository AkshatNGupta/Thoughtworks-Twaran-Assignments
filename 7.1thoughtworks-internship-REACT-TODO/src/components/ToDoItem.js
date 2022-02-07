import React from "react";
import "./ToDoItem.css";

const ToDoItem = (props) => {
  return (
    <div className="to-do-item">
      <p className="to-do-text">{props.text}</p>
      <p
        className="to-do-remover"
        onClick={() => {
          props.onChecked(props.id);
        }}
      >
        X
      </p>
    </div>
  );
};

export default ToDoItem;
