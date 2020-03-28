/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camera;

import java.io.FileNotFoundException;
import java.io.IOException;
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
    
    public Construction(String adress){
        try {
            ReadFile readFile = new ReadFile(adress);
            lines3D = readFile.load();
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found!");
        } catch (IOException e) {
            System.out.println("Wrong format of file!");
        }
    }

    public List<Line3D> getLines3D() {
        return lines3D;
    }
    
    public void addLine(Line3D line){
        lines3D.add(line);
    }
    
}
