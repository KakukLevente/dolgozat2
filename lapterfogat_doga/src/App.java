/*
* File: App.java
* Author: Kakuk Levente
* Group: Szoft 1/1/N
* Date: 2023-04-06
* Github: https://github.com/KakukLevente/
* Licenc: GNU GPL
*/
import control.MainControl;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        MainControl mainController=new MainControl();
        Scene scene = new Scene(mainController.getMainPanel(),400,300);
        stage.setScene(scene);
        stage.show();        
        
    }
}
