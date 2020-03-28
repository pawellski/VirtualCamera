/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camera;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Paweł
 */
public class Construction {
    
    private List<Line3D> lines3D;
    private List<Line2D> lines2D;
    
    public Construction(){
        lines3D = new ArrayList<>();
    }

    public List<Line3D> getLines3D() {
        return lines3D;
    }
    
    public void addLine(Line3D line){
        lines3D.add(line);
    }
    
}
