/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

/**
 *
 * @author Paweł
 */
public class Controller {

    @FXML
    private Canvas viewport;

    public void initialize() {
        prepareBackground();
    }

    @FXML
    public void recognizeOperation(KeyEvent k) {
        String key = k.getCode().toString();
        
        switch (key) {
            case "UP":
                System.out.println("up");
                break;
            case "DOWN":
                System.out.println("down");
                break;
            case "RIGHT":
                System.out.println("right");
                break;
            case "LEFT":
                System.out.println("left");
                break;
            case "PERIOD":
                System.out.println(".");
                break;
            case "COMMA":
                System.out.println(",");
                break;
            case "W":
                System.out.println("w");
                break;
            case "S":
                System.out.println("s");
                break;
            case "A":
                System.out.println("a");
                break;
            case "D":
                System.out.println("d");
                break;
            case "Z":
                System.out.println("z");
                break;
            case "X":
                System.out.println("x");
                break;
            case "OPEN_BRACKET":
                System.out.println("[");
                break;
            case "CLOSE_BRACKET":
                System.out.println("]");
                break;
            default:
                break;
        }
    }

    public void focus() {
        viewport.requestFocus();
    }

    private void prepareBackground() {
        GraphicsContext gc = viewport.getGraphicsContext2D();
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, 1200, 600);
        gc.beginPath();
        gc.moveTo(0, 0);
        gc.lineTo(1200, 0);
        gc.lineTo(1200, 600);
        gc.lineTo(0, 600);
        gc.lineTo(0, 0);
        gc.stroke();
    }

}
