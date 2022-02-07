import React from "react";
import ToDoBox from './ToDoBox';
import { shallow } from "enzyme";
import { fireEvent, render } from "@testing-library/react";


describe("Basic rendering of ToDoBox", () => {
    
    it("should be empty at start", () => {
        const { getByTestId } = render(<ToDoBox />);
        expect(getByTestId("to-do-input")).toBeDefined();
    })

    it("should be able to add", () => {
        const { getByTestId } = render(<ToDoBox />);
        expect(getByTestId('add-btn')).not.toHaveAttribute("disabled");
    })

})

describe("Basic ToDoBox functionality", () => {
    it("should be able to add in list", () => {
        const { getByTestId } = render(<ToDoBox />);
        fireEvent.click(getByTestId("add-btn"));
        expect(getByTestId("to-do-list")).toBeDefined();
    })
})