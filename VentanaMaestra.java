/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos.Ventanas;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author MarceloDavid
 */
@SuppressWarnings("InitializerMayBeStatic")
public class VentanaMaestra extends Application {

    private EventHandler<ActionEvent> value;
    private MenuItem itmAutos;
  
    @Override
   public void start(Stage primaryStage){
       try{
       //instancio el panel, la escena y el escenario.-
       
       AnchorPane Panel = new AnchorPane();
       Panel = FXMLLoader.load(getClass().getResource("VentanaMaestra.fxml"));
       Scene scene = new Scene(Panel, 600, 400);
       primaryStage.setScene(scene);
       primaryStage.show();
             
       SplitPane autosVentana = new SplitPane ();
       autosVentana.setVisible(false);
       
       //instancio un menu
       MenuBar menu= new MenuBar();
       //instancio un menu abrirVentana
       Menu abrirVentana= new Menu ("Abrir Ventana");
       //instancio los items
       MenuItem itmAutos = new MenuItem("Autos");
       MenuItem itmVendedores = new MenuItem("Vendedores");
       MenuItem itmCompradores = new MenuItem("Compradores");
       //hago lo mismo con Ayuda
       Menu ayuda = new Menu ("Ayuda");
       MenuItem itmAyudaonline = new MenuItem("Ayuda on-line");
       MenuItem itmConfiguracion = new MenuItem("Configuración");
       MenuItem itmSalir = new MenuItem("Salir");
       //Adhiero los menu a la barra de menu
       menu.getMenus().addAll(abrirVentana, ayuda);
       //Adhiero los items a cada menu
       abrirVentana.getItems().addAll(itmAutos, itmVendedores, itmCompradores);
       ayuda.getItems().addAll(itmAyudaonline, itmConfiguracion, itmSalir);
       autosVentana.setVisible (false);
       }catch (IOException e) {

    // generic exception handling
    e.getCause().printStackTrace();
}            
   }
   
    

 
             
           
       //abrirVentanaAutos ();
   

    

/*    void abrirVentanaAutos() {
        
        itmAutos.setOnAction(new EventHandler<ActionEvent>(){
            private SplitPane autosVentana;
            
            public void handle (ActionEvent event){
                if(autosVentana.isVisible()==false){
                autosVentana.setVisible(true);
                }
                
            }
            
        });     
   
   }  */


    public static void main(String[] args) {
        launch(args);
    }
}
