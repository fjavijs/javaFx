/*
1º Realizar el esquema en scenebuilder, botones, listView, campos de texto y radiobutton por ese orden.
2º Ordenar carpetas con modelo vista-controlador y probar. 
3º Crear ListView<Motorhome> y metodo ObservableList.
    //Creamos un metodo observableList motorHomes.
    private ObservableList<MotorHome> motorHomes;
4º Inicializar.
    // Asociación del listview con el observableList motorHomes.
    motorHomes = FXCollections.observableArrayList();
    listView.setItems(motorHomes);
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import modelo.MotorHome;

/**
 *
 * @author Fco. Javier Jiménez Soler .
 */
public class VistaControlador implements Initializable {

// Botones.
    @FXML
    private Button agregar_BTN;
    @FXML
    private Button borrar_BTN;
    @FXML
    private Button BTodas_BTN;
    @FXML
    private Button limpiar_BTN;
    @FXML
    private Button imprimir_BTN;
// Fin Botones.

// ListView.   
    @FXML
    private ListView<MotorHome> listView;
    //Creamos un metodo observableList motorHomes.
    private ObservableList<MotorHome> motorHomes;
// Fin ListView.    

// Campos de texto.
    @FXML
    private TextField longitud_TF;
    @FXML
    private TextField marca_TF;
    @FXML
    private TextField modelo_TF;
    @FXML
    private TextField id_TF;
    @FXML
    private TextField alimpia_TF;
    @FXML
    private TextField aSucia_TF;
// Fin campos de texto.

// RadioButton estilo.    
    @FXML
    private RadioButton camper_RBTN;
    @FXML
    private ToggleGroup estilo;
    @FXML
    private RadioButton autocaravana_RBTN;
// Fin RadioButton estilo.

// RadioButton tipo.
    @FXML
    private RadioButton perfilada_RBTN;
    @FXML
    private RadioButton capuchina_RBTN;
    @FXML
    private RadioButton integral_RBTN;
    @FXML
    private ToggleGroup tipo;
// Fin radioButton tipo.  

    @Override
    public void initialize(URL url, ResourceBundle rb) {
// Asociación del listview con el observableList motorHomes.
        motorHomes = FXCollections.observableArrayList();
        listView.setItems(motorHomes);
    }

// Metodos
    @FXML
    private void agregar_BTN_OnAction(ActionEvent event) {
        
    }

    @FXML
    private void borrar_BTN_OnAction(ActionEvent event) {
    }

    @FXML
    private void BTodas_BTN_OnAction(ActionEvent event) {
    }

    @FXML
    private void limpiar_BTN_OnAction(ActionEvent event) {
    }

    @FXML
    private void imprimir_BTN_OnAction(ActionEvent event) {
    }

    @FXML
    private void camper_RBTN_OnAction(ActionEvent event) {
    }

    @FXML
    private void autocaravana_RBTN_OnAction(ActionEvent event) {
    }

    @FXML
    private void perfilada_RBTN_OnAction(ActionEvent event) {
    }

    @FXML
    private void integral_RBTN_OnAction(ActionEvent event) {
    }

    @FXML
    private void capuchina_RBTN_OnAction(ActionEvent event) {
    }

}
