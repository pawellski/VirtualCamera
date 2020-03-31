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

    private final double WIDTH = 1200.0;
    private final double HEIGHT = 600.0;
    private final double STEP = 10.0;
    private double VPD = 500.0;

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
            l.getPoint1().setY(l.getPoint1().getY() + STEP);
            l.getPoint2().setY(l.getPoint2().getY() + STEP);
        }
    }

    public void moveDown() {
        for (Line3D l : construction.getLines3D()) {
            l.getPoint1().setY(l.getPoint1().getY() - STEP);
            l.getPoint2().setY(l.getPoint2().getY() - STEP);
        }
    }

    public void projectTo2D() {
        construction.clearLines2D();
        for (Line3D l : construction.getLines3D()) {
            double x1 = l.getPoint1().getX() / (l.getPoint1().getZ() + VPD) * VPD;
            double y1 = l.getPoint1().getY() / (l.getPoint1().getZ() + VPD) * VPD;
            double x2 = l.getPoint2().getX() / (l.getPoint2().getZ() + VPD) * VPD;
            double y2 = l.getPoint2().getY() / (l.getPoint2().getZ() + VPD) * VPD;
            construction.addLine2D(new Line2D(new Point2D(x1, y1), new Point2D(x2, y2)));
        }
    }

    public void moveConstructionToCenter() {
        for (Line2D l : construction.getLines2D()) {
            l.getPoint1().setX(l.getPoint1().getX() + WIDTH / 2);
            l.getPoint1().setY(l.getPoint1().getY() + HEIGHT / 2);
            l.getPoint2().setX(l.getPoint2().getX() + WIDTH / 2);
            l.getPoint2().setY(l.getPoint2().getY() + HEIGHT / 2);
        }
    }

    public Construction getConstruction() {
        return construction;
    }
}
