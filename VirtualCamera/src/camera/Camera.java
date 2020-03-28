/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camera;

/**
 *
 * @author Paweł
 */
public class Camera {

    private final double STEP = 10.0;

    private Construction construction;

    public Camera(String adress) {
        construction = new Construction(adress);
    }

    public void moveRight() {
        for (Line3D l : construction.getLines3D()) {
            l.getPoint1().setX(l.getPoint1().getX() - STEP);
            l.getPoint2().setX(l.getPoint2().getX() - STEP);
        }
    }

    public void moveLeft() {

        for (Line3D l : construction.getLines3D()) {
            l.getPoint1().setX(l.getPoint1().getX() + STEP);
            l.getPoint2().setX(l.getPoint2().getX() + STEP);
        }
    }

    public void moveUp() {

        for (Line3D l : construction.getLines3D()) {
            l.getPoint1().setY(l.getPoint1().getY() - STEP);
            l.getPoint2().setY(l.getPoint2().getY() - STEP);
        }
    }

    public void moveDown() {
        for (Line3D l : construction.getLines3D()) {
            l.getPoint1().setX(l.getPoint1().getX() + STEP);
            l.getPoint2().setX(l.getPoint2().getX() + STEP);
        }
    }

}
