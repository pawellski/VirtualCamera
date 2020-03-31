/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import camera.Camera;
import camera.Line2D;
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

    private Camera camera;

    @FXML
    private Canvas viewport;

    public void initialize() {
        prepareBackground();
        camera = new Camera("src/resources/cube1.txt");
        camera.projectTo2D();
        camera.moveConstructionToCenter();
        draw();
    }

    @FXML
    public void recognizeOperation(KeyEvent k) {
        if (camera != null) {
            String key = k.getCode().toString();
            switch (key) {
                case "UP":
                    System.out.println("up");
                    camera.moveUp();
                    break;
                case "DOWN":
                    System.out.println("down");
                    camera.moveDown();
                    break;
                case "RIGHT":
                    System.out.println("right");
                    camera.moveRight();
                    break;
                case "LEFT":
                    System.out.println("left");
                    camera.moveLeft();
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
            camera.projectTo2D();
            camera.moveConstructionToCenter();
            draw();
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

    private void draw() {
        prepareBackground();
        GraphicsContext gc = viewport.getGraphicsContext2D();
        gc.beginPath();
        for (Line2D line : camera.getConstruction().getLines2D()) {
            gc.moveTo(line.getPoint1().getX(), line.getPoint1().getY());
            gc.lineTo(line.getPoint2().getX(), line.getPoint2().getY());
        }
        gc.stroke();
    }

}
