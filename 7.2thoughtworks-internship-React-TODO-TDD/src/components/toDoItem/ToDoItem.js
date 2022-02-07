import React from "react";

const ToDoItem = (props) => {
    let space = "..       |";
  return (
    <div className="to-do-item">
      <p className="to-do-text">
              {props.text}
              {space}
        <span>
          <button
            data-testid="to-do-remover"
            onClick={() => props.onChecked(props.id)}>
                      {" "}-{" "}
          </button>
        </span>
      </p>
    </div>
  );
};

export default ToDoItem;
