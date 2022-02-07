import { fireEvent, render } from "@testing-library/react";
import React from "react";
import ToDoBox from "../toDoBox/ToDoBox";
import ToDoItem from "./ToDoItem";

describe("Test remove functionality", () => {
  it("should get removed when clicked", () => {
    const view = render(<ToDoItem />);
      fireEvent.click(view.getByTestId("to-do-remover"));
      const utils = render(<ToDoBox />);
      expect(utils.getByTestId("to-do-list")).not.toBeDefined();
  });
});
