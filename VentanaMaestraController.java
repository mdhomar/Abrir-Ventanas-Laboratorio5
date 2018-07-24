/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos.Ventanas;

import java.awt.ActiveEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import static org.omg.IOP.TransactionService.value;

/**
 * FXML Controller class
 *
 * @author MarceloDavid
 */
public class VentanaMaestraController implements Initializable {

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
     @FXML
    private AnchorPane Panel;

    @FXML
    private MenuBar menu;

    @FXML
    private MenuItem itmAutos;
    
    @FXML
    private SplitPane autosVentana;
    //autosVentana.setVisible (false);

  
    
    @FXML
    void abrirVentanaAutos (){
        try{
        itmAutos.setOnAction(new EventHandler<ActionEvent>(){
            
            public void handle (ActionEvent event){
                if(autosVentana.isVisible()==false){
                autosVentana.setVisible(true);
                }
                
            }
            
        });     
        
    }catch(NullPointerException e){
        e.printStackTrace();
    }

    }
   

    
    

    }



