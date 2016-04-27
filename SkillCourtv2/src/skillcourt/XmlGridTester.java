/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skillcourt;

import view.BasicNifty;
import view.ScScreenController;


/**
 *
 * @author Underscore
 */
public class XmlGridTester {
    
    
    
    public static void main(String[] args) throws Exception {
        
        
        
        GridInfo testGrid = new GridInfo("griddy", 8,5);
        xmlGrid gc = new xmlGrid();
        System.out.println(gc.gridOut(testGrid));
        
        
        ScScreenController SSC = new ScScreenController();

        BasicNifty runner = new BasicNifty(1024, 768);

        runner.getNifty().loadStyleFile("nifty-default-styles.xml");
        runner.getNifty().loadControlFile("nifty-default-controls.xml");

        runner.getNifty().fromXml("xml_screens/"+testGrid.getGridName()+".xml", testGrid.getGridName(), SSC);
        
        runner.gotoScreen(testGrid.getGridName());

        runner.renderLoop();
        runner.shutDown();
    }
    
    
    
}
