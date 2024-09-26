package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController
{
    @FXML
    private Label welcomeText;

    @FXML
    void appendNumber()
    {

    }
    @FXML
    void selectOperator()
    {
        double numbers = Double.parseDouble(welcomeText.getText());
    }
    @FXML
    void calculate() {
        Label result_lbl = null;
        double firstNum = 0;
        double secondNum = Double.parseDouble(result_lbl.getText());
        Label running_lbl = null;
        String operator = null;
        running_lbl.setText(firstNum + " " + operator + " " + secondNum);
        switch (operator) {
            case "addition":
                firstNum += secondNum;
                break;
            case "subtraction":
                firstNum -= secondNum;
                break;
            case "multiplication":
                firstNum *= secondNum;
                break;
            case "clear":
                running_lbl = null;
                result_lbl = null;
                break;
            case "equals":
                running_lbl = result_lbl;
                break;
            case "close_btn":
                break;
            case "minimize_btn":
                break;
            case "division":
                if (secondNum != 0) {
                    firstNum /= secondNum;
                } else {
                    result_lbl.setText(("Error 404 Nononono dont do tis"));
                }
                break;
        }
    }
}